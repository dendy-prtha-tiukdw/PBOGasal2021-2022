package minggu1_2;

import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args){
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner (System.in);

        while(running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("Jawab [ya/tidak]> ");

            jawab = scan.nextLine();

            if(jawab.equals("YA")){
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter);
    }
}
