package Basic_problems;

import java.util.Scanner;

public class fact {

    static Scanner a = new Scanner(System.in);

    public static int factt(int a) {
        int result = a;
        if (result == 0) {
            return 1;
        } else {
            return result * factt(result - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println("enter the number to factorial");
        int b = a.nextInt();
        int resultt = factt(b);
        System.out.println(resultt);
    }

}
