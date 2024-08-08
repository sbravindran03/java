package Searching_algorithms;

import java.util.*;

public class binaryeg1 {
    static Scanner sc = new Scanner(System.in);

    public static void binsea(int[] a, int key) {
        String result = "not Present";
        int l = 0, h = a.length - 1, m = l + h / 2;// to iterate the values of
        while (l <= h) {
            if (key == a[m]) {
                result = "present";
                break;
            } else if (key < a[m]) {
                h = m - 1;
            }

            else if (key > a[m]) {
                l = m + 1;
            }

            m = (l + h) / 2;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 60, 304, 34954, 3432, };
        System.out.println("enter a key element number");
        int key = sc.nextInt();
        binsea(a, key);

    }

}
