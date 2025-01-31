package oops3.FinalKeyword;

public class Vehicle {

  final private String color;
  int maxSpeed;

  public Vehicle() {
    color = "red";
    System.out.println("Vehicle1's Constructor");
    maxSpeed = 60;
  }

  public Vehicle(int maxSpeed) {
    color = "red";
    System.out.println("Vehicle's Constructor");
    this.maxSpeed = maxSpeed;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void print() {
    System.out.println("Vehicle " + "color : " + color);
  }
}
