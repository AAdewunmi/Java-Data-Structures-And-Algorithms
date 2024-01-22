package Sorting.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int arr[] = {10, 5, 30, 15, 50, 6};
        System.out.println(Arrays.toString(arr));
        insertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
