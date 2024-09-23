package String_programs.Stringunique;

import java.util.Scanner;

public class e1 {

    public static String unique(String str) {
        String result = "";
        int[] charcount = new int[26];
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            charcount[ch - 'a']++;

        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charcount[ch - 'a'] == 1) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String n = sc.next();
        System.out.println(unique(n));
    }
}
