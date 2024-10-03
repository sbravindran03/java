package accenture.day4;

import java.util.Scanner;

public class e1 {

    public static int fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive calls
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci sequence: ");
        int terms = scanner.nextInt();

        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
