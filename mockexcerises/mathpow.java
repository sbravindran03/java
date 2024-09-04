// 4) Compute the value of an using recursion. It is not allowed to use any extra space apart from the recursion call stack.
package mockexcerises;

import java.util.*;

public class mathpow {

    public static double findpow(double y, int n) {
        if (n == 0) {
            return 1.0;
        }
        double pwr = findpow(y, n - 1);
        return y * pwr;

    }

    public static double power(double Y, int N) {
        if (N < 0) {
            return 1.0 / findpow(Y, -N);
        }
        return findpow(Y, N);
    }

    public static void main(String[] args) {
        Scanner find = new Scanner(System.in);
        System.out.println("enter a number y");
        int n = find.nextInt();
        System.out.println("enter a number y");
        int d = find.nextInt();
        System.out.println(power(d, n));

    }

}
