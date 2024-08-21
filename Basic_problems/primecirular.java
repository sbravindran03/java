package Basic_problems;

import java.util.Scanner;

public class primecirular {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;  // Numbers less than 2 are not prime
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;  // Check divisibility
        }
        return true;
    }

    // Function to generate circular permutations of the number
    public static boolean isCircularPrime(String number) {
        int n = number.length();
        char[] arr = number.toCharArray();
        
        // Check all circular permutations
        for (int i = 0; i < n; i++) {
            String permutedNumber = new String(arr);
            int num = Integer.parseInt(permutedNumber);

            // Check if the current permutation is prime
            if (!isPrime(num)) {
                return false;  // If any permutation is not prime, return false
            }

            // Rotate the number
            char first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inputNumber = sc.nextLine();
        
        // Check if the number is a circular prime
        if (isCircularPrime(inputNumber)) {
            System.out.println(inputNumber + " is a circular prime.");
        } else {
            System.out.println(inputNumber + " is not a circular prime.");
        }
        
        sc.close();  // Close the scanner to prevent resource leaks
    }
}
