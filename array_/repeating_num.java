package array_;

import java.util.Scanner;

public class repeating_num {
    public static void main(String[] args) {
        Scanner repeat = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = repeat.nextInt();
        int a[] = new int[size];
        // loop for insterting the elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements ofa[" + i + "]");
            a[i] = repeat.nextInt();
        }

        // loop for finding the missing elements in the array
        System.out.println("elments in the array are");
        for (int i = 0, j = 1; i < a.length; i++, j++) {
            if (a[i] != j) {
                System.out.println(j + "");
                i--;
            }

        }
    }

}
