package minggu9.latihan;

public class EntryPoint {

    public static void main(String[] args) {
        Hewan donaldDuck = new Bebek();
        donaldDuck.bersuara();

        Hewan goatie = new Kambing();
        goatie.bersuara();

//        tampilSuara(donaldDuck);
//        tampilSuara(goatie);
        EntryPoint entryPoint = new EntryPoint();

        cekHewanBerenang(donaldDuck);
        cekHewanBerenang(goatie);
    }

    static void cekHewanBerenang(Hewan hewan) {
        if (hewan instanceof Bebek) {
            ((Bebek) hewan).berenang();
        } else if (hewan instanceof Kambing) {
            ((Kambing) hewan).berjalan();
        }
    }

    static void tampilSuara(Hewan hewan) {
        hewan.bersuara();
    }
}