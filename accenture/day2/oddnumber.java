package accenture.day2;

import java.util.Scanner;

public class oddnumber {

    public static void oddnumberr(int[] n) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n.length; i++) {
            if (i % 2 == 0) {
                even++;

            } else {
                odd++;
            }

        }
        System.out.println("numbers of odd numbers in the array is  " + odd);
        System.out.println("numbers of even numbers in the array is  " + even);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements in a[" + i + "]");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        oddnumberr(a);

    }

}
