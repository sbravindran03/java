package mockexcerises;

import java.util.Scanner;

public class pallindromestring {

    public static void main(String[] args) {
        String reverse = "";
        Scanner pallin = new Scanner(System.in);
        System.out.println("entern a word");
        String orginal = pallin.nextLine();
        int leghth = orginal.length();
        for (int i = leghth - 1; i >= 0; i--) {
            reverse = reverse + orginal.charAt(i);
        }
        if (orginal.equals(reverse)) {
            System.out.println("palllindrome");
        } else {
            System.out.println("not a pallindrome ");
        }
    }

}
