package main;

import cesde.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student studentEntity = new Student();
        Teacher teacherEntity = new Teacher(0,"","","",true);
        School schoolEntity = new School("");
        Course courseEntity = new Course("");
        Lounge loungeEntity = new Lounge(0);
        Enrollment enrollmentEntity = new Enrollment();

        int option = 0;

        System.out.println("---- CESDE ACADEMIC SYSTEM ----");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Register Student");
            System.out.println("2. Register Course (Inc. Teacher & School)");
            System.out.println("3. Create Enrollment (Process Enrollment)");
            System.out.println("4. Show Enrollment Details");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                sc.next();
            }
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    studentEntity.createStudent(studentEntity);
                    System.out.println("Student registered successfully!");
                    break;

                case 2:
                    teacherEntity.createTeacher(teacherEntity);
                    courseEntity.createCourse(courseEntity);

                    courseEntity.setTeacher(teacherEntity);
                    System.out.println("Course, Teacher and School linked successfully!");
                    break;

                case 3:
                    loungeEntity.createLounge(loungeEntity);
                    courseEntity.setTeacher(teacherEntity);

                    enrollmentEntity.createEnrollment(enrollmentEntity);

                    enrollmentEntity.setStudent(studentEntity);
                    enrollmentEntity.setCourse(courseEntity);
                    enrollmentEntity.setLounge(loungeEntity);
                    System.out.println("Enrollment completed!");
                    break;

                case 4:
                    System.out.print("Enter Enrollment ID to search: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    enrollmentEntity.getEnrollmentById(searchId);

                    break;

                case 5:
                    System.out.println("Exiting system... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 5);

        sc.close();
    }

}
