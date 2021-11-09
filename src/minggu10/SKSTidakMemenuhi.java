package minggu10;

public class SKSTidakMemenuhi extends Exception {
    public SKSTidakMemenuhi(MataKuliah matkul) {
        System.out.println("matkul "+matkul.getClass().getName()+" tidak memenuhi");
    }
}
