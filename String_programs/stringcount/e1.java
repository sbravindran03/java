package String_programs.stringcount;
// Java Program to count the total number of characters in a string

import java.util.Scanner;

public class e1 {

    public static int counter(String n) {
        int count = 0;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != ' ') {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string name or sentence ");
        String n = sc.nextLine();
        System.out.println(counter(n));

    }

}
