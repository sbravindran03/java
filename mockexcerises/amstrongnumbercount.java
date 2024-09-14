package mockexcerises;

import java.util.Scanner;

public class amstrongnumbercount {

    public static boolean amstrong(int n) {
        int sum = 0;
        int last = n;
        int digit = 0;
        int temp;
        temp = last;
        while (temp != 0) {
            temp /= 10;
            digit++;
        }
        temp = last;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digit);
            temp /= 10;
        }
        if (n == sum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number up to print");
        int num = sc.nextInt();
        System.out.println("numbers are ..........");
        for (int i = 0; i <= num; i++) {
            if (amstrong(i)) {
                System.out.println(i + "");
            }
        }

    }

}
