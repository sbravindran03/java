package array_;

import java.util.Arrays;

public class leftzero {
    public static void main(String[] args) {
        int[] a = { 1, 3, 3, 4, 0, 3, 4, 6, 0, 1 };
        int left = a.length - 1, right = 0;
        System.out.println(Arrays.toString(a));

        while (left > right) {
            if (a[left] != 0 && a[right] == 0) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;

            }
            if (a[left] != 0)
                left--;
            if (a[right] == 0)
                right++;
        }
        System.out.println(Arrays.toString(a));
    }

}
