package project_based_programs;

import java.util.*;

public class bank {

    static Scanner bankindustry = new Scanner(System.in);

    public static int login() {
        System.out.println("enter the account number ");
        int number = bankindustry.nextInt();
        System.out.println("enter the pin");
        int pin = bankindustry.nextInt();
        if (pin == 223 && number == 123) {
            System.out.println("succesful login");
        } else {
            System.out.println("invalid pin");

        }
        System.out.println("enter the deposit amount");
        int deposit = bankindustry.nextInt();
        int availablebalance = 99999999;
        availablebalance = availablebalance + deposit;
        System.out.println(availablebalance);
        System.out.println("do you want to check balance");
        String checkbalance = bankindustry.next();
        if (checkbalance.equals("yes")) {
            System.out.println(availablebalance);

        } else {
            System.out.println("NEXT............");

        }
        System.out.println("do you want to withdraw cash");
        String check = bankindustry.next();
        if (check.equals("yes")) {
            System.out.println("enter the withdraw amount");
            int withdraw = bankindustry.nextInt();
            availablebalance = availablebalance - withdraw;
            System.out.println("thanks for visting RSV BANK");
        } else if (check.equals("no")) {
            System.out.println("thanks for visting RSV BANK");

        }
        System.out.println("");

        return availablebalance;
    }

    public static int register() {

        System.out.println("enter your name");
        // new sign up
        String name = bankindustry.next();
        System.out.println("you can decide your accout number");
        int accountnum = bankindustry.nextInt();
        System.out.println("enter your pin");
        int newpin = bankindustry.nextInt();
        System.out.println("enter deposited amount");
        int deposit = bankindustry.nextInt();
        int availablebalance = 0;

        System.out.println("do you want to check the balance");
        String checkbalance = bankindustry.next();
        availablebalance = availablebalance + deposit;

        if (checkbalance.equals("yes")) {
            System.out.println(availablebalance);

        } else {
            System.out.println("thanks for visting RSV BANK");

        }
        System.out.println("do you want to withdraw cash");
        String check = bankindustry.next();
        if (check.equals("yes")) {
            System.out.println("enter the withdraw amount");
            int withdraw = bankindustry.nextInt();
            availablebalance = availablebalance - withdraw;
        } else if (check.equals("no")) {
            System.out.println("thanks for visting RSV BANK");

        }
        System.out.println(
                "your details :[" + name + "] [" + accountnum + "] [" + availablebalance + "] [" + newpin + "]");
        return availablebalance;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to RSV BANK");
        System.out.println("IF you are new user SIGN UP or login in ");
        String newuser = bankindustry.next();
        // new login
        if (newuser.equals("Signup")) {
            int signup = register();
        } else if (newuser.equals("LOGIN")) {
            int loginn = login();
        }

        // login

    }
}
