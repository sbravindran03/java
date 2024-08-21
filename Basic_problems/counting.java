package Basic_problems;

import java.util.Scanner;

public class counting {
    static Scanner count = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the numbers should be counted");
        Long check = count.nextLong();
        String result = check.toString(check);
        int exact = result.length();
        System.out.println(exact);

    }

}
