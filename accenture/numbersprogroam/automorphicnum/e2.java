package accenture.numbersprogroam.automorphicnum;

import java.util.*;

public class e2 {

    public static boolean auto(int n) {
        int sqr = n * n;
        while (n != 0) {
            if (n % 10 != sqr % 10) {
                return false;
            } else {
                n /= 10;
                sqr /= 10;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (auto(n)) {
            System.out.println("it is a automorphic");

        } else {
            System.out.println("it is not automorphic");
        }
    }

}
