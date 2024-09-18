package mockexcerises.reverse;

import java.util.Scanner;

public class reverserecur {

    public static void reversenumber(int n) {

        if (n < 0) {
            System.out.print("-");
            n = -n;

        }
        if (n < 10) {

            System.out.print(n);
            return;

        }

        System.out.print(n % 10);
        reversenumber(n / 10);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a numeber");
        int number = sc.nextInt();
        System.out.print("reverse number");
        reversenumber(number);
        System.out.println();

    }
}
