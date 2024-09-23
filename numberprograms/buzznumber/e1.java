package numberprograms.buzznumber;

import java.util.Scanner;

public class e1 {

    public static boolean buzzz(int n) {
        int number = n;
        if (number % 7 == 0) {
            return true;
        }
        while (number % 10 == 7) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (buzzz(n)) {
            System.out.println("it is buzz number");
        } else {
            System.out.println("it is not a buzz number");
        }
    }

}
