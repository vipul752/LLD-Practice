package ParkingLot.Models.mobility;

public class ElectricBike extends  Vehicle implements  ElectricVehicle{
    public ElectricBike(String registrationNumber,String color){
        super(registrationNumber,color,VehicleType.ELECTRIC_BIKE);
    }

    @Override
    public void charge() {
        System.out.println("Charging the electric bike...");
    }

    @Override
    public float getBatteryLevel() {
        return 0;
    }
}
