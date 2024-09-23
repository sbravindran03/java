package numberprograms.emprimnumber;

import java.util.*;

public class e1 {

    public static boolean prime(int n) {
        int number = n;
        if (number <= 1) {
            return false;
        } // for(int i=2;i<=Math.sqrt(n);i++){
        //     if(n%i==0){
        //         return false;
        // }
        // }   
        else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }

        }

        return true;

    }

    public static boolean emprim(int n) {
        if (!prime(n)) {
            return false;
        }
        int number = n;
        int reverse = 0;
        while (number > 0) {
            int lastnumber = number % 10;
            reverse = reverse * 10 + lastnumber;
            number /= 10;
        }
        return prime(reverse) && reverse != n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (emprim(n) == true) {
            System.out.println("it is emprim");
        } else {
            System.out.println("it is not a emprim");
        }
    }

}
