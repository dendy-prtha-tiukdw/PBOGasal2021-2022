package minggu3;

//entryPoint excute
public class EntryPoint {

    public static void main(String[] args){
//        Lampu lampu1 = new Lampu();
//        lampu1.warna = "Merah";
//        lampu1.daya = 15;
//
//        lampu1.nyalakan();

        /*
        Tabungan t1= new Tabungan();
        t1.saldo = 5000;
        t1.pemilik = "Stevanus";

        System.out.println(("Tabungan: "+ t1.pemilik));
        System.out.println(("Saldo: "+ t1.saldo));

        t1.penyetoran(2000);
        System.out.println(("Saldo setelah disetor: "+ t1.saldo));

        t1.penarikan(3000);
        System.out.println(("Saldo akhir: "+ t1.saldo));

        Tabungan t2 = new Tabungan();
        t2.saldo = 10000;
        t2.pemilik = "Renaldi";
        System.out.println(("Tabungan: "+ t2.pemilik));
        System.out.println("Saldo: " + t2.saldo);
        t2.penarikan(5000);
        System.out.println("Saldo akhir: " + t2.saldo);

         */

        Snipers snipersSenior = new Snipers();
        snipersSenior.camouflage();
        snipersSenior.getWeapons();
    }
}