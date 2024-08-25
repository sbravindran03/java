package basic_programs;

import java.util.Scanner;

public class pallindromewithstring {

    public static void main(String[] args) {
        String org, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string element");
        org = sc.nextLine();
        int length = org.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + org.charAt(i);

        }
        if (org.equals(rev)) {
            System.out.println("its is a palindrome");

        } else {
            System.out.println("it not a pallindrome");
        }
    }

}
