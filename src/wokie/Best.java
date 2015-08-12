package wokie;

/**
 * Created by mazha_000 on 11.08.2015.
 */
import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Best {
    static int brk;
    static ArrayList<Integer> deviders = new ArrayList<>();

    public static void dev() {
        Scanner sc = new Scanner(System.in);
        int ent = sc.nextInt();
        if (ent < 0) ent *= -1;
        System.out.println();
        int i = ent;
        int j = 1;

        if (i != 0) {


        for (int c = 2; c < 12; c++) {
            if (i % c == 0) {
                brk = c;
                break;
            } else brk = 1;
        }
        while ((i / brk) >= j) {
            if (i % j == 0) {
                deviders.add(j);
            }
            j++;
        }
        if (brk != 1) {deviders.add(i);}

}}


    public static void output() {
        for (Integer d : deviders) {
            System.out.print(d+" ");
        }
    }
}
