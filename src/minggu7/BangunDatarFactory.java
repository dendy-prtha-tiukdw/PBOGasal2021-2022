package minggu7;

//factory design pattern
public class BangunDatarFactory {

    public BangunDatar buatBangunDatar(String jenisBangunDatar){
        if(jenisBangunDatar == null){
            return null;
        }
        else if(jenisBangunDatar.equals("persegi")){
            return new Persegi();
        }
        else if(jenisBangunDatar.equals("persegipanjang")){
            return new PersegiPanjang();
        }
        else if(jenisBangunDatar.equals("lingkaran")){
            return new Lingkaran();
        }
        else if(jenisBangunDatar.equals("segitiga")){
            return new Segitiga();
        }
        else {
            System.out.println("bangun datar tidak tersedia");
            return null;
        }

    }
}
