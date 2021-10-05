package minggu5;

public class Demo {

    private static Demo instance;
    private String test;
    //konstruktor
    private Demo(){
//        System.out.println("Object demo dibuat");
    }

    //overloading constructor
    private Demo(String paramTest){
        test = paramTest;
    }


    public static Demo getInstance(){
        if(instance == null){
            instance = new Demo();
            return instance;
        }
        return instance;
    }

    public void setTest(String paramTest){
        test = paramTest;
    }

    public String getTest() {
        return test;
    }

    //method overloading
    public String getTest(String paramTest){
        this.test = paramTest;
        return test;
    }
}
