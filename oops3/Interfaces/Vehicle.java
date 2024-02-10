package oops3.Interfaces;

//Interfaces Introduction, Interfaces and Inheritance

public class Vehicle implements VehicleInterface {

  @Override
  public boolean isMotorized() {
    return false;
  }

  @Override
  public String getCompany() {
    return null;
  }

  void print() {
    System.out.println(PI);
  }

  @Override
  public int numGears() {
    return 5;
  }

}
