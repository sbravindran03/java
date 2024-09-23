package numberprograms.count;

import java.util.Scanner;

public class e1 {

    public static int count(int n) {
        int number = n;
        int count = 0;
        if (number < 0) {
            number = -number;

        }
        while (number != 0) {
            int last = number % 10;
            number /= 10;
            count++;

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println(count(n));
    }

}
