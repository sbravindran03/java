package accenture.numbersprogroam.reverse;

import java.util.Scanner;

import javapointquestions.basicprograms.number;

public class e1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int reverse = 0;
        while (n != 0) {
            int last = n % 10;
            reverse = reverse * 10 + last;
            n /= 10;
        }
        System.out.println(reverse);

    }

}
