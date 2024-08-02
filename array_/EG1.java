package array_;

import java.util.Scanner;

public class EG1 {
    /*
     * int [] a = new int[5];
     * sout(a);
     * sout(a[3]);
     * a([3])=86;
     * sout(a[3]);
     * sout(a.length);
     * sout(a[54]);
     * sout(a[-3]);
     * for(int i=0)
     */
    // write a java program to create an array , of user wish size and inside the
    // elements according to the user and the print the elements
    /*
     * assume user size array is 4
     * int size =sc.nextint();
     * int[]a=new int[size];
     */
    static Scanner Array = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("\t\t enter the size of the array");
        int size = Array.nextInt();
        int[] a = new int[size];
        // loop for new insterting new elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements in a[" + i + "]");
            a[i] = Array.nextInt();

        }

        System.out.println("\t\t processing,,");
        Thread.sleep(3000);
        // loop for printing
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i] + " ");
        }
    }
}
