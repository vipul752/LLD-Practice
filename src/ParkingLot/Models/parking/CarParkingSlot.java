package ParkingLot.Models.parking;

import ParkingLot.Models.mobility.VehicleType;

import java.util.Arrays;

public class CarParkingSlot extends ParkingSlot implements CarSlot {

    public CarParkingSlot(int slotNumber,ParkingFloor floor){
        super(slotNumber,floor, Arrays.asList(VehicleType.CAR,VehicleType.BIKE));
    }


}
