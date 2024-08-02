package array_;

/*// write a java program to create an array , of user wish size and inside the
    // elements according to the user and the print the elements in reverse with asci values
    /* */
import java.util.Scanner;

public class eg3 {
    static Scanner Char = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("\t\t enter the size of the array");
        int size = Char.nextInt();
        char a[] = new char[size];

        // loop for insterting elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the value a[" + i + "]");
            a[i] = Char.next().charAt(0);

        }
        System.out.println("PROCESSING........");
        Thread.sleep(3000);
        // loop for printing in reverse and
        for (int i = a.length - 1; i > 0; i--) {
            System.out.println(a[i] + ":" + (int) a[i]);
        }
    }

}
