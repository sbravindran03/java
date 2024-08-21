package Basicproblems;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner arm = new Scanner(System.in);

        System.out.println("Enter your number:");
        int num = arm.nextInt();
        int originalNum, remainder, result = 0;
        int n = 0;

        originalNum = num;

        // Find the number of digits in the number
        for (; originalNum != 0; originalNum /= 10, ++n)
            ;

        originalNum = num;

        // Check if the number is an Armstrong number
        for (; originalNum != 0; originalNum /= 10) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
        }

        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        // Close the scanner
        arm.close();
    }
}
