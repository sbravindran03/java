package project_based_programs;

import java.util.*;

public class vendingmachine {
    static Scanner vending = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the juice name  ");
        String juice = vending.next();
        System.out.println("enter the number of quantity");
        int quantity = vending.nextInt();
        System.out.println("customer money");
        int customerpay = vending.nextInt();

        int amount = 0;
        int result;

        if (juice.equals("orange")) {
            amount = 150 * quantity;

        } else if (juice.equals("pine apple")) {
            amount = 350 * quantity;

        } else if (juice.equals("pomograntee")) {
            amount = 250 * quantity;

        } else if (juice.equals("mango")) {
            amount = 150 * quantity;

        }

        result = customerpay - amount;

        if (result > 0) {
            System.out.println("here is your balance  [" + result + "]");
            System.out.println("thanks for ordering  " + juice + "");

        } else if (result == 0) {

            System.out.println("thanks for ordering  " + juice + "");
        } else {
            System.out.println("invalid cash");
        }

    }

}
