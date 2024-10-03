package accenture.day2;

import java.util.Scanner;

public class minmax {

    public static void minmax(int[] n) {
        int a = n[0];
        int b = n[0];
        for (int i = 0; i < n.length; i++) {
            if (a < n[i]) {
                a = n[i];
            }

        }
        System.out.println();
        System.out.print("maxmimum number in the array is   " + a);
        for (int i = 0; i < n.length; i++) {
            if (b > n.length) {
                b = n[i];
            }
        }
        System.out.println();
        System.out.print("minimum number in the array  " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] n = new int[size];
        System.out.println("inserting the array element");
        for (int i = 0; i < n.length; i++) {
            System.out.println("enter the elements in a[" + i + "]");
            n[i] = sc.nextInt();
        }
        System.out.println("printing the elements in the array");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);

        }
        System.out.println();
        System.out.println(".....................output..................");
        System.out.println();
        minmax(n);
    }
}
