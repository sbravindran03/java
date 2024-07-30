package java_if_else_;

import java.util.Scanner;

// factorial of 6 calcualte the odd numbers
public class eg3 {
    public static void main(String[] args) {
        Scanner factorial = new Scanner(System.in);

        System.out.println("enter a number");
        int result = factorial.nextInt();
        int fact = 1;
        int product = 1;
        for (int i = 1; i <= result; i++) {
            fact = fact * i;
            if (i % 2 != 0) {
                product = product * i;

            }

        }
        System.out.println("factorial " + fact);
        System.out.println("product " + product);
    }

}
