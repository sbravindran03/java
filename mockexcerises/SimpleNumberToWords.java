package mockexcerises;

import java.util.Scanner;

public class SimpleNumberToWords {

    // Arrays to store words for single digits, tens, and teens
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String covertString(int num) {
        if (num == 0) {
            return "zero";
        } else if (num < 10) {
            return ones[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + (num % 10 != 0 ? " " + ones[num % 10] : "");
        } else if (num < 1000) {
            return ones[num / 100] + "hundereds" + (num % 100 != 0 ? "and " + covertString(num % 100) : " ");
        } else {
            return ones[num / 1000] + " thousand " + (num % 1000 != 0 ? "and " + covertString(num % 1000) : "");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        System.out.println("in words " + covertString(num));

    }
}
