package accenture.Patterns.star.triangleStar;

import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.print("* ");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");

            }

            System.out.println();

        }
        // for (int i = 1; i <= n; i++) {
        //     System.out.print("*");
        // }
    }

}
