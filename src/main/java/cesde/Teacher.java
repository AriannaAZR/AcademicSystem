package cesde;

import java.util.Scanner;

public class Teacher {
    Scanner sc = new Scanner (System.in);

    // Atributes

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String specialty;
    private boolean status;

    //Constructores

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(int id, String lastName, String email, String specialty, boolean status) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.specialty = specialty;
        this.status = status;
    }

    //Getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Methods

    public Teacher createTeacher(Teacher teacher) {
        System.out.println("Enter the teacher ID");
        while (!sc.hasNextInt()){
            System.out.println("The ID must be a number. Please try again: ");
            sc.next();
        }
        int id = sc.nextInt();
        teacher.setId(id);
        sc.nextLine();

        System.out.println("Enter the teacher name");
        String name = sc.nextLine();
        teacher.setName(name);

        System.out.println("Enter the teacher last name");
        String lastName = sc.nextLine();
        teacher.setLastName(lastName);

        System.out.println("Enter the teacher email address");
        String email = sc.nextLine();
        while (!email.contains("@") || !email.contains(".")) {
            System.out.println("Error: Invalid email format. Must contain '@' and a domain (ej: profesor@cesde.edu.co)");
            System.out.print("Try again: ");
            email = sc.nextLine();
        }

        teacher.setEmail(email);
        teacher.setStatus(true);


        System.out.println("Enter the teacher specialty");
        String specialty = sc.nextLine();
        teacher.setSpecialty(specialty);

        return teacher;
    }

    public void getTeacherById(int id){
        if (id == this.id){
            System.out.println("Id: " + this.id + "\n" +
             "Name: " + this.name + "\n" +
             "Last Name: " + this.lastName + "\n" +
             "Email: " + this.email + "\n" +
             "Specialty: " + this.specialty + "\n" +
             "Status: " + this.status);
        }else {
            System.out.println("Id not found");
        }
    }
}
