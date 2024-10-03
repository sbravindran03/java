package accenture.day4.gcd;

import java.util.Scanner;

public class e1 {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;

        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println(gcd(n, a));
    }

}
