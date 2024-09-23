package numberprograms.sunny;

import java.util.Scanner;

public class e1 {

    public static boolean sunny(int n) {

        boolean sqrroot = Math.sqrt(n) % 1 == 0;

        return sqrroot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (sunny(n + 1)) {
            System.out.println("it is a sunny number");

        } else {
            System.out.println("it is not a sunny number");
        }
    }

}
