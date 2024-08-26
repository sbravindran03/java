package basic_programs.pattern;

import java.util.Scanner;

public class LeftTriangle {

    public static void main(String[] args) {
        Scanner left = new Scanner(System.in);
        System.out.println("enter number of rows should be in the left triangle");
        int row = left.nextInt();
        int j, i;
        for (i = 0; i < row; i++) {
            for (j = 2 * (row - i); j >= 0; j--) {
                System.out.print(" ");

            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
