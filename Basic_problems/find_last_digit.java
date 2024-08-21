package Basic_problems;

import java.util.Scanner;

public class find_last_digit {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("enter a number to digit its last digit ");
        int a = digit.nextInt();
        String find = Integer.toString(a);// int to string conversion for finding the first and last
        int first = find.charAt(0) - '0'; // index 0 is used for finding the first number
        int last = find.charAt(find.length() - 1) - '0'; // (charAt(find.length)-1) -'0' is used to find the last digit
        System.out.println("first number " + first);
        System.out.println("last number " + last);

    }

}
