package array_;

import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = arr.nextInt();
        int[] a = new int[size];
        // loop for instering
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the number a[" + i + "]");
            a[i] = arr.nextInt();

        }

    }

    // e
    public static int rsv(int a, int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (i == j) {
                    a = i++;
                    size = a;

                }
                return a, size;

            }

        }

    }

}
