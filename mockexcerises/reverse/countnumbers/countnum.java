package mockexcerises.reverse.countnumbers;

import java.util.Scanner;

public class countnum {

    public static int count(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
        }
        int countnumb = 0;
        while (n != 0) {
            n = n / 10;
            countnumb = countnumb + 1;
        }
        return countnumb;
    }

    public static void main(String[] args) {
        Scanner counter = new Scanner(System.in);
        System.out.println("enter numbers which needed to be counted");
        int countnum = counter.nextInt();
        System.out.println("the given number of [" + countnum + "] is  [" + count(countnum) + "]");
    }

    // public static void main(String[] args) {
    //     Scanner countnum = new Scanner(System.in);
    //     System.out.println("enter the numbers");
    //     int countt = countnum.nextInt();
    //     if (countt == 0) {
    //         System.out.println(1);
    //         return;
    //     }
    //     if (countt < 0) {
    //         countt = -countt;
    //     }
    //     int counting = 0;
    //     while (countt != 0) {
    //         countt = countt / 10;
    //         counting++;
    //     }
    //     System.out.println(counting);
    // }
}
