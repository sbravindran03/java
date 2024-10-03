package accenture.numbersprogroam.peterson;

import java.util.Scanner;

public class e1 {

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;

    }

    public static boolean peterson(int n) {
        int orginal = n;
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += fact(last);
            n /= 10;
        }
        return sum == orginal;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (peterson(n)) {
            System.out.println("it is peterson");

        } else {
            System.out.println("it is not peterson");
        }
    }

}
