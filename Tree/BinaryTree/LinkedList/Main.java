package Tree.BinaryTree.LinkedList;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.InOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.search("N6");
        System.out.println(binaryTree.getDeepestNode().value);
        binaryTree.deleteDeepestNode();
        binaryTree.search("N6");
        System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.search("N3");
        binaryTree.deleteNode("N3");
        System.out.println();
        binaryTree.levelOrder();
    }
}
