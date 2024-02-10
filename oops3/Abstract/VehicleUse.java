package oops3.Abstract;

public class VehicleUse {

    public static void main(String[] args) {
        // Vehicle v= new Vehicle();
        Vehicle v;
        // Car c = new Car();
        // v = new Car();

        // v.print();
        // System.out.println(v.isMotorized());
        // v = new Bicycle();
        // System.out.println(v.isMotorized());

        v = new BMW();
        System.out.println(v.getCompany());
    }
}
