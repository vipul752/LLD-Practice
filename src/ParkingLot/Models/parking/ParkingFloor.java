package ParkingLot.Models.parking;

import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSlot> parkingSlots;

   public boolean addParkingSlot(ParkingSlot parkingSlot){
       return false;
   }

   public int getFloor(){return this.floorNumber;}

   public void setFloorNumber(int floor){
       this.floorNumber = floor;
   }

   public List<ParkingSlot> getParkingSlots() {
       return this.parkingSlots;
   }
}
