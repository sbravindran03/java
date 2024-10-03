package accenture.day1;

import java.util.Scanner;

public class dayswitch {

    public static void day(int n) {
        switch (n) {
            case 1: {
                System.out.println("sunday");

            }
            break;
            case 2: {
                System.out.println("monday");
            }
            break;
            case 3: {
                System.out.println("tuesday");
            }
            break;
            case 4: {
                System.out.println("wednedsay");
            }
            break;
            case 5: {
                System.out.println("thursday");
            }
            break;
            case 6: {
                System.out.println("friday");
            }
            case 7: {
                System.out.println("saturday");
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find day");
        int n = sc.nextInt();
        day(n);

    }

}
