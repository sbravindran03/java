package array_;

import java.util.Scanner;

public class eg6 {
    // array for inserting the elememt
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner krishav = new Scanner(System.in);
        int size = krishav.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements of a[" + i + "]");
            a[i] = krishav.nextInt();

        }
        // for printing the elements in the array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }

    }
}
