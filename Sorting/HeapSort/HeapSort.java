package Sorting.HeapSort;

public class HeapSort {

    int[] arr = null;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    public void sort(){
        BinaryHeap binaryHeap = new BinaryHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            binaryHeap.insert(arr[i], "Min");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = binaryHeap.extractHeadOfBH("Min");
        }
    }

    public void printArray(){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
}
