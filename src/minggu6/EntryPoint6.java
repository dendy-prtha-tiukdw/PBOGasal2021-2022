package minggu6;

public class EntryPoint6 {

    public static void main(String [] args){
        //convertible->car->vehicle
//        Convertible convertible = new Convertible();
//        convertible.goBackward(20, 20);
//        convertible.stop();
        Nasabah nasabah1 = new Nasabah("dendy", "1234", "Yogyakarta");
        RekeningBisnis rekeningBisnis = new RekeningBisnis(nasabah1, 2000000);
        System.out.println(rekeningBisnis.getSaldo());;
        System.out.println(rekeningBisnis.getNasabah().getNama());
        rekeningBisnis.penyetoran(1000000);
        System.out.println(rekeningBisnis.getSaldo());;

    }
}