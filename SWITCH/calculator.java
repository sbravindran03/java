package SWITCH;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner calcu = new Scanner(System.in);
        System.out.println("enter your mathemetic operation");
        int choice = calcu.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("enter your first number");
                int a = calcu.nextInt();
                System.out.println("enter your second number");
                int b = calcu.nextInt();
                int res = a + b;
                System.out.println(res);
            }

                break;
            case 2: {
                System.out.println("enter your first number");
                int a = calcu.nextInt();
                System.out.println("enter your second number");
                int b = calcu.nextInt();
                int res = a - b;
                System.out.println(res);

            }
                break;
            case 3: {
                System.out.println("enter your first number");
                double a = calcu.nextDouble();
                System.out.println("enter your second number");
                double b = calcu.nextDouble();
                double res = a * b;
                System.out.println(res);
            }
                break;
            case 4: {
                System.out.println("enter your first number");
                long a = calcu.nextLong();
                System.out.println("enter your second number");
                long b = calcu.nextLong();
                long res = a / b;
                System.out.println(res);
            }
                break;
            default: {
                System.out.println("invalid choice");
            }

        }
    }

}
