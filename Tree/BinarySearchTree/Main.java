package Tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(70);
        binarySearchTree.insert(50);
        binarySearchTree.insert(90);
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(100);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        System.out.print("Pre Order Traversal\n");
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.print("\nIn Order Traversal\n");
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.print("\nPost Order Traversal\n");
        binarySearchTree.postOrder(binarySearchTree.root);
        System.out.print("\nLevel Order Traversal\n");
        binarySearchTree.levelOrder();
        System.out.println();
        binarySearchTree.search(binarySearchTree.root, 40);
        binarySearchTree.deleteNode(binarySearchTree.root, 110);
        System.out.print("Pre Order Traversal\n");
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.print("\nIn Order Traversal\n");
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.print("\nPost Order Traversal\n");
        binarySearchTree.postOrder(binarySearchTree.root);
        System.out.print("\nLevel Order Traversal\n");
        binarySearchTree.levelOrder();
        System.out.println();
        binarySearchTree.deleteBST();
    }
}
