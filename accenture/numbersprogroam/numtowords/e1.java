package accenture.numbersprogroam.numtowords;

import java.util.Scanner;

public class e1 {

    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen",
        "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertString(int n) {
        if (n == 0) {
            return "zero";

        }
        if (n < 0) {
            return "minus" + convertString(-n);
        }
        String words = "";
        if (n >= 1000) {
            words += convertString(n / 1000) + " thousand";
            n %= 1000;

        }
        if (n >= 100) {
            words += convertString(n / 100) + " hundred ";
            n %= 100;
        }
        if (n >= 20) {
            words += tens[n / 10] + " ";
            n %= 10;
        }
        if (n > 0) {
            words += units[n] + " ";
        }
        return words.trim();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            String result = convertString(number);
            System.out.println("Number in words: " + result);
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        // if (sc.hasNextInt()) {
        //     int number = sc.nextInt();
        //     String result = convertString(number);
        //     System.out.println("Number in words: " + result);
        // } else {
        //     System.out.println("Invalid input. Please enter a valid integer.");
        // }
    }

}
