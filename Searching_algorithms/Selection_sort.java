package Searching_algorithms;

import java.util.*;

public class Selection_sort {
    // it will select the smallest element array by index //
    /*
     * How Selection Sort Works
     * Passes: The Selection Sort algorithm works by repeatedly finding the minimum
     * element (considering ascending order) from the unsorted part of the array and
     * putting it at the beginning.
     * Positioning: After each iteration of the outer loop, the smallest element in
     * the unsorted portion is placed in its correct position in the sorted portion
     * of the array.
     * Example Walkthrough
     * Given the array { 2, 3456, 3, 34, 53, 340, 345, 4 }, here's how the algorithm
     * sorts it:
     * 
     * First Pass (i = 0):
     * 
     * The inner loop finds the smallest element in the entire array, which is 2.
     * Since 2 is already at the first position, no swap is needed.
     * Second Pass (i = 1):
     * 
     * The inner loop finds the smallest element in the remaining array {3456, 3,
     * 34, 53, 340, 345, 4}, which is 3. It swaps 3456 and 3, so the array becomes
     * {2, 3, 3456, 34, 53, 340, 345, 4}.
     * Subsequent Passes:
     * 
     * The algorithm continues to find the smallest element in the remaining
     * unsorted portion and swaps it with the element at the current i position.
     * Final Output:
     * 
     * The sorted array is printed, and it will look like this:
     * java
     * 
     * [2, 3, 4, 34, 53, 340, 345, 3456]
     */
    public static void main(String[] args) {
        int[] a = { 2, 3456, 3, 34, 53, 340, 345, 4 };
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            {
                s = i;
                for (int j = i; j < a.length; j++) {
                    if (a[j] < a[s])
                        s = j;
                }

            }
            // swap
            int temp = a[i];
            a[i] = a[s];
            a[s] = temp;
        }
        System.out.println(Arrays.toString(a));

    }

}
