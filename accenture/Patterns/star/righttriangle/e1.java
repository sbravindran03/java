package accenture.Patterns.star.righttriangle;

import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("right triangle");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("enter a number");
        int r = sc.nextInt();
        System.out.println("reverse right triangle");
        for (int i = 1; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        sc.close();
    }

}
