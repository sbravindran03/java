package numberprograms.recursion_;

import java.util.Scanner;

public class e1 {

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println(power(a, n));
    }

}
