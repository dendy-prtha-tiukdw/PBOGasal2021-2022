package minggu12;

public class Segitiga implements BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float getLuas(){
        return (float) (0.5 * this.alas * this.tinggi);
    }
}
