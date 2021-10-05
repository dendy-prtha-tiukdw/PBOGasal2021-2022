package minggu6;

public class Nasabah {
    private String nama;
    private String identitas;
    private String alamat;

    public Nasabah( String nama, String identitas,
             String alamat){
        this.alamat = alamat;
        this.nama = nama;
        this.identitas = identitas;
    }

    public String getNama() {
        return nama;
    }

    public String getIdentitas() {
        return identitas;
    }

    public String getAlamat() {
        return alamat;
    }
}
