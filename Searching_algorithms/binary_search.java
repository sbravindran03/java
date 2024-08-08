package Searching_algorithms;

import java.util.Scanner;

public class binary_search {
    // Array should be sorted for binary search
    /*
     * mark -lower index
     * mark -middle index
     * mark -higher index
     * we can implement binary only on a sorted array
     * 1) key element is in the middle (key == a[mid])
     * 2) key element is present in the left of the middle (key < a[mid])
     * 3) key element is present in the right of the middle (key > a[mid])
     */
    static Scanner sc = new Scanner(System.in);

    public static void binarySearch(int[] b, int key) {
        int l = 0, h = b.length - 1, m = l + h / 2;
        String result = "not present";
        while (l <= h) {
            // Recalculate middle index in each iteration
            if (key == b[m]) {
                result = "present";
                break;
            } else if (key < b[m]) {
                h = m - 1;
            } else if (key > b[m]) {
                l = m + 1; // Increment lower bound index
            }
            m = (l + h) / 2;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println("Enter the number:");
        int key = sc.nextInt();
        binarySearch(a, key);
    }
}
