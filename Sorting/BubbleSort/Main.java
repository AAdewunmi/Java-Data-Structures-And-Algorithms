package Sorting.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {10, 5, 30, 15, 50, 6};
        System.out.println(Arrays.toString(arr));
        bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
