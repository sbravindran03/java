package mockexcerises.amsstrong;

import java.util.Scanner;

public class amsstrongnumber {

    public static void main(String[] args) {

        Scanner ams = new Scanner(System.in);
        System.out.println("enter a number");
        int number = ams.nextInt();
        int orginal = number;
        int digit = 0;
        int result = 0;

        while (orginal != 0) {
            orginal /= 10;
            digit++;
        }
        orginal = number;
        while (orginal != 0) {
            int remainder = orginal % 10;
            result += Math.pow(remainder, digit);
            orginal /= 10;
        }
        if (result == number) {
            System.out.println("it is a amsstrong number");
        } else {
            System.out.println("it is not a amsstrong number ");
        }

    }

}
