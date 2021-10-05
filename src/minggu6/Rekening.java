package minggu6;

//code convention
public class Rekening {
    private Nasabah nasabah;
    private int saldo;

    public Rekening(Nasabah nasabah, int saldoAwal) {
        this.nasabah = nasabah;
        this.saldo = saldoAwal;
    }

    public Rekening(Nasabah nasabah) {
        this(nasabah, 0);

    }

    public void penyetoran(int jumlah) {
        if (jumlah > 0) {
            saldo = saldo + jumlah;
        }
    }

    public void penarikan(int jumlah) {
        int saldoBaru = saldo - jumlah;
        if (saldoBaru > 0 && jumlah > 0)
            saldo = saldoBaru;

    }

    public Nasabah getNasabah() {
        return nasabah;
    }
    public int getSaldo(){
        return saldo;
    }

}
