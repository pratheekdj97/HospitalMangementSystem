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

    public void searchPatient(int id) {

    boolean found = false;

    for (int i = 0; i < patients.size(); i++) {

        Patient p = patients.get(i);

        if (p.getId() == id) {
            p.displayDetails();
            found = true;
        }
    }
    

    if (found == false) {
        System.out.println("Patient Not Found");
    }
    }

    public void deletePatient(int id) {

    for (int i = 0; i < patients.size(); i++) {

        if (patients.get(i).getId() == id) {

            patients.remove(i);

            System.out.println("Patient Deleted");

            return;
        }
    }

}
}

