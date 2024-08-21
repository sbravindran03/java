package Basicproblems;

import java.util.Scanner;

public class pallindrone {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number to check");
        String result = num.next();
        int length = result.length();
        for (int i = 0; i < length / 2; i++) {
            if (result.charAt(i) != result.charAt(length - i - 1)) {
                System.out.println("its not a pallindrone");
            } else {
                System.out.println("it is a pallindrone");
            }

        }
    }

}
