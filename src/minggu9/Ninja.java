package minggu9;

public class Ninja extends Enemy{

    public Ninja(boolean isBoss,
                 int healthPoint,
                 int moveSpeed){
        this.healthPoint = healthPoint;
        this.isBoss = isBoss;
        this.moveSpeed = moveSpeed;
        System.out.println("Ninja Created");
    }

    @Override
    void getInfo() {
        System.out.println("Ninja");
    }

    @Override
    void attack(Actor actor) {

    }

    @Override
    void hitTaken(int damage) {

    }
}
