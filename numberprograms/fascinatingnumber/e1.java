package numberprograms.fascinatingnumber;

import java.util.*;

public class e1 {

    public static Boolean fasci(int n) {
        int first = n * 2;
        int second = n * 3;
        // String numbers = "123456789";
        String fn = Integer.toString(first);
        String sn = Integer.toString(second);

        String number = Integer.toString(n);
        String result = number + fn + sn;

        if (result.length() != 9) {
            return false;
        }
        for (char i = '1'; i <= '9'; i++) {
            if (result.indexOf(i) == -1) {
                return false;
            }

        }
        return true;
        // if (result.contains(numbers)) {
        //     return true;
        // }
        // return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (fasci(n)) {
            System.out.println("it is a facinating number");

        } else {
            System.out.println("it is not a facinating number");
        }

    }

}
