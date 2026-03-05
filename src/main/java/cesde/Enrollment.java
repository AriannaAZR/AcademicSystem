package cesde;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Enrollment {
    Scanner sc = new Scanner(System.in);

    // Atributes

    private int id;
    private LocalDate date;
    private Student student;
    private Course course;
    private Lounge lounge;
    private boolean status;


    //Constructores

    public Enrollment() {}


    public Enrollment(int id, LocalDate date, Student student, Course course, Lounge lounge, boolean status) {
        this.id = id;
        this.date = date;
        this.student = student;
        this.course = course;
        this.lounge = lounge;
        this.status = status;
    }

    // Getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Lounge getLounge() {
        return lounge;
    }

    public void setLounge(Lounge lounge) {
        this.lounge = lounge;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Enrollment createEnrollment(Enrollment enrollment){

        System.out.println("Enter id of enrollment");
        while (!sc.hasNextInt()){
            System.out.println("The ID must be a number. Please try again: ");
            sc.next();
        }
        int id= sc.nextInt();
        enrollment.setId(id);
        sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter date of enrollment (DD/MM/YYYY) ");
        String date = sc.nextLine();
        enrollment.setDate(LocalDate.parse(date, formatter));

        System.out.println("Enter student of enrollment");
        String student = sc.nextLine();
        enrollment.setStudent(new Student(student));

        System.out.println("Enter course of enrollment");
        String course = sc.nextLine();
        enrollment.setCourse(new Course(course));

        System.out.println("Enter lounge of enrollment");
        int lounge = sc.nextInt();
        enrollment.setLounge(new Lounge(lounge));
        sc.nextLine();

        return enrollment;
    }

    public void getEnrollmentById(int id) {
        if (id == this.id) {
            System.out.println("Id: " + this.id + "\n" +
                    "Date: " + this.date + "\n" +
                    "Name of student: " + this.student.getName() + "\n" +
                    "Course" + this.course.getName() + "\n" +
                    "Lounge: " + this.lounge.getId() + "\n" +
                    "Status: " + this.status);
        }else {
            System.out.println("Id not found.");
        }
    }
}




