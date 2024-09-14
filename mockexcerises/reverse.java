package mockexcerises;

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements of a[" + i + "]");
            a[i] = sc.nextInt();

        }
        //to print the elements in reverse 
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

}
