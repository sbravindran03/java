package accenture.day1;

import java.util.Scanner;

public class naturalnumbers {
//printing one to 10 natural numbers

    public static void natural(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println("natural numbers");
        natural(n);
    }
}
