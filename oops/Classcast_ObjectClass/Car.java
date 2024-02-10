package oops.Classcast_ObjectClass;

public class Car extends Vehicle {

    int numDoors;
    int maxSpeed;

    public Car(int numDoors, int maxSpeed) {
        System.out.println("numdoors " + numDoors + " maxSpeed " +
                maxSpeed);
    }

    public void print() {
        super.print();
        System.out.println("Car " + " numdoors " + numDoors);
    }

    public void printMaxspeed() {
        super.maxSpeed = 150;
        System.out.println(maxSpeed + " " + super.maxSpeed);
    }
}
