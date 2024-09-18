package mockexcerises.amsstrong;

import java.util.Scanner;

public class amsstrongmethod {

    public static void armstr(int n) {
        int number = 0;
        int digit = 0;
        int result = 0;
        number = n;
        while (number != 0) {
            number /= 10;
            digit++;
        }
        number = n;
        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, digit);
            number /= 10;
        }
        if (n == result) {
            System.out.println("amsstrong number");
        } else {
            System.out.println("NOT A amsstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a number");
        int orginal = sc.nextInt();
        armstr(orginal);
    }

}
