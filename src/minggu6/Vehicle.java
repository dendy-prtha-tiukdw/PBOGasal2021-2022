package minggu6;

public class Vehicle {

    public Vehicle(){

        System.out.println("Vehicle created");
    }
    public void goBackward(double speed, double accel){
        System.out.println("Vehicle go backward " + speed + " " + accel);
    }

    public void goForward(double speed, double accel){

    }

    public boolean start(){
        return false;
    }

    public void stop(){
        System.out.println("vehicle Stop");
    }
}
