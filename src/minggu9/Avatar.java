package minggu9;

public class Avatar extends Actor{
    private String name;
    private int healthPoint;
    private int moveSpeed;

    public Avatar(String name,
                  int healthPoint,
                  int moveSpeed){
        super();
        System.out.println("Avatar Created");
    }

    public void hitTaken(){

    }

    public void attack(Actor actor){

    }

    @Override
    void getInfo() {
        System.out.println("Avatar");
    }

}
