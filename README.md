# Hospital Management System

A simple Java-based Hospital Management System built using Object-Oriented Programming (OOP) concepts.

## Features

- Add Patient
- Add Doctor
- Book Appointment
- View Patients
- View Doctors
- View Appointments
- Search Patient by ID
- Delete Patient

## OOP Concepts Used

### Inheritance
- `Patient` and `Doctor` inherit from `Person`.

### Abstraction
- `Person` is an abstract class.

### Polymorphism
- `displayDetails()` is overridden in child classes.

### Encapsulation
- Data members are kept private/protected and accessed through methods.

## Classes

### Person.java
Abstract base class containing:
- id
- name
- displayDetails()

### Patient.java
Stores:
- Patient ID
- Name
- Disease

### Doctor.java
Stores:
- Doctor ID
- Name
- Specialization

### Appointment.java
Stores:
- Appointment ID
- Patient Name
- Doctor Name

### Hospital.java
Manages:
- Patients
- Doctors
- Appointments
- Search Patient
- Delete Patient

### Main.java
Menu-driven user interface.

## Technologies Used

- Java
- ArrayList
- VS Code

## Sample Menu

```text
1. Add Patient
2. Add Doctor
3. Book Appointment
4. View Patients
5. View Doctors
6. View Appointments
7. Search Patient
8. Remove Patient
9. Exit
```

## How to Run

1. Clone the repository
2. Open the project in VS Code
3. Compile:

```bash
javac *.java
```

4. Run:

```bash
java Main
```

## Author

Pratheek DJ
