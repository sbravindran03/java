package Basic_problems;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner secarr = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = secarr.nextInt();
        int[] a = new int[size];
        // loop for inserting the elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements of a[" + i + "]");
            a[i] = secarr.nextInt();

            if (size < 2) {
                System.out.println("Array size should be at least 2 to find the second largest element.");
                return;
            }
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        // loop for finding the largest number
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        // loop for finding the second largest element in the array :
        for (int i = 0; i < a.length; i++) {
            if (a[i] != largest && a[i] > secondlargest) {
                secondlargest = a[i];
            }

        }
        System.out.println("the largest in the array is :" + largest);
        System.out.println("the second largest in the array is :" + secondlargest);

    }

}
