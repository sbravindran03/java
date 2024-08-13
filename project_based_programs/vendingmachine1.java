package project_based_programs;

import java.util.*;
import java.util.Scanner;

public class vendingmachine1 {
    static Scanner vending = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the juice name");
        String juice = vending.next();
        System.out.println("enter the quanity");
        int quantity = vending.nextInt();
        System.out.println("customer money");
        int customerpay = vending.nextInt();
        int amount = calciprice(juice, quantity);
        if (amount == -1) {
            System.out.println("invalid amount pls enter correct amount ");
            return;
        }
        int result = customerpay - amount;
        if (result > 0) {
            System.out.println("here is your balance [" + result + "]");
            System.out.println("thanks for ordering the  " + juice + "");
        } else if (result == 0) {
            System.out.println("thanks for ordering " + juice + "");

        } else {
            System.out.println("invalid cash " + -result + "");
        }

    }

    public static int calciprice(String juice, int quantity) {
        int perunit = 0;
        if (juice.equals("oranage")) {
            perunit = 150;

        } else if (juice.equals("pine apple")) {
            perunit = 133;
        } else if (juice.equals("mango")) {
            perunit = 132;
        } else {
            return -1;
        }
        return perunit * quantity;

    }
}