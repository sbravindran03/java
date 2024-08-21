package Basicproblems;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner reverse = new Scanner(System.in);
        System.out.println("enter a number to reverse");
        int res = reverse.nextInt();
        int rv = 0;
        while (res != 0) {
            int result = res % 10;// to extract the last digit
            rv = rv * 10 + result;// to append the digit
            res /= 10; // to remove the last number

        }
        System.out.println(rv);

    }

}
