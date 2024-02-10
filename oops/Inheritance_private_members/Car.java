package oops.Inheritance_private_members;

public class Car extends Vehicle {

    int numDoors;

    public void printCar() {
        System.out.println("Car " + " color " + getColor() + " maxspeed " + maxSpeed + " numdoors " + numDoors);
    }
}
