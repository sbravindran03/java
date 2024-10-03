package accenture.day3.pallindrome;

import java.util.Scanner;

public class e1 {

    public static boolean pallin(String n) {
        String reverse = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return n.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String n = sc.nextLine();
        if (pallin(n)) {
            System.out.println("it is pallindrome");
        } else {
            System.out.println("it is not a pallindrome");
        }

    }
}
