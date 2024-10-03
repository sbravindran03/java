package array_.linear_time_index;

import java.util.Scanner;

import Basic_problems.reverse;

public class e1 {

    public static void index(int a[], int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                if (first == -1) {
                    first = i + 1;
                }
                last = i + 1;
            }

        }
        if (first == -1) {
            System.out.println("no occreence out");
        } else {
            System.out.println("first occurence" + first);
            System.out.println("last ocurrence" + last);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the element in a[" + i + "]");
            a[i] = sc.nextInt();
        }
        System.out.println("the elements in the list are ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("enter the elemnt occurence");
        int find = sc.nextInt();
        index(a, find);

    }
}
