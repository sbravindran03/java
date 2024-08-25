package basic_programs;

import java.util.Scanner;

import Basic_problems.mathpow;

public class amstrongnumber {

    public static boolean isamstrong(int number) {
        int orginal = number;
        int sum = 0;
        int numdigit = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;// to extract the last digit
            sum += Math.pow(digit, numdigit);// Add the digit raised to the power of numDigits
            number /= 10;// Remove the last digit
        }
        return sum == orginal;
    }

    public static void main(String[] args) {
        Scanner ams = new Scanner(System.in);
        System.out.println("enter a number to find");
        int number = ams.nextInt();
        if (isamstrong(number)) {
            System.out.println("it is amstrong number");
        } else {
            System.out.println("its not ams number");
        }
    }

}
