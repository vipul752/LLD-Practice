package HospitalManagement;

public class Main {
    static void main(String[] args) {
        Doctor drSmith = new Doctor("Dr. Smith", "Cardiology");
        Doctor drPatel = new Doctor("Dr. Patel", "Neurology");

        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        Room room101 = new Room("101", 1);
        Room room205 = new Room("205", 2);

        new Appointment(drSmith, alice, room101, "9:00 AM");
        new Appointment(drSmith, bob, room101, "10:00 AM");
        new Appointment(drPatel, alice, room205, "2:00 PM");

        System.out.println(drSmith.getName() + "'s patients:");
        for (Patient p : drSmith.getPatients()) {
            System.out.println("  - " + p.getName());
        }

        System.out.println(alice.getName() + "'s doctors:");
        for (Doctor d : alice.getDoctors()) {
            System.out.println("  - " + d.getName() + " (" + d.getSpecialization() + ")");
        }

        System.out.println(drSmith.getName() + "'s schedule:");
        for (Appointment a : drSmith.getAppointments()) {
            System.out.println("  - " + a.getTime() + " with " + a.getPatient().getName()
                    + " in Room " + a.getRoom().getNumber());
        }
    }
}
