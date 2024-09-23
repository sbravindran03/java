package numberprograms.Spynumber;

import java.util.Scanner;

public class e1 {

    public static boolean spy(int n) {
        int number = n;
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            product *= remainder;
            number /= 10;
        }
        // int product = 1;
        // while (number > 0) {
        //     int remainder = number % 10;
        //     product *= remainder;
        //     number /= 10;

        // }
        return sum == product;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (spy(n)) {
            System.out.println("it is a  spy number");
        } else {
            System.out.println("it is not a spy number");
        }

    }

}
