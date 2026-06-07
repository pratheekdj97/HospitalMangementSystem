public class Main {

    public static void main(String[] args) {

        Person p1 = new Patient(1, "arun", "Fever");
        Person p2 = new Doctor(101, "Dr. Joy", "Primary care");

        System.out.println(" Patient Details ");
        p1.displayDetails();

        System.out.println("\n Doctor Details ");
        p2.displayDetails();

        Appointment a1 = new Appointment(
                1001,
                "Rahul",
                "Dr. Joy"
        );

        System.out.println("\nAppointment Details");
        a1.displayAppointment();

        Hospital h1 = new Hospital();


        h1.addPatient((Patient) p1);
        h1.addDoctor((Doctor) p2);

    
        h1.addAppointment(a1);

        System.out.println("\n Hospital Patients ");
        h1.viewPatients();

        System.out.println("\n Hospital Doctors ");
        h1.viewDoctors();

        System.out.println("\n Hospital Appointments ");
        h1.viewAppointments();
    }
}