package array_;

import java.util.Scanner;

public class duplicateeg3 {
    public static int[] duplicates(int[] a) {

        int size = a.length;
        int[] removedup = new int[size];// it is used as a storing variable
        int j = 0;
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (a[i] == removedup[k]) {
                    isDuplicate = true;
                    break;

                }

            }
            if (!isDuplicate) {
                removedup[j++] = a[i];// j++ for iterrating the array
            }

        }
        // loop for new array for copyin the element and store it
        int[] newArray = new int[j];
        for (int i = 0; i < j; i++) {
            newArray[i] = removedup[i];

        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner dupli = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = dupli.nextInt();
        int[] a = new int[size];
        // loop for inserting the element
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements of a[" + i + "]");
            a[i] = dupli.nextInt();
        }
        // loop for printing the copied array in the method
        int[] newarray = duplicates(a);
        System.out.println("after removing the duplicat elements");
        for (int i = 0; i < newarray.length; i++) {
            System.out.println(newarray[i] + "");
        }

    }

}
