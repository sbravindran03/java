package accenture.day1;

import java.util.Scanner;

public class largest {

    static Scanner sc = new Scanner(System.in);

    public static int largest(int[] n) {
        int a = n[0];

        for (int i = 1; i < n.length; i++) {

            if (n[i] > a) {
                a = n[i];
            }

        }
        return a;

    }

    public static void main(String[] args) {
        System.out.println("enter the size of the array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the element in a[" + i + "]");
            a[i] = sc.nextInt();
        }
        System.out.println("the given numbers are");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        System.out.println("the largest number in the array is" + largest(a));

    }

}
