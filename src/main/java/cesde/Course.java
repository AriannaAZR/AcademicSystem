package cesde;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Course {
    Scanner sc = new Scanner(System.in);



    // Atributes

    private int id;
    private String name;
    private String program;
    private School school;
    private Teacher teacher;
    private LocalDate startDate;
    private LocalDate endDate;

    //Constructores


    public Course(String name) {
        this.name = name;
    }

    public Course(int id, String program, School school, Teacher teacher, LocalDate starDate, LocalDate endDate) {
        this.id = id;
        this.program = program;
        this.school = school;
        this.teacher = teacher;
        this.startDate = starDate;
        this.endDate = endDate;
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

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // methods

    private Course createCourse(Course course) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter id of course: ");
        course.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter name of course: ");
        String name = sc.nextLine();
        course.setName(name);

        System.out.println("Enter program of course: ");
        String program = sc.nextLine();
        course.setProgram(program);

        System.out.println("Enter school of course: ");
        String schoolName = sc.nextLine();

        School newSchool = new School(schoolName);
        course.setSchool(newSchool);

       System.out.println("Enter teacher of course: ");
        String teacherName = sc.nextLine();

        Teacher newTeacher = new Teacher(teacherName);
        course.setTeacher(newTeacher);

        System.out.println("Enter start date of course (DD/MM/YYYY) ");
        String startDate = sc.nextLine();
        course.setStartDate(LocalDate.parse(startDate, formatter));


        System.out.println("Enter end date  of course (DD/MM/YYYY) ");
        String endDate = sc.nextLine();
        course.setEndDate(LocalDate.parse(endDate, formatter));

            return this;
        }


        private void getCourseById(int id){
        if (id == this.id){
            System.out.println("Id: " + this.id + "\n"+
                    "Name: " + this.name + "\n"+
                    "Program: " + this.program + "\n"+
                    "School" +  this.school + "\n" +
                    "Teacher: " + this.teacher + "\n"+
                    "StartDate: " + this.startDate + "\n"+
                    "EndDate" +  this.endDate);
        }else{
            System.out.println("Id not found");
        }

    }



    }

