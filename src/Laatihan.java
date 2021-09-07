
//buatlah sebuah method yang dapat menampilkan
// banyak  bilangan yg habis dibagi 3 dan 7

public class Laatihan {

    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    public static int sum(int n) {
        int a = 0;
        for (int i = 0; i <= n; i++) {
            if (i%3==0 && i%7==0) {
                a++;
            }
        }
        return a;

//        int i=0;
//        while(i%3==0 && i%7==0 && i<=n){
//            i=i+i;
//            i++;
//        }
//        return i;
    }
}
