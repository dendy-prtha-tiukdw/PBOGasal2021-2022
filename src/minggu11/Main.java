package minggu11;

import minggu10.Mahasiswa;

import java.util.*;

public class Main {

    public static void main(String[] arrgs) {
        int intArr[] = {10, 20, 15, 22, 35};

        Arrays.sort(intArr);

        Mahasiswa[] arrayMhs = new Mahasiswa[10];

        arrayMhs[0] = new Mahasiswa("Renaldi", "015");
        arrayMhs[1] = new Mahasiswa("solvi", "05");
        arrayMhs[2] = new Mahasiswa("ivana", "01");
//        System.out.println(arrayMhs.length);
//        for (Mahasiswa item : arrayMhs) {
//            //
//            if(item != null) {
//                System.out.print(item.getNim() + ", ");
//            }
//        }

//        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>(10);
//        System.out.println(listMahasiswa.size());
//        listMahasiswa.add(new Mahasiswa("solvi", "05"));
//        listMahasiswa.add(new Mahasiswa("ivana", "06"));
//        System.out.println(listMahasiswa.size());
//        listMahasiswa.add(new Mahasiswa("Renaldi", "012345"));
//        listMahasiswa.add(null);
//        listMahasiswa.trimToSize();
//        System.out.println(listMahasiswa.size());
//
//        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
//        q.add(10);
//        q.add(1);
//        q.add(9);
//        q.add(0);
//        System.out.println(q);
//        System.out.println(q.peek());
        int score = numberofVowel("ab");
        System.out.println(score);
    }

    public static int scrabbleScore(String aword) {
        if (aword.length() <= 1) {
            return scrabbleValue(aword.charAt(aword.length() - 1));
        }
        return scrabbleValue(aword.charAt(aword.length() - 1)) + scrabbleScore(aword.substring(0, aword.length() - 1));
    }

    public static int numberofVowel(String aword) {
        if (aword.length() == 1) {
            if(isVOwel(aword.charAt(aword.length() - 1))){
                return 1;
            }
            return 0;
        }
        if (isVOwel(aword.charAt(aword.length() - 1))) {
            return 1 + numberofVowel(aword.substring(0, aword.length() - 1));
        } else {
            return numberofVowel(aword.substring(0, aword.length() - 1));
        }
    }

    private static boolean isVOwel(char aLetter) {
        if ((aLetter == 'a') ||
                (aLetter == 'i') ||
                (aLetter == 'u') ||
                (aLetter == 'e') ||
                (aLetter == 'o')) {
            return true;
        }
        return false;
    }

    private static int scrabbleValue(char aLetter) {
        if (aLetter == 'd' || aLetter == 'g')
            return 2;
        if (aLetter == 'b' || aLetter == 'c' || aLetter == 'm' || aLetter == 'p')
            return 3;
        if (aLetter == 'f' || aLetter == 'h' || aLetter == 'v' || aLetter == 'w' || aLetter == 'y')
            return 4;
        if (aLetter == 'k')
            return 5;
        if (aLetter == 'j' || aLetter == 'x')
            return 8;
        if (aLetter == 'z' || aLetter == 'q')
            return 10;
        return 1;
    }
}
