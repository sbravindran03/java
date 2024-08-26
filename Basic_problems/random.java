package Basic_problems;

import java.util.Scanner;

public class random {

    public static void main(String[] args) {
        Scanner min = new Scanner(System.in);
        System.out.println("enter the minum number");
        int minim = min.nextInt();
        Scanner max = new Scanner(System.in);
        System.out.println("enter the maximum value");
        int maxi = max.nextInt();

        double a = Math.random() * (maxi - minim + 1) + minim;
        int b = (int) (Math.random() * (maxi - minim + 1) + minim);
        System.out.println(a);
        System.out.println(b);
    }

}
