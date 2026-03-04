package cesde;

import java.util.Scanner;

public class School {
    Scanner sc = new Scanner(System.in);

    // Atributes

    private int id;
    private String schoolName;
    private String director;

    //Constructores

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public School(int id, String director) {
        this.id = id;
        this.director = director;
    }

    //Getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    private School createSchool(School school) {
        System.out.println("Enter id of School: ");
        while (!sc.hasNextInt()){
            System.out.println("The ID must be a number. Please try again: ");
            sc.next();
        }
        int id = sc.nextInt();
        school.setId(id);
        sc.nextLine();

        System.out.println("Enter name of School: ");
        String schoolName = sc.nextLine();
        school.setSchoolName(schoolName);

        System.out.println("Enter director of School: ");
        String director = sc.nextLine();
        school.setDirector(director);

     return school;
    }

    private void getSchoolById(int id){
        if (id == this.id){
            System.out.println("Id: " + this.id + "\n"+
                    "Name of school: " + this.schoolName + "\n"+
                    "Director: " + this.director + "\n");
        }else{
            System.out.println("Id not found");
        }

    }




}
