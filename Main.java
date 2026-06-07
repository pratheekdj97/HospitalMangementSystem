public class Main {

    public static void main(String[] args) {

        Person p1 = new Patient(
                1,
                "Rahul",
                "Fever");

        Person p2 = new Doctor(
                101,
                "Dr. Joy",
                "Cardiology");

        p1.displayDetails();
        p2.displayDetails();
    }
}