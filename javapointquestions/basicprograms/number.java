package javapointquestions.basicprograms;

import java.util.Scanner;

public class number {

    public static boolean pallindrome(int n) {
        int org = n;
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum = (sum * 10) + last;
            n /= 10;

        }
        return org == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        if (pallindrome(n)) {
            System.out.println("it is a pallindrome");
        } else {
            System.out.println("it is not a pallindrome");
        }
    }

}
