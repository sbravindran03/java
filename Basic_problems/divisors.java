package Basic_problems;

import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        Scanner div = new Scanner(System.in);
        System.out.println("enter a a number to find");
        int n = div.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("the divisors of " + n + ":");
                System.out.println(i + " ");
            }

        }

    }

}
