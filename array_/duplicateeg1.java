package array_;

import java.util.Scanner;

public class duplicateeg1 {
    public static void main(String[] args) {
        Scanner dup = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = dup.nextInt();
        int[] a = new int[size];
        // loop for inserting the element
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements of the array a[" + i + "]");
            a[i] = dup.nextInt();

        }
        // loop for removing the duplicate element
        int removedup = a.length;
        int[] temp = new int[size];

    }

}
