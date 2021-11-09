package minggu10;

public class Main {
    public static void main(String []args){
//        Main main = new Main();
//        try {
//            System.out.println(main.menghitung(1,1));
//        }catch (Exception e){
//            System.out.println("eh error : "+ e.getMessage());
//        }
//        finally {
//            System.out.println("Finish");
//        }

        MataKuliah pbo = new PBO();
        MataKuliah strukDat = new StrukDat();

        Mahasiswa mahasiswa = new Mahasiswa("Solviana", "12345" );
        try {
            mahasiswa.tambahMatkul(strukDat);
            mahasiswa.tambahMatkul(pbo);
        } catch (SKSTidakMemenuhi e) {
            e.printStackTrace();
        }
        mahasiswa.showDaftarMataKuliah();
    }

    private String menghitung(int var1, int var2){
        int hitung = var1 - var2;
        if(hitung == 0)
        {
            throw new ArithmeticException("bilangan yang dihitung adalah 0");
        }
        return "hitung berhasil";
    }
}
