package basic_programs;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner factt = new Scanner(System.in);
        System.out.println("enter the number to factorial");
        int fact = factt.nextInt();
        int factorial = 1;
        for (int i = 1; i <= fact; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial of [" + fact + "] is [" + factorial + "]");
    }

}
