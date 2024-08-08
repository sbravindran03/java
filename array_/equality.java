package array_;

import java.util.Scanner;

public class equality {
    public static void main(String[] args) {
        Scanner equal = new Scanner(System.in);
        System.out.println("enter the size of the array A");
        int sizea = equal.nextInt();
        int[] a = new int[sizea];
        System.out.println("enter the size of the array B");
        int sizeb = equal.nextInt();
        int[] b = new int[sizeb];
        // loop for inserting the elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements of a[" + i + "]");
            a[i] = equal.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("enter the elements of b[" + i + "]");
            b[i] = equal.nextInt();

        }
        // loop for adding the elements in the array
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 += sum1 + a[i];
            a[i] = sum1;

        }
        int sum2 = 0;
        for (int i = 0; i < b.length; i++) {
            sum2 += sum2 + b[i];
            b[i] = sum2;
        }
        if (sum1 == sum2) {
            System.out.println("its equal");
        } else {
            System.out.println("its not equal");
        }

    }

}
