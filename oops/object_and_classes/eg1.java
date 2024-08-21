package oops.object_and_classes;

import java.util.*;

/*3 Ways to initialize object
There are 3 ways to initialize object in Java.

By reference variable
By method
By constructor */
//1) by reference variable
public class eg1 {

    static Scanner students = new Scanner(System.in);

    int id = students.nextInt();

    String name = students.next();

}

class teststudent {

    public static void main(String[] args) {
        System.out.println("enter the student id");

        eg1 s1 = new eg1();

        System.out.println("student ID is " + s1.id);
        System.out.println("enter the student name");
        System.out.println("student name is " + s1.name);

    }
}
