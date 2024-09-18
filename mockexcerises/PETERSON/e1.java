package mockexcerises.PETERSON;

import java.util.Scanner;

public class e1 {

    public static int fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;

        }
        return factorial;

    }

    public static boolean peterson(int n) {
        int sum = 0;
        int ld = n;
        while (ld > 0) {
            int remainder = ld % 10;   //last digit
            sum += fact(remainder); // we are adding factorial to varibale
            ld /= 10;  // removing the last digit
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (peterson(n)) {
            System.out.println("it is a peterson number");

        } else {
            System.out.println("its not a peterson");

        }
    }

}
