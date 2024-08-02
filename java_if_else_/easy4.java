package java_if_else_;

import java.util.Scanner;

public class easy4 {
    public static void main(String[] args) {

        Scanner loop = new Scanner(System.in);
        System.out.println("How many stars do you want ");
        int result = loop.nextInt();
        int i = 1;
        // for (int i = 1; i <= result; i++) {
        // System.out.println("*");
        // }
        // in while loop:
        // while (i <= result) {
        // System.out.println("*");
        // i++;
        // }
        // in do while loop :
        do {
            System.out.println("*");
            i++;
        } while (i <= result);

    }

}
