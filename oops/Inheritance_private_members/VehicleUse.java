package oops.Inheritance_private_members;

public class VehicleUse {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        // v.color= "Red";
        v.setColor("red");
        v.maxSpeed = 80;
        v.print();

        Car c = new Car();
        // c.color= "Black";
        c.setColor("black");
        c.maxSpeed = 100;
        c.numDoors = 4;
        // c.print();
        c.printCar();

        Bicycle b = new Bicycle();
        b.print();
    }
}
