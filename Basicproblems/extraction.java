package Basicproblems;

public class extraction {
    public static void main(String[] args) {
        String s = "sy23er4d";
        char[] ch = s.toCharArray();
        int sum = 0;

        // Loop through the characters in the string
        for (int i = 0; i < ch.length; i++) {
            // Check if the character is a digit
            if (ch[i] >= '0' && ch[i] <= '9') {
                sum += ch[i] - '0'; // Convert character to integer
            }
        }

        // Output the sum
        System.out.println("The sum of digits is: " + sum);
    }
}
