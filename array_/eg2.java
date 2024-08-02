package array_;

/*// write a java program to create an array , of user wish size and inside the
    // elements according to the user and the print the elements in reverse
    /* */
import java.util.Scanner;

public class eg2 {
    static Scanner reverse = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("\t\t enter the size of the array");
        int size = reverse.nextInt();
        int a[] = new int[size];
        // loop for insterting elements
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the value a[" + i + "]");
            a[i] = reverse.nextInt();

        }
        System.out.println("PROCESSING........");
        Thread.sleep(3000);
        // loop for printing in reverse
        for (int i = a.length - 1; i > 0; i--) {
            System.out.println(a[i] + "");
        }
    }

}
