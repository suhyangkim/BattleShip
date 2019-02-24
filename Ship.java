public class Ship{
   // direction constants
   public static final int UNSET = -1;
   public static final int HORIZONTAL = 0;
   public static final int VERTICAL = 1;

   // instance variables
   private int row = 0;
   private int col = 0;
   private int length = 0;
   private int direction = UNSET;

   // constructor :: create a ship and set the length.
   public Ship(int length){
      this.length = length;
   }

   // has the location been initialized?
   public boolean isLocationSet(){
      if(row != 0 && col != 0){
         return true;
      }
      return false;
   }

   // has the direction been initialized?
   public boolean isDirectionSet(){
      if(direction != UNSET){
         return true;
      }
      return false;
   }

   // sets the location of the ship.
   public void setLocation(int row, int col){
      this.row = row;
      this.col = col;
   }

   // sets the direction of the ship.
   public void setDirection(int direction){
      this.direction = direction;
   }

   // gets the row value.
   public int getRow(){
      return row;
   }

   // get the column value.
   public int getCol(){
      return col;
   }

   // gets the length of the ship.
   public int getLength(){
      return length;
   }

   // gets the direction.
   public int getDirection(){
      return direction;
   }

   // helper method to get a String value from the direction
   private String directionToString(){
      if(getDirection() == UNSET){
         return "Direction is unset.";
      } else if(getDirection() == HORIZONTAL){
         return "Direction is horizontal";
      } else{
         return "Direction is vertical";
      }
   }

   // helper method to get a (row, col) String value from the location
   private String locationToString(){
      return "The location is (" + row + ", " + col + ").";
   }

   // toString value for this Ship
   public String toString(){
      if(getDirection() == UNSET){
         return "Unset ship of length " + length + " and positioned at (" +
            row + ", " + col + ").";
      } else if(getDirection() == HORIZONTAL){
         return "Horizontal ship of length " + length + " and positioned at (" +
            row + ", " + col + ").";
      } else{
         return "Vertical ship of length " + length + " and positioned at (" +
            row + ", " + col + ").";
      }
   }
}
