package Sorting.HeapSort;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size) {
       arr = new int[size + 1];
       this.sizeOfTree = 0;
       System.out.println("Binary Heap Created!");
    }

    public boolean isEmpty(){
        if (sizeOfTree == 0) {
            return true;
        }else {
            return false;
        }
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Binary Heap is Empty!");
            return -1;
        }
        return arr[1];
    }

    public int sizeOfBinaryHeap(){
       return sizeOfTree;
    }

    public void levelOrder(){
        if (arr == null) {
            System.out.println("Cannot traverse Binary Heap. It is Empty!");
        }else {
            for (int i = 1; i <= sizeOfTree; i++) {
                System.out.print(arr[i] + " - > ");
            }
            System.out.println("\n");
        }
    }

    // Heapify for Insert
    public void heapifyBottonToTop(int index, String heapType){
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType == "Min") {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heapType == "Max") {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottonToTop(parent, heapType);
    }

    public void insert(int value, String typeHeap){
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottonToTop(sizeOfTree, typeHeap);
        System.out.println("Inserted " + value + " successfully in Heap!");
    }

    // HeapifyTopToBottom
    public void heapifyTopToBottom(int index, String heapType){
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {
            return;
        }
        if (heapType == "Max") {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            }else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        } else if (heapType == "Min") {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            }else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    public int extractHeadOfBH(String heapType){
        if (isEmpty()) {
            return -1;
        }else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }

    public void deleteBH(){
        arr = null;
        System.out.println("Binary Heap Deleted!");
    }
}
