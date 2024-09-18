package Basic_problems;

import java.util.Scanner;

public class details {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your email");
        String email = sc.next();
        System.out.println("age: x" + age);
        System.out.println("name: " + name);
        System.out.println("email: " + email);
    }

}
