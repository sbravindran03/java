package numberprograms.ducknumber;

import java.util.Scanner;

public class e1 {

    public static boolean duckk(int n) {

        String number = Integer.toString(n);
        if (number.charAt(0) == '0') {
            return false;
        }
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (duckk(n)) {
            System.out.println("it is a duck number");

        } else {
            System.out.println("it is not a duck number");
        }

    }

}
