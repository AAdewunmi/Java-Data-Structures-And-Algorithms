package Tree.BinaryTree.Array;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        this.arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size " + size + " has been created!");
    }

    public boolean isFull(){
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        }else {
            return false;
        }
    }

    public void insertValue(String value){
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " has been inserted");
        } else {
            System.out.println("The Binary Tree is full");
        }
    }

    public void preOrder(int index){
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " -> "); // Root
        preOrder(index * 2); // Left
        preOrder(index * 2 + 1); // Right
    }

    public void inOrder(int index){
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2); // Left
        System.out.print(arr[index] + " -> "); // Root
        inOrder(index * 2 + 1); // Right
    }

    public void postOrder(int index){
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2); // Left
        postOrder(index * 2 + 1); // Right
        System.out.print(arr[index] + " -> "); // Root
    }
    
    public void levelOrder(){
        if (arr == null) {
            System.out.println("Array is Empty!");
        }
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " -> ");
        }
    }
    
    public int search(String value){
        for (int i = 0; i <= lastUsedIndex; i++) {
            if (arr[i] == value) {
                System.out.println(value + " exists at the location: " + i);
                return i;
            }
        }
        System.out.println("The " + value + " does not exist in Binary Tree");
        return -1;
    }

    public void delete(String value){
        int location = search(value);
        if (location == -1) {
            return;
        }else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The node has been successfully deleted");
        }
    }

    public void deleteTree(){
        try{
            arr = null;
            System.out.println("Binary Tree has been successfully deleted!");
        }catch(Exception e){
            System.out.println("Error deleting Binary Tree!");
            e.getMessage();
        }

    }
}
