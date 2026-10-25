package ParkingLot.Models.mobility;

public class ElectricCar extends Vehicle implements ElectricVehicle{
    public ElectricCar(String registrationNumber,String color){
        super(registrationNumber,color,VehicleType.ELECTRIC_CAR);
    }

    @Override
    public void charge() {
        System.out.println("Charging the electric car...");
    }

    @Override
    public float getBatteryLevel() {
        // Implementation for getting the battery level of the electric car
        return 0.0f;
    }
}
