package oops.Inheritance_and_Constructors;

public class Car extends Vehicle {

    int numDoors;
    // int maxSpeed;

    public Car(int numDoors, int maxspeed) {
        // super(maxspeed);
        System.out.println("Car1 Constructor");
        this.numDoors = numDoors;
    }

    // public Car() {
    // System.out.println("Car2 Constructor");
    // }

    public void print() {
        super.print();
        System.out.println("Car " + " numdoors " + numDoors);
    }

    public void printMaxspeed() {
        super.maxSpeed = 15;
        System.out.println(maxSpeed + " " + super.maxSpeed);
    }
}
