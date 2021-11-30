package minggu10;

import java.util.LinkedHashSet;

public class Mahasiswa {
    private String nama;
    private String nim;
    private LinkedHashSet<MataKuliah> daftarMatakuliah;
    private int totalSKS;

    //    Jika syarat SKS tersebut
//    tidak dipenuhi saat proses pengambilan, maka method tambahMatkul akan melemparkan
//    exception SKSTidakMemenuhi. Berikut ini output jika syarat SKS tidak terpenuhi:
    public Mahasiswa(String nama, String nim) {
        daftarMatakuliah = new LinkedHashSet<>();
        this.setNama(nama);
        this.setNim(nim);
    }

    public void showDaftarMataKuliah() {
        for (MataKuliah matakuliah : daftarMatakuliah ) {

            if(matakuliah instanceof PBO){
                System.out.println("PBO");
            }
            if(matakuliah instanceof StrukDat){
                System.out.println("Struk Dat");
            }
        }
    }

    public void tambahMatkul(MataKuliah tambahmatkul) throws SKSTidakMemenuhi {
        if (totalSKS < tambahmatkul.getSyaratSKS()) {
            throw new SKSTidakMemenuhi(tambahmatkul);
        } else {
            totalSKS += tambahmatkul.getSks();
            daftarMatakuliah.add(tambahmatkul);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
