package minggu5;

public class EntryPoint {

    public static void main(String [] args){
        Demo testDemo = Demo.getInstance();
        testDemo.setTest("ini param blalala");
        System.out.println(testDemo.getTest());
//        Demo testDemo2 = new Demo("ini param");
        Demo testDemo3 = Demo.getInstance();
        System.out.println(testDemo3.getTest());
    }

}
