package minggu4;

public class Tabungan {
    private String pemilik;
    private double saldo;
    private int noRekening;
    private static int nexId=1;

    //constructor
    public Tabungan(String pemilik, double saldo){
        this.pemilik=pemilik;
        this.saldo = saldo;
        noRekening = nexId;
        nexId++;
    }

    public static int getNexId() {
        return nexId;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(int noRekening) {
        this.noRekening = noRekening;
    }

}
