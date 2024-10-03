package accenture.day3.StringManipulationExercises;

import java.util.Scanner;

public class stringmanipulation {

    public static String reversee(String n) {
        String reverse = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }

        return reverse;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String n = sc.nextLine();
        System.out.println(reversee(n));
    }

}
