package control_statements.java_if_else_;

import java.util.Scanner;

// write a java program to check it is duck number or not
/* 30132 - duck number
 * 63740 -duck number
 * 456787654- not a duck number
 */

public class eg4 {
    public static void main(String[] args) {
        Scanner duck = new Scanner(System.in);
        System.out.println("enter a number :");
        String duckres = duck.nextLine();
        boolean ducknumber = false;
        if (duckres.charAt(0) != '0') { // Check if the number contains '0' but does not start with '0'
            for (int i = 1; i < duckres.length(); i++) {
                if (duckres.charAt(i) == '0') {
                    ducknumber = true;

                }
                if (ducknumber) {
                    System.out.println(duckres + "is a duck number");

                } else {
                    System.out.println(duckres + "is not a duck number ");
                }

            }
        }

    }
}
