package numberprograms.automorphic;

import java.util.Scanner;

public class e1 {

    public static boolean auto(int n) {
        int sqr = n * n;
        int numdigit = Integer.toString(n).length();
        int last = sqr % (int) Math.pow(10, numdigit);
        return last == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        if (auto(n)) {
            System.out.println("it is auto morphic");
        } else {
            System.out.println("it is not a automorphic number");
        }
    }

}
