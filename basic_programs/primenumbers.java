package basic_programs;

import java.util.Scanner;

public class primenumbers {

    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.println("enter a prime number");
        int n = prime.nextInt();

        int i = 2;
        if (n == 0 || i == 0) {
            System.out.println("its not a prime number");
        } else if (n == i) {
            System.out.println("prime number");
        } else if (n % i == 0) {
            System.out.println("not a prime number");
            i++;
        } else {
            System.out.println("prime numbers");
        }

    }

}
