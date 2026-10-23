package HospitalManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor {
    private String name;
    private String spec;
    private final List<Appointment> appointments = new ArrayList<>();

    public Doctor(String name,String spec) {
        this.name = name;
        this.spec= spec;
    }

    public void addAppointment(Appointment appt){
        appointments.add(appt);
    }

    public String getSpecialization() {return spec;}

    public List<Patient> getPatients() {
        return appointments.stream()
                .map(appointment -> appointment.getPatient())
                .distinct()
                .collect(Collectors.toList());
    }

    public String getName() { return name; }
    public List<Appointment> getAppointments() { return appointments; }

}
