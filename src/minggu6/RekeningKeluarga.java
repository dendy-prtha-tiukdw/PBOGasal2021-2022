package minggu6;

public class RekeningKeluarga extends Rekening {
    public final double BUNGA_SETOR = 0.005;
    public int biaya_admin = 5000;

    public RekeningKeluarga (Nasabah nasabah, int saldoAwal) {
        super (nasabah,saldoAwal);
    }

    public RekeningKeluarga (Nasabah nasabah) {
        super(nasabah);
    }

    public void penyetoran (int jumlah) {
        if(jumlah > 0) {
            int totalSetoran = jumlah + bunga(jumlah);
            super.penyetoran(totalSetoran);
        }
    }

    private int bunga(int jumlah) {
        return(int) BUNGA_SETOR * jumlah;
    }

    public void penarikan (int jumlah) {

    }
}
