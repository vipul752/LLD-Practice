package HospitalManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Patient {
    private String name;
    private final List<Appointment> appointments = new ArrayList<>();


    public Patient(String name) {
        this.name = name;
    }

    public void addAppointment(Appointment appt){
        appointments.add(appt);
    }


    public List<Doctor> getDoctors() {
        return appointments.stream()
                .map(Appointment::getDoctor)
                .distinct()
                .collect(Collectors.toList());
    }

    public String getName() { return name; }
    public List<Appointment> getAppointments() { return appointments; }
}
