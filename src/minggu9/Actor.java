package minggu9;

public abstract class Actor {
    private float x_pos;
    private float y_pos;

    public Actor(){
        System.out.println("Actor Created");
    }

    abstract void getInfo();


    public float getX_pos() {
        return x_pos;
    }

    public void setX_pos(float x_pos) {
        this.x_pos = x_pos;
    }

    public float getY_pos() {
        return y_pos;
    }

    public void setY_pos(float y_pos) {
        this.y_pos = y_pos;
    }
}

