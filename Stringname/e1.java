package Stringname;

import java.util.Scanner;

public class e1 {

    public static String
            n(String str) {
        // String str = Integer.toString(n);
        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr >= 'A' && chr <= 'Z') {
                result += (char) (chr + 32);
            } else if (chr >= 'a' && chr <= 'z') {
                result += ((char) (chr - 32));
            } else {
                result += chr;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String n = sc.next();
        System.out.println(n(n));

    }

}
