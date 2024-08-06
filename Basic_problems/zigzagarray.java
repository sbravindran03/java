package Basic_problems;

import java.util.Arrays;

public class zigzagarray {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40 };
        int[] b = { 50, 60, 70, 80 };
        int[] res = new int[a.length + b.length];
        for (int i = 0, m = 0, n = b.length - 1; i < res.length; i++) {
            if (i % 2 == 0)
                res[i] = a[m++];
            else
                res[i] = b[n--];

        }
        System.out.println("a" + Arrays.toString(a));
        System.out.println("b" + Arrays.toString(b));
        System.out.println("c" + Arrays.toString(res));
    }

}
