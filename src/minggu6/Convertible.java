package minggu6;

public class Convertible extends Car {
    private int numWheels;
    public Convertible(){
        super();
        System.out.println("convertible created");
    }

    public boolean lowerRoof() {
        super.numWheels = 3;
        return false;
    }

    public boolean raiseRoof() {
        return false;
    }
}
