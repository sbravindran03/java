package basic_programs;

import java.util.Scanner;

public class factorialusingmethod {

    public static int factt(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to factorial");
        int n = sc.nextInt();
        n = factt(n);
        System.out.println(n);
    }

}
