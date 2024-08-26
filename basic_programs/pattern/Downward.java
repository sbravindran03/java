package basic_programs.pattern;

import java.util.Scanner;

public class Downward {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row = sc.nextInt();
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}
