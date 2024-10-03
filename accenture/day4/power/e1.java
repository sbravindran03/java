package accenture.day4.power;

import java.util.Scanner;

public class e1 {

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println("enter the base  number");
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        System.out.println("enter the base  number");
        int exponent = sc.nextInt();
        System.out.println(power(base, exponent));
    }

}
