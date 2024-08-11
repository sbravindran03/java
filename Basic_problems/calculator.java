package Basic_problems;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        System.out.println("enter the arithmatic operation");
        Scanner calcu = new Scanner(System.in);
        System.out.println("1 for additon 2 for sub , 3 for multipliction,4 for divison ");
        int res = calcu.nextInt();
        System.out.println("enter the nmber a");
        int a = calcu.nextInt();
        System.out.println("b");
        int b = calcu.nextInt();
        if (res == 1) {
            res = a + b;

        } else if (res == 2) {
            res = a - b;

        } else if (res == 3) {
            res = a * b;

        } else if (res == 4) {
            res = a / b;
        }
        System.out.println(res);
    }

}
