package Seaching_algorithms;

import java.util.Arrays;
import java.util.Scanner;
//LINEAR SEARCH

/*what is key element ?
 * the element entered by the user which is searched in the given array is called key element
 
 */
//BINARY SEARCH
//DFS AND BFS
//JUMP SEARCH
//INTER POLATION SEARCH
//TERNARY SEARCH
//EXPONENTIAL SEARCH

public class types {
    /* sorting algorithms */
    // BUBBLE SORT
    // SELECTION SORT
    // MERGE SORT
    // QUICK SORT
    // INSERTION SORT
    // RADIX SORT
    // counting sort
    // parralel sort
    // bucket sort
    // LINEAR SEARCH::::::::::::::::::::::::::::::::::::::::::///
    static Scanner sc = new Scanner(System.in);

    public static void Linearsearch(int[] b, int key) {
        String result = "not present";
        for (int i = 0; i < b.length; i++) {
            if (key == b[i]) {
                result = "present";
                break;
            }

        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 34, 345, 3, 53, 3, 5, 3, 354, 43, 2 };
        System.out.println("enter the key element");
        int key = sc.nextInt();
        Linearsearch(a, key);
    }
    // binary search:::

    // ..............................////////////////////////////////////////////////

}
