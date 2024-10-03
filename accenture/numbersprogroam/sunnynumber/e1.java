package accenture.numbersprogroam.sunnynumber;

import java.util.Scanner;

public class e1 {

    public static boolean perfectsquare(int n) {
        int sunny = n + 1;
        double sqr = Math.sqrt(sunny);
        return sqr == Math.floor(sqr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (perfectsquare(n)) {
            System.out.println("it is a sunny number");
        } else {
            System.out.println("it is not a sunny number");
        }

    }

}
