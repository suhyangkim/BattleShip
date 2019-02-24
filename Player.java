public class Player{
   // lengths of all of the ships.
   private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};

   //constant variables
   public Ship[] userShips = new Ship[5];
   private Grid user;
   private Grid opponent;

   //player constructor
   public Player(){
      user = new Grid();
      opponent = new Grid();
      for(int i = 0; i < SHIP_LENGTHS.length; i++){
         Ship current = new Ship(SHIP_LENGTHS[i]);
         userShips[i] = current;
      }
   }

   //sets the users board
   public void chooseShipLocation(Ship s, int row, int col, int direction){
      s.setDirection(direction);
      s.setLocation(row, col);
      user.addShip(s);
   }

   //prints users board status
   public void printUserBoardStatus(){
      user.printStatus();
   }

   //prints opponent board status
   public void printOpponentBoardStatus(){
      opponent.printStatus();
   }

   //randomly place opponent's ships
   public void randomizeOpponentsShips(){
      for(int i = 0; i < userShips.length; i++){
         Ship current = userShips[i];
         Randomizer guessRow = new Randomizer();
         int row = guessRow.nextInt()*11;

         Randomizer guessCol = new Randomizer();
         int col = guessCol.nextInt()*11;
      }
   }

   //takes in an opponent guess for a row, col location, and records the
   //guess, and returns a boolean indicating whether the guess was a hit.
   public boolean recordOpponentGuess(int row, int col){
      Location guess = user.get(row, col);
      if(guess.hasShip()){
         guess.markHit();
         return true;
      }
      guess.markMiss();
      return false;
   }

   //takes in an your guess for a row, col location, and records the
   //guess, and returns a boolean indicating whether the guess was a hit.
   public boolean recordUsersGuess(int row, int col){
      Location guess = opponent.get(row, col);
      if(guess.hasShip()){
         guess.markHit();
         return true;
      }
      guess.markMiss();
      return false;
   }
}
