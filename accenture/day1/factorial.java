package accenture.day1;

import java.util.Scanner;

public class factorial {

    public static int factorial(int n) {
        int fact = 1;
        // for (int i = 1; i <= n; i++) {
        //     fact *= i;
        // }
        // return fact;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to factorial");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

}
