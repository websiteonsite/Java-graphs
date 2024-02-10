package oops.Polymorphism;

public class VehicleUse {

  public static void main(String[] args) {

    Vehicle v = new Car(4, 100);
    v.maxSpeed = 120;
    v.setColor("white");
    // v.numDoors = 4;
    v.print();
  }
}
