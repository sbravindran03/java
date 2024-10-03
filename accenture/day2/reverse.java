package accenture.day2;

import java.util.Scanner;

public class reverse {

    public static void reversee(int[] n) {
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the element of a[" + i + "]");
            a[i] = sc.nextInt();
        }
        System.out.println("orginal array ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("reverse array");
        reversee(a);

    }
}
