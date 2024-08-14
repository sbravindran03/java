package array_.mutidimensional;

import java.util.Arrays;

//write a java program to traverse outer arrary
public class q1 {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            System.out.println("to print address :" + a[i]);

        }
        for (int i = 0; i < a.length; i++) {

            System.out.println("to print the value :" + Arrays.toString(a[i]));
        }
    }

}
