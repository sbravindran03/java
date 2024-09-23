package numberprograms.bouncynumber;

import java.util.Scanner;

public class e1 {

    public static boolean bouncy(int n) {
        boolean increasing = false;
        boolean decreasing = false;
        int previousnumber = n % 10; //to extract or start with the last digit
        n /= 10;//
        while (n > 0) {
            int currentdigit = n % 10;
            if (currentdigit < previousnumber) {
                increasing = true;
            } else if (currentdigit > previousnumber) {
                decreasing = true;

            }
            if (increasing && decreasing) {
                return true;
            }
            previousnumber = currentdigit;
            n /= 10;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (bouncy(n)) {
            System.out.println("it is a bouncy number");
        } else {
            System.out.println("it is not a bouncy number");
        }

    }

}
