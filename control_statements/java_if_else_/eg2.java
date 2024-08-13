package control_statements.java_if_else_;

import java.util.Scanner;

// write a java program  to check t isneon number or not 
public class eg2 {
    public static void main(String[] args) {
        Scanner neon = new Scanner(System.in);
        System.out.println("enter a number");
        int res = neon.nextInt();

        int squar = res * res;
        int lastDigit = 0;
        int result = res;
        int sum = 0;
        while (squar > 0) {
            lastDigit = squar % 10;
            sum = sum + lastDigit;
            squar = squar / 10;

        }
        if (sum == res) {
            System.out.println(result + " " + " +neon number");

        } else {
            System.out.println(result + " " + "is not a neon number");
        }

    }

}
