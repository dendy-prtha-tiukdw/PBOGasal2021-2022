package minggu9;

public class Warlock extends Enemy{

    public Warlock(boolean isBoss,
                   int healthPoint,
                   int moveSpeed){
        this.healthPoint = healthPoint;
        this.isBoss = isBoss;
        this.moveSpeed = moveSpeed;
        System.out.println("Warlock Created");
    }

    @Override
    void getInfo() {
        System.out.println("Warlock");
    }

    @Override
    void attack(Actor actor) {

    }

    @Override
    void hitTaken(int damage) {

    }
}
