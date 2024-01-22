package Queue.Queue_LinkedList;

public class SinglyLinkedList {
    // SinglyLinked List Class Variables
    public Node head;
    public Node tail;
    public int size;

    // SinglyLinked List Class Operations
    // (1) Create SinglyLinked LIST
    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // (2) Insert Value into SinglyLinked LIST
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        // If List exists or not
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
            // Insert at head
        } else if (location == 0) {
            node.next = head;
            head = node;
            // At tail
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            // At a specific location
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // (3) Implement SinglyLinked LIST Traversal
    public void traversalSinglyLinked(){
        if (head == null) {
            System.out.println("SLL does not exist!");
        }else{
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // (4) Implement SinglyLinked LIST search for a node
    boolean searchNode(int nodeValue){
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    // (5) Implement SinglyLinked LIST delete a node (beginning, end, or anywhere)
    public void deletionOfNode(int location){
        if (head == null) {
            System.out.println("The SLL does not exist!");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else{
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteSLL(){
        head = null;
        tail = null;
        System.out.println("The SLL has been deleted successfully.");
    }
}
