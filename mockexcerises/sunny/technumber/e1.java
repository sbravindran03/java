package mockexcerises.sunny.technumber;

import java.util.Scanner;

public class e1 {

    public static boolean tech(int n) {
        String numstr = Integer.toString(n);
        int length = numstr.length();
        if (length % 2 != 0) {
            return false;
        }
        int firsthalf = Integer.parseInt(numstr.substring(0, length / 2));
        int secondhalf = Integer.parseInt(numstr.substring(length / 2));
        int result = firsthalf + secondhalf;
        return (result * result == n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if (tech(num)) {
            System.out.println("it is a tech number");
        } else {
            System.out.println("it is not a tech number");
        }

    }
}
