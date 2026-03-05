package cesde;

import java.util.Scanner;

public class Lounge {
    Scanner sc = new Scanner(System.in);

    // Atributes

    int id;
    int classroom;
    int floor;
    int capacity;
    boolean status;

    //Constructores


    public Lounge(int id) {
        this.id = id;
    }

    public Lounge( int id, int classroom, int floor, int capacity, boolean status) {
        this.id = id;
        this.classroom = classroom;
        this.floor = floor;
        this.capacity = capacity;
        this.status = status;
    }

    //Getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // methods


    public Lounge createLounge (Lounge lounge) {

        System.out.println("Enter id of lounge ");
        while (!sc.hasNextInt()){
            System.out.println("The ID must be a number. Please try again: ");
            sc.next();
        }
        int id = sc.nextInt();
        lounge.setId(id);
        sc.nextLine();

        System.out.println("Enter classroom in numbers");

        int classroom = sc.nextInt();
        lounge.setClassroom(classroom);

        System.out.println("Enter floor in numbers");
        int floor = sc.nextInt();
        lounge.setFloor(floor);

        System.out.println("Enter capacity in numbers");
        int capacity = sc.nextInt();
        lounge.setCapacity(capacity);
        sc.nextLine();

        return lounge;

    }

    private void getLoungeById(int id) {
        if (id == this.id){
            System.out.println("Id: " + this.id + "\n" +
            "Classroom: #" + this.classroom + "\n"+
            "Floor: "+ this.floor + "\n"+
            "Capacity: " + this.capacity + " students"+ "\n"+
            "Status: " + this.status);
        }else{
            System.out.println("Id not found");

        }
    }
}
