package Basicproblems;

import java.util.Scanner;

public class gcdeg {
    static Scanner gcd1 = new Scanner(System.in);

    static int gcd(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        // base number
        if (a == b)
            return a;
        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }

    // Drivers code
    public static void main(String[] args) {
        System.out.println("enter the first number");
        int a = gcd1.nextInt();
        System.out.println("enter the second number");
        int b = gcd1.nextInt();
        System.out.println("gcd of " + a + "," + b + "" + " is" + " " + gcd(a, b));
    }

}
