import java.util.ArrayList;

public class Hospital {

    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addAppointment(Appointment a) {
        appointments.add(a);
    }

    public void viewPatients() {
        for (Patient p : patients)
            p.displayDetails();
    }

    public void viewDoctors() {
        for (Doctor d : doctors)
            d.displayDetails();
    }

    public void viewAppointments() {
        for (Appointment a : appointments)
            a.displayAppointment();
    }
}
