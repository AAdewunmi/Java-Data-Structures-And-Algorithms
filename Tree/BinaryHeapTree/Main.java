package Tree.BinaryHeapTree;

public class Main {
    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(5);
        binaryHeap.insert(10, "Max");
        binaryHeap.insert(5, "Max");
        binaryHeap.insert(15, "Max");
        binaryHeap.insert(1, "Max");
        binaryHeap.levelOrder();
        binaryHeap.extractHeadOfBH("Max");
        binaryHeap.levelOrder();
        binaryHeap.deleteBH();
        binaryHeap.levelOrder();
        binaryHeap.deleteBH();
    }
}
