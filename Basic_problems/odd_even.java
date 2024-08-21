package Basic_problems;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner find = new Scanner(System.in);
        System.out.println("enter a number to find it is odd or even");
        int a = find.nextInt();
        if (a % 2 == 0) {
            System.out.println("it is even");
        } else {
            System.out.println("odd");
        }
    }

}
