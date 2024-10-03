package accenture.day3.countVowelsAndConsonant;

import java.util.Scanner;

public class e1 {

    public static void countVowelsAndConsonant(String n) {
        int vowels = 0;
        int constant = 0;
        n = n.toLowerCase();
        for (char i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    constant++;
                }

            }

        }
        System.out.println("vowels: " + vowels);
        System.out.println("constant " + constant);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String n = sc.nextLine();
        countVowelsAndConsonant(n);
    }

}
