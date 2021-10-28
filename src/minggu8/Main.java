package minggu8;

public class Main {
    private static String drinkType;

    public static void main(String[] args) {
//        StringBuilder s1 = new StringBuilder("Fear leads to anger; anger leads to hatred; hatred leads to conflict; conflict leads to suffering.");
//        String s2 = "";
//        System.out.println("string length is: " + s1.length());
//        System.out.println("string length is: " + s2.isEmpty());
//        int value = 20;
////        s1 = String.valueOf(value);
//        System.out.println(s1);
//        s1.append("— Yoda, in Star Wars Episode I: The Phantom Menace.");
//        System.out.println(s1);

       /* Buat program yang memproses input nama dan nim Anda, dan memberikan output nama dimana 3
        karakter terakhir pada nama diganti dengan 3 karakter terakhir nim Anda.
        Contoh input :
        Nama : Hello world
        Nim : 123456789
        Contoh Output :
        Hello wo789*/
//        String nama = "Hello world";
//        int nim = 123456789;
//        System.out.println(nama.substring(0, nama.length() - 3)+(""+nim).substring((""+nim).length() - 3));
//        nama.equalsIgnoreCase("");
        Main main = new Main();
        main.declareDrink("Rachel", main);
        int[] test = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < test.length; i++) {
            test[i]= 100;
        }
    }

    private void declareDrink(String name, Main drink) {
        System.out.println(drink.drinkType + name);
    }
}
