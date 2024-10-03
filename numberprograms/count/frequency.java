package numberprograms.count;

import java.util.Scanner;

public class frequency {

    public static void frequency(int n) {
        int[] frequency = new int[10];
        while (n > 0) {
            int digit = n % 10;
            frequency[digit]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "  the frequency is  " + frequency[i]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        frequency(n);
    }

}
