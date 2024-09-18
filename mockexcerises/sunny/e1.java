package mockexcerises.sunny;

import java.util.Scanner;

public class e1 {

    public static boolean sqrtt(int n) {
        double sqrt = Math.sqrt(n);
        return (sqrt - Math.floor(sqrt) == 0);

    }

    public static boolean sunnyy(int n) {
        return sqrtt(n + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (sunnyy(n)) {
            System.out.println("it is sunny number");

        } else {
            System.out.println("it is not a sunny number ");
        }
    }

}
