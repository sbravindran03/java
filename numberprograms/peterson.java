package numberprograms;

import java.util.Scanner;

public class peterson {

    public static int factorial(int n) {
        int number = n;
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean ispeterson(int n) {
        int sum = 0;
        int orginal = n;
        while (n > 0) {
            int remainder = n % 10;
            sum += factorial(remainder);
            n /= 10;
        }
        return sum == orginal;

    }

    public static void main(String[] args) {
        Scanner peter = new Scanner(System.in);
        System.out.println("enter a number");
        int n = peter.nextInt();
        if (ispeterson(n)) {
            System.out.println("it is a peterson");

        } else {
            System.out.println("not a peterson");
        }

    }

}
