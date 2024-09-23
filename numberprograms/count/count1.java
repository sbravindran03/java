package numberprograms.count;

import java.util.Scanner;

public class count1 {

    public static int cound(int n, int d) {
        if (n < 0) {
            n = -n;
        }
        int count = 0;
        while (n != 0) {
            int last = n % 10;

            if (last == d) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        System.out.println("enter a number to find");
        int d = sc.nextInt();
        System.out.println(cound(n, d));

    }

}
