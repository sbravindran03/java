package Searching_algorithms;

import java.util.Arrays;

public class merge_sort {

    public static void merge_sort1(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = left + (left - right) / 2;
        merge_sort1(arr, left, right);
        merge_sort1(arr, mid + 1, right);
        int left_starting = left;
        int right_starting = mid + 1;
        int lefthalf[] = new int[mid - left + 1];// A ARRAY
        int righthalf[] = new int[right - mid];// B ARRAY
        // copy data to temp arrays
        for (int i = 0; i < lefthalf.length; i++)
            lefthalf[i] = arr[left_starting + i];
        for (int j = 0; j < righthalf.length; j++)
            righthalf[j] = arr[right_starting + j];

        int index = left;
        int p1 = 0;
        int p2 = 0;
        while (p1 < lefthalf.length && p2 < righthalf.length) {
            if (lefthalf[p1] <= righthalf[p2]) {
                arr[index++] = lefthalf[p1];
                p1++;
            } else {
                arr[index++] = righthalf[p2];
                p2++;
            }

        }
        while (p1 < lefthalf.length) {
            arr[index++] = lefthalf[p1];
            p1++;

        }
        while (p2 < righthalf.length) {
            arr[index++] = righthalf[p2];

        }

    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 6, 67, 3434, 445, 3443, 454, 1 };
        System.out.println("before starting");
        System.out.println(Arrays.toString(arr));
        merge_sort1(arr, 0, arr.length - 1);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(arr));

    }

}
