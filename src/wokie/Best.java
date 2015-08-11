package wokie;

/**
 * Created by mazha_000 on 11.08.2015.
 */
import java.math.*;
import java.util.ArrayList;

public class Best {
    static ArrayList<Integer> deviders = new ArrayList<>();
    public static void dev(int i) {
        int c = i;
        int j=1;

        while (c > j) {
            if (c % j == 0) {
                deviders.add(j);
            }
            j++;
        }
        deviders.add(c);

    }

    public void output() {
        for (Integer d : deviders) {
            System.out.print(d+" ");
        }
    }
}
