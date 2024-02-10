package oops.Polymorphism;

public class Vehicle {

  private String color;
  public int maxSpeed;

  public Vehicle(int maxSpeed) {
    System.out.println("Vehicle1's Constructor");
    this.maxSpeed = maxSpeed;
  }

  public Vehicle() {
    System.out.println("Vehicle2's Constructor");
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
