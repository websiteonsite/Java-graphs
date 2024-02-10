package oops.Inheritance_and_Constructors;

public class Vehicle {

  private String color;
  public int maxSpeed = 100;

  public Vehicle(int maxSpeed) {
    System.out.println("Vehicle1 Constructor");
    this.maxSpeed = maxSpeed;
  }

  public Vehicle() {
    System.out.println("Vehicle2 Constructor");
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void print() {
    System.out.println("Vehicle " + " color " + color + " maxSpeed " + maxSpeed);
  }
}
