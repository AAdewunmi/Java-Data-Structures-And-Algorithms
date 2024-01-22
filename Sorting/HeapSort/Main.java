package Sorting.HeapSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 7, 5, 8, 4};
        HeapSort heapSort = new HeapSort(arr);
        heapSort.printArray();
        heapSort.sort();
        heapSort.printArray();
    }
}
