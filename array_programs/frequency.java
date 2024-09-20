package array_programs;
// Program to find the frequency of each element in the array

import java.util.*;

public class frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter the elmenets in a[" + i + "]");
            a[i] = sc.nextInt();
        }
        int[] frequency = new int[size];
        int visited = -1;
        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (a[i] == a[j]) {
                    count++;
                    frequency[j] = visited;// it helps us  to avoid not to count the element again  
                }

            }
            if (a[i] != visited) {
                frequency[i] = count;
            }

        }
        System.out.println("elements ");
        for (int i = 0; i < size; i++) {
            if (a[i] != visited) {
                System.out.println(a[i] + "   frequncy is  " + frequency[i]);
            }
        }

    }
}
