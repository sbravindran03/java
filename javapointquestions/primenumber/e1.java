package javapointquestions.primenumber;

import java.util.*;

public class e1 {

    public static boolean primenumber(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a prime number");
        int n = sc.nextInt();
        if (primenumber(n)) {
            System.out.println("it is a prime number");

        } else {
            System.out.println("it is not prime number");

        }
    }

}
