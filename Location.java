public class Location{
   //status constants (whether the player got a hit or missed)
   public static final int UNGUESSED = 0;
   public static final int HIT = 1;
   public static final int MISSED = 2;

   //instance variables
   private int status;
   private boolean shipPresent;

   // Location constructor.
   public Location(){
      status = UNGUESSED;
      shipPresent = false;
   }

   // Was this Location a hit?
   public boolean checkHit(){
      if(status == HIT){
         return true;
      }
      return false;
   }

   // Was this location a miss?
   public boolean checkMiss(){
      if(status == MISSED){
         return true;
      }
      return false;
   }

   // Was this location unguessed?
   public boolean isUnguessed(){
      if(status == UNGUESSED){
         return true;
      }
      return false;
   }

   // Mark this location a hit.
   public void markHit(){
      status = HIT;
   }

   // Mark this location a miss.
   public void markMiss(){
      status = MISSED;
   }

   // Return whether or not this location has a ship.
   public boolean hasShip(){
      if(shipPresent == true){
         return true;
      }
      return false;
   }

   // Set the value of whether this location has a ship.
   public void setShip(boolean val){
      shipPresent = val;
   }

   // Set the status of this Location.
   public void setStatus(int status){
      this.status = status;
   }

   // Get the status of this Location.
   public int getStatus(){
      return status;
   }
}
