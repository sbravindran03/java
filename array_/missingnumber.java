package array_;

import java.util.Arrays;

public class missingnumber {

    public static void main(String[] args) {

        int[] a = {1, 4, 6, 7, 10};
        System.out.println("\t\ta:" + Arrays.toString(a));
        System.out.println("the Missing Numbers are:");
        for (int i = 0, j = 1; i < a.length; i++, j++) {
            if (a[i] != j) {

                System.out.println(j + "");
                i--;
            }
        }
    }

}
