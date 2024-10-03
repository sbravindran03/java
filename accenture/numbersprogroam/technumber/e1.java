package accenture.numbersprogroam.technumber;

import java.util.Scanner;

public class e1 {

    public static boolean tech(int n) {
        String nstr = Integer.toString(n);
        int length = nstr.length();
        if (length % 2 != 0) {
            return false;
        }
        String leftpart = nstr.substring(0, length / 2);
        String rightpart = nstr.substring(length / 2);
        int leftnum = Integer.parseInt(leftpart);
        int rightnum = Integer.parseInt(rightpart);
        int sum = leftnum + rightnum;
        int sqr = sum * sum;
        return sqr == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (tech(n)) {
            System.out.println("it is a tech number");
        } else {
            System.out.println("it is not a tech number");
        }

    }

}
