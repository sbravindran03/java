package accenture.day3.uppertolower;

import java.util.Scanner;

public class e1 {

    public static String upperlower(String n) {
        String result = "";
        for (int i = 0; i < n.length(); i++) {
            // n.charAt(i);
            char ch = n.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += ((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                result += ((char) (ch - 32));
            } else {
                result += ch;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String n = sc.nextLine();
        System.out.println(upperlower(n));

    }

}
