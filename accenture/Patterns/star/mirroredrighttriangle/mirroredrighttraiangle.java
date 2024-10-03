package accenture.Patterns.star.mirroredrighttriangle;

import java.util.Scanner;

public class mirroredrighttraiangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j < n; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
