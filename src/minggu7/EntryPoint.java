package minggu7;

public class EntryPoint {
    public static void main(String[] args) {
        BangunDatarFactory factory = new BangunDatarFactory();
        Persegi persegi = (Persegi) factory.buatBangunDatar("persegi");
        persegi.lebar = 10;
        persegi.panjang = 10;
        System.out.println(persegi.luas());

        PersegiPanjang persegiPanjang = (PersegiPanjang) factory.buatBangunDatar("persegipanjang");

    }
}
