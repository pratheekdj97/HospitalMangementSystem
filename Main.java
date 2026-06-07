import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital h1 = new Hospital();

        int choice;

        do {

            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("7. Search patient");
            System.out.println("8. Remove patient");
            System.out.println("9. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    Patient p = new Patient(
                            pid,
                            pname,
                            disease
                    );

                    h1.addPatient(p);

                    System.out.println("Patient Added Successfully");
                    break;

                case 2:

                    System.out.print("Enter Doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String dname = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String specialization = sc.nextLine();

                    Doctor d = new Doctor(
                            did,
                            dname,
                            specialization
                    );

                    h1.addDoctor(d);

                    System.out.println("Doctor Added Successfully");
                    break;

                case 3:

                    System.out.print("Enter Appointment ID: ");
                    int aid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String patientName = sc.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String doctorName = sc.nextLine();

                    Appointment a = new Appointment(
                            aid,
                            patientName,
                            doctorName
                    );

                    h1.addAppointment(a);

                    System.out.println("Appointment Booked Successfully");
                    break;

                case 4:

                    System.out.println("\n--- PATIENTS ---");
                    h1.viewPatients();
                    break;

                case 5:

                    System.out.println("\n--- DOCTORS ---");
                    h1.viewDoctors();
                    break;

                case 6:

                    System.out.println("\n--- APPOINTMENTS ---");
                    h1.viewAppointments();
                    break;

                case 7:

                    

                    System.out.print("Enter Patient ID: ");
                    int searchId = sc.nextInt();
                    h1.searchPatient(searchId);
                    break;

                case 8:

                    System.out.print("Enter Patient ID: ");
                    int deleteId = sc.nextInt();

                    h1.deletePatient(deleteId);

                      break;

                case 9:

                    System.out.println("Thank You");
                     return;
                    

                default:

                    System.out.println("Invalid Choice");
            }


        } while (choice != 7);

        sc.close();
    }
}