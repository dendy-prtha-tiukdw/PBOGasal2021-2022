package minggu6;

public class Car extends Vehicle {
    public int numWheels;
    private double weight;

    public Car(){
        super();
        System.out.println("Car created");
    }
    public void goBackward(double speed, double accel) {
        System.out.println("Car go backward " + speed + " " + accel);
        super.goBackward(speed, accel);

    }
}
