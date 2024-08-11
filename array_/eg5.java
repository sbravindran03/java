package array_;

import java.util.*;

//Java Program to demonstrate the way of passing an array  
//to method

public class eg5 {
    static int pass(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];

        System.out.println(min);
        return min;

    }

    public static void main(String[] args) {
        int a[] = { 37841, 1232, 3, 43, 4, 23432, -1, 2 };// declaring and initializing an array
        pass(a);// passing array to method
    }
}