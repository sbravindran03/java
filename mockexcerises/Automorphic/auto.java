package mockexcerises.Automorphic;

import java.util.Scanner;

public class auto {

    static boolean automorphic(int num) {
        int sqr = num * num;
        while (num > 0) {
            if (num % 10 != sqr % 10) {
                return false;
            } else {
                num = num / 10;
                sqr = sqr / 10;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if (automorphic(num)) {
            System.out.println("it is automorphic num");
        } else {
            System.out.println("it is not a automorphic number");
        }
    }

}
