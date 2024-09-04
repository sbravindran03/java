package Basic_problems;

import java.util.*;

public class calculator {

    public static void main(String[] args) {
        System.out.println("enter the arithmatic operation");
        Scanner calcu = new Scanner(System.in);

        String res = calcu.next();
        System.out.println("enter the nmber a");
        int a = calcu.nextInt();
        System.out.println("b");
        int b = calcu.nextInt();
        int result = 0;
        if (res.equals("+")) {
            result = a + b;

        } else if (res.equals("-")) {
            result = a - b;

        } else if (res.equals("*")) {
            result = a * b;

        } else if (res.equals("/")) {
            result = a / b;
        }
        System.out.println(result);
    }

}
