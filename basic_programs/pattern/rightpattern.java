package basic_programs.pattern;

import java.util.Scanner;

public class rightpattern {

    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.println("enter the number of rows");

        int row = star.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
