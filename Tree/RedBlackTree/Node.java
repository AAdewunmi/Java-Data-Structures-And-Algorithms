package Tree.RedBlackTree;

public class Node {
    int data;
    Color color;
    Node left, right, parent;

    public Node(int data) {
        this.data = data;
        color = Color.RED; // new nodes are always red by default
        left = right = parent = null;
    }
}
