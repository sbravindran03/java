package Basic_problems;

import java.util.Scanner;;

public class powerofnum {
    public static void main(String[] args) {
        Scanner power = new Scanner(System.in);
        System.out.println("Enter the number");
        int pownum = power.nextInt();
        System.out.println(" Power number");
        int pownums = power.nextInt();
        int result = 1;
        for (int i = 1; i <= pownums; i++) {
            result *= pownum;

        }
        System.out.println(result);
        power.close();

    }

}
