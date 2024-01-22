package Sorting.BucketSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,7,5,4,2,1,3,6,8};
        BucketSort bucketSort = new BucketSort(arr);
        bucketSort.printArray();
        bucketSort.bucketSort();
        bucketSort.printArray();
    }
}
