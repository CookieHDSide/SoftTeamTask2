package wokie;

import java.util.Scanner;

/**
 * Created by mazha_000 on 11.08.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ent = sc.nextInt();
        System.out.println();
        Best a = new Best();
        a.dev(ent);
        a.output();
    }
}
