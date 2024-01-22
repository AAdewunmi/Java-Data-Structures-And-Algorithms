package Sorting.QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};
        QuickSort quickSort = new QuickSort();
        quickSort.printArray(arr);
        System.out.println();
        quickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println();
        quickSort.printArray(arr);
    }
}
