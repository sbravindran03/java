package javapointquestions;

import java.util.Scanner;

public class fibnociii {

    public static int fib(int n) {
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < n; i++) {

            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        return n3;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println(fib(n));

    }
}
