package Basic_problems;

import java.util.*;
// write a java prgroam to shift elements to right to left or left to right 

public class SHIFT {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40 };

        System.out.println(" enter n ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            int first = a[0];
            for (int j = 0; j < a.length; j++) {
                a[j] = a[j + 1];

            }
            a[a.length - 1] = first;
        }
        System.out.println(Arrays.toString(a));

    }

}
