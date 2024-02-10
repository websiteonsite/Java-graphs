package oops.Function_Overloading;

public class Car extends Vehicle {

    int numDoors;

    public void printCar() {
        System.out.println("Car " + " color " + getColor() + " maxspeed " + maxSpeed + " numdoors " + numDoors);
    }
}
