public class Doctor extends Person {

    private String specialization;

    public Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "Doctor ID: " + id +
                ", Name: " + name +
                ", Specialization: " + specialization);
    }
}
