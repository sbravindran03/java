package control_statements.java_if_else_;

import java.util.Scanner;

public class eg1 {
    public static void main(String[] args) {
        Scanner spy = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = spy.nextInt();

        int sum = 0;
        int lastDigit;
        int product = 1;
        int temp = num; // Store the original number for later use in output

        while (num > 0) {
            lastDigit = num % 10;
            sum = sum + lastDigit;
            product = product * lastDigit;
            num = num / 10;
        }

        if (sum == product) {
            System.out.println(temp + " is a spy number.");
        } else {
            System.out.println(temp + " is not a spy number.");
        }

        spy.close();
    }
}
/*
 * n variable getting input
 * n%10
 */