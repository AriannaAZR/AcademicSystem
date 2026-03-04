package cesde;

import java.util.List;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);


    // Atributes

    private int id;
    private String name;
    private String lastName;
    private String email;
    private boolean status;

    //Constructores

    public Student() {

    }

    public Student(String email) {
        this.email = email;  //This funciona como un apuntador
    }

    public Student(int id, String name, String lastName, String email, boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.status = status;
        this.lastName = lastName;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    // methods
    private Student createStudent(Student student) {//Inyeccion de dependencias
        System.out.println("Enter the student ID");
        while (!sc.hasNextInt()) {
            System.out.println("The ID must be a number. Please try again: ");
            sc.next();
        }
        int id = sc.nextInt();
        student.setId(id);
        sc.nextLine();


        System.out.println("Enter the student name");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("Enter the student last name");
        String lastName = sc.nextLine();
        student.setLastName(lastName);


        System.out.println("Enter the student email address");
        String email = sc.nextLine();
        while (!email.contains("@") || !email.contains(".")) {
            System.out.println("Error: Invalid email format. Must contain '@' and a domain (ej: estudiante@cesde.edu.co)");
            System.out.print("Try again: ");
        }


            student.setEmail(email);


            return student;

        }



        private void getStudentById ( int id){
            if (id == this.id) {
                System.out.println("Id: " + this.id + "\n" +
                        "Name: " + this.name + "\n" +
                        "Email: " + this.email + "\n" +
                        "Status" + this.status);
            } else {
                System.out.println("Id not found");
            }

        }


        private List<Student> getStudents () {
            return null;
        }

        private Student updateStudent (Student student){
            return student;
        }

        private void deleteStudent ( int id){

        }

    }

