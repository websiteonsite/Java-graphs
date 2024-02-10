package oops.Classcast_ObjectClass;

public class Vehicle {

  private String color;
  public int maxSpeed;

  public Vehicle(int maxSpeed) {
    System.out.println(" maxSpeed " + maxSpeed);
  }

  public Vehicle() {
    System.out.println("Vehicle ");
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