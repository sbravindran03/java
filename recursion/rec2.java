package recursion;

import java.util.*;

public class rec2 {
    // write a java program to find the factorial without usng loop
    static Scanner sc = new Scanner(System.in);
    static int factorial = 1;

    public static void main(String[] args) {
        System.out.println("enter a  number ");
        int number = sc.nextInt();
        System.out.println(" the factorial number of " + number + "  is  " + fact(number));

    }

    public static int fact(int number) {
        if (number >= 1) {
            factorial *= number--;
            fact(number);

        }
        return factorial;

    }

}
