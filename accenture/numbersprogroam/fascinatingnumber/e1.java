package accenture.numbersprogroam.fascinatingnumber;

import java.util.Scanner;

public class e1 {

    public static boolean fascinate(int n) {
        // Multiply the number by 2 and 3
        int f = n * 2;
        int s = n * 3;

        // Concatenate the original number, its double, and triple
        String result = Integer.toString(n) + Integer.toString(f) + Integer.toString(s);

        // Check if the concatenated string has exactly 9 characters
        if (result.length() != 9) {
            return false; // Cannot be a fascinating number if not 9 digits
        }

        boolean num = true;

        // Iterate through each digit from '1' to '9'
        for (char c = '1'; c <= '9'; c++) {
            int count = 0; // Reset count for each digit

            for (int i = 0; i < result.length(); i++) {
                char ch = result.charAt(i);
                if (ch == c) {
                    count++;
                }
                // Check if any character is '0' or outside '1' to '9'
                if (ch == '0' || ch < '1' || ch > '9') {
                    num = false;
                    break; // Invalid digit found
                }
            }            // Each digit must appear exactly once
            if (count != 1) {
                num = false;
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (fascinate(n)) {
            System.out.println(n + " is a fascinating number.");
        } else {
            System.out.println(n + " is not a fascinating number.");
        }

        sc.close();
    }

}
