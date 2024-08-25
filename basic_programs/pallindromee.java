package basic_programs;

import java.util.Scanner;

public class pallindromee {

    public static void main(String[] args) {
        Scanner palli = new Scanner(System.in);
        System.out.println("enter a number");

        int n = palli.nextInt();
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("its a pallindrome");

        } else {
            System.out.println("not a pallindrome");
        }
    }
}
