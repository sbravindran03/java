package array_;

import java.util.Scanner;

public class eg4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter the sizre of the array");
        int size = user.nextInt();
        int a[] = new int[size];
        // loop for inserting new elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements of a[" + i + "]");
            a[i] = user.nextInt();

        }
        // loop for printing
        for (int i = 0; i < a.length; i++) {

        }

    }

}
