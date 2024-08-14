package array_;

import java.util.Scanner;

public class duplicateeg1 {

    public static int[] RSV(int[] a) {
        // loop for removing the duplicate element
        int removedup = a.length;
        int[] temp = new int[removedup];
        int j = 0;
        for (int i = 0; i < removedup; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (a[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate) {
                temp[j++] = a[i];
            }

        }
        // creating new array to copy elements
        int[] newarray = new int[j];
        System.out.println("after removing duplicate elements");
        for (int i = 0; i < j; i++) {
            newarray[i] = temp[i];
        }
        return newarray;

    }

    public static void main(String[] args) {
        Scanner dup = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = dup.nextInt();
        int[] a = new int[size];
        // loop for inserting the element
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements of the array a[" + i + "]");
            a[i] = dup.nextInt();

        }

        int[] newArray = RSV(a);
        // printing the elements
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + "");
        }
        System.out.println();
    }

}
