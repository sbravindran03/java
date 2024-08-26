package basic_programs.pattern;

import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows in a pyramid");
        int row = sc.nextInt();
        for (int i = 0; i <= row; i++) {
            //for printing spaces
            for (int j = row - i; j > 0; j--) {
                System.out.print(" ");

            }
            //for printing * 
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
