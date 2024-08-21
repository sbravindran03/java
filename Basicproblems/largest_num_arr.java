package Basicproblems;

import java.util.Scanner;

public class largest_num_arr {
    public static void main(String[] args) {
        Scanner lar = new Scanner(System.in);
        System.out.println(" enter size of the array");
        int large = lar.nextInt();
        int largest[] = new int[large];
        // loop inserting the elements
        for (int i = 0; i < largest.length; i++) {
            System.out.println("enter the number of a[" + i + "]");
            largest[i] = lar.nextInt();

        }

        // loop for finding the largest
        int n = largest[0];
        for (int i = 0; i < largest.length; i++) {
            if (largest[i] > n) {
                n = largest[i];

            }

        }
        System.out.println("largest number in the array is: " + n);

    }

}
