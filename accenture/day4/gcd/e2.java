package accenture.day4.gcd;

import java.util.Scanner;

public class e2 {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter a number");
        int b = sc.nextInt();
        System.out.println(gcd(a, b));

    }

}
