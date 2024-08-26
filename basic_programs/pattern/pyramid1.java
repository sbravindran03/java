package basic_programs.pattern;

import java.util.Scanner;

public class pyramid1 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of the array");
        // int size = sc.nextInt();
        // int[] a = new int[size];
        // //for inserting  the elements
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println("enter the a element a[" + i + "]");
        //     a[i] = sc.nextInt();
        // }
        // //for printing the elements
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i] + " ");

        // }
        Scanner py = new Scanner(System.in);
        System.out.println("enter the pyramid rows");
        int row = py.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
