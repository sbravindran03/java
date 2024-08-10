package recursion;

import java.util.*;

//write a java program 1 to n without using loop;
public class rec1 {
    static int start = 1, n;

    public static void main(String[] args) {

        // local variable is used is only one function
        // global vatiable is used in any function
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n");
        n = sc.nextInt();
        display();

    }

    public static void display() {
        if (start <= n) {
            System.out.println(start);
            start++;
            display();

        }
        return;

    }
}
