package METHODS;

import java.util.Scanner;

//read the data from two students that is name and pecentage and design a methoad which retruning name of the student who is highest percentage and call the method
public class eg3dynread {
    public static void main(String[] args) {
        Scanner students = new Scanner(System.in);
        System.out.println("enter the student1 name ");
        String name1 = students.next();

        System.out.println("ENTER FIRST STUDENT PERC");
        double perc1 = students.nextDouble();
        System.out.println("ENTER THE SECOND STUDENT NAME");
        String name2 = students.next();
        System.out.println("second student percentage");
        double perc2 = students.nextDouble();

        // System.out.println(highestPERC(name1, perc1, name2, perc2));
        String res = highestPERC(name1, perc1, name2, perc2);
        System.out.println(res); // just another type to print the data of students
    }

    public static String highestPERC(String a, double b, String c, double d) {
        if (b > d) {
            return a;
        } else {
            return c;
        }

    }

}
//
//