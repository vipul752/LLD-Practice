package HospitalManagement;

public class Room {
    private int floor;
    private String number;

    public Room(String number, int floor){

        this.number = number;
        this.floor = floor;
    }

    public int getFloor(){
        return this.floor;
    }

    public String getNumber(){
        return this.number;
    }
}
