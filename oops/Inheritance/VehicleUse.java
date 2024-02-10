package oops.Inheritance;

public class VehicleUse {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.color = "Red";
        v.maxSpeed = 90;
        v.print();

        Car c = new Car();
        c.color = "Black";
        c.maxSpeed = 100;
        c.numDoors = 4;
        c.print();

        Bicycle b = new Bicycle();
        b.print();
    }
}
