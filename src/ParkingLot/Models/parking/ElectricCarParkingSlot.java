package ParkingLot.Models.parking;

import ParkingLot.Models.mobility.VehicleType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectricCarParkingSlot extends ParkingSlot implements ElectricSlot{

    public ElectricCarParkingSlot(int slotNumber, ParkingFloor floor){
        super(slotNumber, floor, Arrays.asList(VehicleType.ELECTRIC_BIKE,VehicleType.ELECTRIC_CAR));
    }

    @Override
    public void vehicleCharge() {
        System.out.println("Charging electric vehicle...");
    }
}
