package ParkingLot.Models.mobility;

public abstract class Vehicle {
    private final String registrationNumber;
    private String color;
    private VehicleType type;

    public Vehicle(String registrationNumber,String color,VehicleType type){
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.type = type;
    }

    //getter and setter
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
