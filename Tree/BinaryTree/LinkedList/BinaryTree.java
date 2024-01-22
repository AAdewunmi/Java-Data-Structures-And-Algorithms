package Tree.BinaryTree.LinkedList;

import java.util.*;

public class BinaryTree {
    BinaryNode root;
    // Create Tree.BinaryTree
    public BinaryTree() {
        this.root = null;
        System.out.println("Binary Tree Created!");
    }

    // PreOrder Traversal (RLR) Method
    public void preOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        System.out.print(node.value + " -> ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // InOrder Traversal (LRR) Method
    public void InOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        InOrder(node.left);
        System.out.print(node.value + " -> ");
        InOrder(node.right);
    }

    // PostOrder Traversal (LRR) Method
    public void postOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " -> ");
    }

    // LevelOrder Traversal Based On Queue DS (LRR) Method
    public void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " -> ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    // Search Method
    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("The value - " + value + " is found in Tree.");
                return;
            }else {
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value - " + value + " is not found in Tree.");
    }

    // Insert Method
    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("Inserted new node at Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully Inserted");
                break;
            }else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully Inserted");
                break;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }

    // Helper function - Get Deepest Node
    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                previousNode.right = null;
                return;
            }else if (presentNode.right == null) {
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    public void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("\nThe node does not exist in this Binary Tree");
    }

    public void deleteBinaryTree(){
        root = null;
        System.out.println("Binary Tree has been  successfully deleted!");
    }
}
