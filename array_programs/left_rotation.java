package array_programs;
//Program to Left Rotate Elements of an Array

import java.util.Scanner;

public class left_rotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = sc.nextInt();
        int[] a = new int[size];
        //loop for instering the elements in the array
        for (int i = 0; i < a.length; i++) {
            System.out.println("emnter the elements in a[" + i + "]");
            a[i] = sc.nextInt();
        }
        //print elements 
        System.out.println("before rotaton");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        int firstelement = a[0]; // to Store the first element to shift later
        for (int i = 0; i < size - 1; i++) {
            a[i] = a[i + 1];//shift each element one position to left 
        }
        a[size - 1] = firstelement;
        System.out.println();
        System.out.println("after left rotation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }

}
