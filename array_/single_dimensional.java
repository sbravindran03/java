package array_;

import java.util.*;
// Java Program to illustrate how to declare, instantiate, initialize  
//and traverse the Java array.  

public class single_dimensional {
    public static void main(String[] args) {
        int[] a = new int[6];// declaration and instantiation
        a[0] = 23;// initialization
        a[1] = 122;
        a[2] = 222;
        a[3] = 12332;
        a[4] = 2231;
        a[5] = 3232;
        // traversing array
        for (int i = 0; i < a.length; i++)// length is the property of array
        {
            System.out.println(a[i]);
        }
    }

}