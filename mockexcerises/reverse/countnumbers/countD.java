// 3) Calculate how many times a digit D occurs in the number N. One has to ask the user to give the values of N and D.
package mockexcerises.reverse.countnumbers;

import java.util.*;

public class countD {

    public static int count(int n, int d) {
        if (n == 0 && d == 0) {
            return 1;

        }
        if (d < 0) {
            n = -n;
        }
        int countt = 0;
        int digit;
        while (n != 0) {
            digit = n % 10;
            if (digit == d) {
                countt = countt + 1;

            }
            n = n / 10;
        }
        return countt;
    }

    public static void main(String[] args) {
        Scanner counttt = new Scanner(System.in);
        System.out.println("enter the number n ");
        int n = counttt.nextInt();
        System.out.println("enter the number d ");
        int d = counttt.nextInt();
        int result = count(n, d);
        System.out.println(result);

    }
}
