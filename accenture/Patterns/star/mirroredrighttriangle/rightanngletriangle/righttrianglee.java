package accenture.Patterns.star.mirroredrighttriangle.rightanngletriangle;

import java.util.Scanner;

public class righttrianglee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(" ");
            }

            System.out.println();

        }
    }

}
