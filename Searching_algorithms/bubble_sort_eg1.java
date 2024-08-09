package Searching_algorithms;

import java.util.*;

public class bubble_sort_eg1 {
    /*
     * Given the array { 2, 43, 54, 3, 545, 45, 345, 35, 5, -3, 343, -292 }, here’s
     * how the algorithm would sort it:
     * 
     * First Pass:
     * 
     * Compare 2 and 43, no swap.
     * Compare 43 and 54, no swap.
     * Compare 54 and 3, swap them. The array becomes { 2, 43, 3, 54, 545, 45, ...
     * }.
     * Continue this process until the largest element 545 is moved to the last
     * position.
     * Subsequent Passes:
     * 
     * On the next pass, the second largest element will be moved to the second last
     * position.
     * This process continues until the entire array is sorted.
     */
    public static void main(String[] args) {
        int[] a = { 2, 43, 54, 3, 545, 45, 345, 35, 5, -3, 343, -292 };
        // total lenght- 11
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(a));

    }

}
