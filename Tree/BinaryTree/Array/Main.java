package Tree.BinaryTree.Array;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(9);
        binaryTree.insertValue("N1");
        binaryTree.insertValue("N2");
        binaryTree.insertValue("N3");
        binaryTree.insertValue("N4");
        binaryTree.insertValue("N5");
        binaryTree.insertValue("N6");
        binaryTree.insertValue("N7");
        binaryTree.insertValue("N8");
        binaryTree.insertValue("N9");
        binaryTree.preOrder(1);
        System.out.println();
        binaryTree.inOrder(1);
        System.out.println();
        binaryTree.postOrder(1);
        System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.delete("N5");
        System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.deleteTree();
        System.out.println();
        binaryTree.levelOrder();
    }
}
