package minggu12;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<BangunDatar> bangunDatars = new ArrayList<>();
        bangunDatars.add(new SegiEmpat(9, 8));
        bangunDatars.add(new Segitiga(1, 2));
        bangunDatars.add(new SegiEmpat(3, 4));
        bangunDatars.add(new Segitiga(1, 5));
        bangunDatars.add(new SegiEmpat(2, 7));

        for (BangunDatar bangunDatar: bangunDatars) {
            System.out.println(bangunDatar.getLuas());
        }

        bangunDatars.sort(new ComparatorSegiEmpat());

        System.out.println("setelah sorting ");
        for (BangunDatar bangunDatar: bangunDatars) {
            System.out.println(bangunDatar.getLuas());
        }

//        Arrays.sort(segiEmpats);
//        Collections.sort(segiEmpats, new ComparatorSegiEmpat());
//        System.out.println("setelah sorting ");
//        for (Object bangun : segiEmpats) {
//            if (bangun instanceof Segitiga) {
//                Segitiga segitiga = (Segitiga) bangun;
//                System.out.println(segitiga.getLuas());
//            } else if (bangun instanceof SegiEmpat) {
//                SegiEmpat segiEmpat = (SegiEmpat) bangun;
//                System.out.println(segiEmpat.getLuas());
//            }
//        }

//        ArrayList<String> al = new ArrayList<>();
//        al.add("Renaldi");
//        al.add("Nurendra");
//        al.add("Nereus");
//
//        Iterator<String> iterator = al.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
