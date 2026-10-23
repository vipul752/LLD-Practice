package HospitalManagement;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private Room room;
    private String time;

    public Appointment(Doctor doctor, Patient patient, Room room, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.room = room;
        this.time = time;
        doctor.addAppointment(this);
        patient.addAppointment(this);
    }

    public Doctor getDoctor() { return doctor; }
    public Patient getPatient() { return patient; }
    public Room getRoom() { return room; }
    public String getTime() { return time; }
}
