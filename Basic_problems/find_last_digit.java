package Basic_problems;

import java.util.Scanner;

public class find_last_digit {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("enter a number to digit its last digit ");
        int a = digit.nextInt();
        String find = Integer.toString(a);
        int first = find.charAt(0) - '0';
        int last = find.charAt(find.length() - 1) - '0';
        System.out.println("first number " + first);
        System.out.println("last number " + last);

    }

}
