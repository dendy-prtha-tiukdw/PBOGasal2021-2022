package minggu7;

public class Persegi implements BangunDatar{

    public double panjang;
    public double lebar;
    @Override
    public double luas() {
        System.out.println("luas persegi");
        return panjang*lebar;
    }

    @Override
    public double keliling() {
        return 0;
    }
}
