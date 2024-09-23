package numberprograms.fibonocii;

import java.util.Scanner;

public class e1 {

    public static int fibonociii(int n) {
        int first = 0;
        int second = 1;
        if (n <= 0) {
            System.out.println("number should be valid");
        }
        if (n == 1) {
            System.out.println(first);
        }
        if (n == 2) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int fib = sc.nextInt();
        int result = fibonociii(fib);
        System.out.println(result);

    }

}
