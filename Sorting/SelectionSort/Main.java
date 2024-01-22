package Sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {12, 7, 39, 25, 70, 8};
        System.out.println(Arrays.toString(arr));
        selectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
