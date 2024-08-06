package Basic_problems;

import java.util.Arrays;
import java.util.Scanner;

public class mergearray {
    public static void main(String[] args) {
        Scanner merge = new Scanner(System.in);
        System.out.println("enter the size of the array A");
        int size = merge.nextInt();
        int a[] = new int[size];
        System.out.println("enter the size of the array B");
        int sizea = merge.nextInt();
        int b[] = new int[sizea];
        // for instering the elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements in a[" + i + "]");
            a[i] = merge.nextInt();
        }
        for (int j = 0; j < b.length; j++) {
            System.out.println("/t enter the elements in b[" + j + "] ");
            b[j] = merge.nextInt();

        }
        // loop for merging the elements
        int[] result = new int[a.length + b.length];
        for (int o = 0, m = 0, n = 0; o < result.length; o++) {
            if (m < a.length)
                result[o] = a[m++];
            else if (n < a.length)
                result[o] = b[n++];

        }
        System.out.println("a = " + Arrays.toString(a) + "b = " + Arrays.toString(b));// Array
        System.out.println(Arrays.toString(result));

    }

}
