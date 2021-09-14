package minggu1;

import java.math.*;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        int var = 0;
        System.out.println(var > 0 ? "yes" : "no");
        var+=1;
        System.out.println(var > 0 ? "yes" : "no");
        if(var >1 )
        {
            //return;
        }
        else
        {
            System.out.println("Nilainya 0");
        }

        switch (var){
            case 1:
                var+=1;
                break;
            case 2:
                break;

        }
    }

}
