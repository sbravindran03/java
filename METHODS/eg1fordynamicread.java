package METHODS;

import java.util.Scanner;

public class eg1fordynamicread {
    // write a java program to print employee details with intruppted exception (its
    // delays execution time of the output)
    public static void main(String[] args) throws InterruptedException {
        Scanner employee = new Scanner(System.in);
        System.out.println("enter your name");

        String emp = employee.nextLine();
        System.out.println("you name is " + emp);

        System.out.println("enter your age");
        int age = employee.nextInt();
        System.out.println("your age is " + age);

        System.out.println("enter your contact number");
        long cont = employee.nextLong();
        System.out.println("your contact number is " + cont);

        System.out.println("are you married");
        Boolean mrrg = employee.nextBoolean();
        System.out.println(mrrg);
        System.out.println("====================== Employee Details =====================");
        System.out.println("Name: " + emp);
        Thread.sleep(1000);
        System.out.println("Age: " + age);
        Thread.sleep(1000);
        System.out.println("Contact Number: " + cont);
        Thread.sleep(1000);
        System.out.println("Marriage Status: " + mrrg);

        // Simulate some delay
        Thread.sleep(1000); //
    }

}
