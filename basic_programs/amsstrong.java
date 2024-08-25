package basic_programs;

import java.util.Scanner;

public class amsstrong {

    public static boolean isamss(int number) {
        int orginal = number;
        int sum = 0;
        int numdigit = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;//to extract the last number
            sum += Math.pow(digit, numdigit);
            number /= 10;
        }
        return sum == orginal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find");
        int number = sc.nextInt();
        if (isamss(number)) {
            System.out.println("it is amsstrong number");

        } else {
            System.out.println("it is not a amsstrong number");

        }
        sc.close();
    }

}
