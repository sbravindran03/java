package basic_programs.pattern;

import java.util.Arrays;

public class median {

    public static double findmedian(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 != 0) {
            return array[n / 2];
        } else {
            // If the length of the array is even, return the average of the two middle elements
            return (array[(n - 1) / 2] + array[n / 2] / 2.0);
        }

    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7};
        double median = findmedian(a);
        System.out.println(median);

    }

}
