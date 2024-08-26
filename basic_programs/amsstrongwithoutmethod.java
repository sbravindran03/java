package basic_programs;

import java.util.Scanner;

public class amsstrongwithoutmethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int orginal = sc.nextInt();
        int temp = orginal;
        int sum = 0;
        int numdigit = String.valueOf(orginal).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numdigit);
            temp /= 10;
        }
        if (sum == orginal) {
            System.out.println("it is a  amsstrongnumber");

        } else {
            System.out.println("it is not a amsstrong number");
        }
        sc.close();
    }

}
