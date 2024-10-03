package accenture.Patterns.star.pyramid;

import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
