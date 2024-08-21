package Basicproblems;

import java.util.Scanner;

public class array_min_max {
    static Scanner maxmin = new Scanner(System.in);

    public static int minmax(int[] a, int b) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < b; i++) {
            if (a[i] < mini) {
                mini = a[i];
            }
        }
        return mini;
    }

    public static int maximini(int[] a, int b) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < b; i++) {
            if (a[i] > maxi) {
                maxi = a[i];

            }

        }
        return maxi;

    }

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        // inserting the elements
        int size = maxmin.nextInt();
        int maximini[] = new int[size];
        int minmax[] = new int[size];

        for (int i = 0; i < maximini.length; i++) {
            System.out.println(" enter the value of a[" + i + "]");
            maximini[i] = maxmin.nextInt();
            minmax[i] = maxmin.nextInt();
            System.out.println("maxmimum: " + maximini(maximini, size));
            System.out.println("minimum: " + minmax(minmax, size));

        }
    }

}
