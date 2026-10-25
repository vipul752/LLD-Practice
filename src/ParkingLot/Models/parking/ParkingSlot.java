package ParkingLot.Models.parking;

import ParkingLot.Models.mobility.Vehicle;
import ParkingLot.Models.mobility.VehicleType;

import java.util.List;
import java.util.Optional;

public abstract class ParkingSlot {
    private final List<VehicleType> supportedVehicleType;
    private ParkingSlotStatus status;
    private final int slotNumber;
    private ParkingFloor floor;
    private Optional<Vehicle> vehicle;

    public ParkingSlot(int slotNumber,ParkingFloor floor,List<VehicleType> supportedVehicleType){
        this.slotNumber = slotNumber;
        this.floor = floor;
        this.status = ParkingSlotStatus.EMPTY;
        this.floor.addParkingSlot(this);
        this.supportedVehicleType = supportedVehicleType;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public ParkingSlotStatus getStatus() {
        return status;
    }

    public List<VehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }


    public void setStatus(ParkingSlotStatus status) {
        this.status = status;
    }
    public boolean isAvailable(){
        return this.status == ParkingSlotStatus.EMPTY;
    }

    public Optional<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(Optional<Vehicle> vehicle) {
        boolean isSupportedVehicle = supportedVehicleType.contains(vehicle.get().getType());
        if(isSupportedVehicle){
            this.vehicle = vehicle;
            this.status = ParkingSlotStatus.OCCUPIED;
        }
        System.out.println("Vehicle Type Not Supported");
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public void setFloor(ParkingFloor floor) {
        this.floor = floor;
    }

    public void removeVehicle(){
        this.vehicle = Optional.empty();
        this.status = ParkingSlotStatus.EMPTY;
    }
}
