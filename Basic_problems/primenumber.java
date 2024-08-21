package Basic_problems;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = prime.nextInt();
        int i = 2;
        if (n == 0 || i == 0) {
            System.out.println("it is not a prime number ");

        } else if (n == i) {
            System.out.println("it is a Prime number ");
        } else if (n % i == 0) {
            System.out.println("it is not prime number");
            i++;
        } else {
            System.out.println("Its is a prime number");
        }

    }

}
