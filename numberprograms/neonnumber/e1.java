package numberprograms.neonnumber;

import java.util.Scanner;

public class e1 {

    public static boolean neon(int n) {
        int number = n;
        int sqr = number * number;
        int sum = 0;
        while (sqr > 0) {
            int remainder = sqr % 10;
            sum += remainder;
            sqr /= 10; // Reduce the square to process the next digit
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (neon(n)) {
            System.out.println("it is a neon number");
        } else {
            System.out.println("it is not a neon number");
        }
    }

}
