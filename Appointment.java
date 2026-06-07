public class Appointment {

    private int appointmentId;
    private String patientName;
    private String doctorName;

    public Appointment(int appointmentId,
                       String patientName,
                       String doctorName) {

        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
    }

    public void displayAppointment() {

        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Doctor Name: " + doctorName);
    }
}