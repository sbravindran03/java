package array_programs;
// Program to copy all elements of one array into another array

import java.util.*;

public class copyonetoanother {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of a");
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] b = new int[a.length];
//loop for instering 
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements in a[" + i + "]");
            a[i] = sc.nextInt();
            b[i] = a[i];

        }
        //loop for printing
        System.out.println("a elements ");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

        }
        System.out.println();
        System.out.println(" b elements ");
        for (int i = 0; i < b.length; i++) {

            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

}
