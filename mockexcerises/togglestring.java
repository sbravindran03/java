package mockexcerises;
// 5) A string is given. Our task is to write a Java progr am to toggle the characters of the given string. For example, for the string "jaVaTpoiNt", the string after the toggle will be "JAvAtPOInT".

import java.util.Scanner;

public class togglestring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String find = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < find.length(); i++) {
            char chr = find.charAt(i);
            if (chr >= 'A' && chr <= 'Z') {
                result.append((char) (chr + 32));
            } else if (chr >= 'a' && chr <= 'z') {
                result.append((char) (chr - 32));
            } else {
                result.append(chr);
            }

        }
        String answer = result.toString();
        System.out.println(answer);
    }

}
