package mockexcerises;
// 1) Write a Java program for generating the nth Fibonacci Number using loop and O(1) space.

import java.util.Scanner;

public class fibonocii {

    public static int fibono(int n) {
        int first = 0;
        int second = 1;
        if (n <= 0) {
            System.out.println("value should be valid");

        } else if (n == 1) {
            System.out.println(first);
        } else if (n == 2) {
            System.out.println(second);
        }
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;

        }
        return current;
    }

    public static void main(String[] args) {
        Scanner fib = new Scanner(System.in);
        System.out.println("enter a number to fib  index");
        int n = fib.nextInt();
        int result = fibono(n);
        System.out.println(result);

    }

}
