public class Patient extends Person {

    private String disease;

    public Patient(int id, String name, String disease) {
        super(id, name);
        this.disease = disease;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "Patient ID: " + id +
                ", Name: " + name +
                ", Disease: " + disease);
    }
}
