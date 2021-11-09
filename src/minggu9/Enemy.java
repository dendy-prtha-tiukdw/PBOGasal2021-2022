package minggu9;

public abstract class Enemy extends Actor{
    protected boolean isBoss;
    protected int healthPoint;
    protected int moveSpeed;

    public Enemy(){
        super();
        System.out.println("Enemy Created");
    }

    abstract void attack(Actor actor);

    abstract void hitTaken(int damage);
}

