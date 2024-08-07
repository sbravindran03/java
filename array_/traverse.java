package array_;

import java.util.Arrays;

public class traverse {
    public static void main(String[] args) {
        int[] a = { 4, 2, 1, 8, 12, 0 };
        int target = 10;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target)
                    System.out.println("[" + a[i] + "," + a[j] + "]...");
            }
        }
    }

}