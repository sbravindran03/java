package basic_programs;

import java.util.Scanner;

public class pallindromee1 {

    public static String palli(String a) {
        String rev = "";

        int length = a.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + a.charAt(i);
        }
        return rev;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string element");
        String org = sc.nextLine();
        String result = palli(org);
        if (org.equals(result)) {
            System.out.println("its is a pallindrome");
        } else {
            System.out.println("it is not a pallindrome");
        }
    }

}
