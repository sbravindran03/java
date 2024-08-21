package Basic_problems;

import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner small = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = small.nextInt();
        int a[] = new int[size];
        // loop for inserting elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements" + i + "");
            a[i] = small.nextInt();
        }

        int n = a[0];// we are the indexing the array 0 the element which means from the start
        // loop for finding the smallest number int the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] < n) {
                n = a[i];
            }
        }
        System.out.println("the smallest elememt is " + n);

    }

}
