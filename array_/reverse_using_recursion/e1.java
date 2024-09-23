package array_.reverse_using_recursion;

import java.util.Scanner;

public class e1 {

    static Scanner sc = new Scanner(System.in);

    public static void readarray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the element in a[" + i + "]");
            a[i] = sc.nextInt();

        }
        // for (int i = a.length - 1; i > 0; i--) {
        //     System.out.println(a[i]);
        // }
        // return reverse(n);

    }

    public static void reverse(int a[], int start, int end) {
        if (start >= end) {
            return;
        }
        int n = a[start];
        a[start] = a[end];
        a[end] = n;
        reverse(a, start + 1, end - 1);
    }

    public static void printarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        readarray(a);
        reverse(a, 0, a.length - 1);
        System.out.println("reversed array");
        printarray(a);

    }

}
