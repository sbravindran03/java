package Searching_algorithms;

import java.util.*;

public class selection_sort_eg1 {
    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = select.nextInt();
        int[] a = new int[size];
        // loop for inserting the elements in the array
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements of a[" + i + "]");
            a[i] = select.nextInt();
        }
        // loop for selection sort
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[s])
                    s = j;
            }
            // swap the elements
            int temp = a[i];
            a[i] = a[s];
            a[s] = temp;

        }
        System.out.println(Arrays.toString(a));

    }

}
