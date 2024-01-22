package LinkedList.CircularSinglyLinkedList;

// Step 1: Create Main Class (Node // Circular Linked List)
public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        circularSinglyLinkedList.createCircularSinglyLinkedList(5);
        circularSinglyLinkedList.insertInCircularLinkedList(4,0);
        circularSinglyLinkedList.insertInCircularLinkedList(6,1);
        circularSinglyLinkedList.insertInCircularLinkedList(7,8);
        //System.out.println(circularSinglyLinkedList.head.value);
        //System.out.println(circularSinglyLinkedList.head.next.value);
        circularSinglyLinkedList.traverseCircularLinkedList();
        circularSinglyLinkedList.searchCircularLinkedList(6);
        circularSinglyLinkedList.deleteNodeCircularLinkedList(8);
        circularSinglyLinkedList.traverseCircularLinkedList();
        circularSinglyLinkedList.deleteCircularLinkedList();
        circularSinglyLinkedList.traverseCircularLinkedList();

    }
    // Step 2: Create Node Class (Value / Next)
    static class Node{
        private int value;
        private Node next;
    }

    // Step 3: Create Circular Linked List Class (Implement methods: Insert, Delete, Update, Search, Traverse, Reverse)
    static class CircularSinglyLinkedList {
        private Node head;
        private Node tail;
        private int size;

        // Step 4: Method for creating a circular linked list
        public Node createCircularSinglyLinkedList(int nodeValue){
            head = new Node();
            Node node = new Node();
            node.value = nodeValue;
            node.next = node;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        // Step 5: Method for inserting a new value in circular linked list
        public void insertInCircularLinkedList(int nodeValue, int location){
            Node node = new Node();
            node.value = nodeValue;
            // If List exists or not
            if (head == null) {
                createCircularSinglyLinkedList(nodeValue);
                return;
                // Insert at head
            }else if (location == 0) {
                node.next = head;
                head = node;
                tail.next = head;
                // Insert at end
            } else if (location >= size) {
                tail.next = node;
                tail = node;
                tail.next = head;
            }else{
                Node tempNode = head;
                int index = 0;
                // At a specific location
                while(index < location - 1){
                    tempNode = tempNode.next;
                    index++;
                }
                node.next = tempNode.next;
                tempNode.next = node;
            }
            size++;
        }

        // Step 6: Method for traversing circular linked list
        public void traverseCircularLinkedList(){
            if (head != null) {
                Node tempNode = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    if (i != size - 1) {
                        System.out.print(" -> ");
                    }
                    tempNode = tempNode.next;
                }
                System.out.println("\n");
            }else{
                System.out.println("\n CircularLinkedList does not exist!");
            }
        }

        // Step 7: Method for searching circular linked list
        public boolean searchCircularLinkedList(int nodeValue){
            if (head != null) {
                Node tempNode = head;
                for (int i = 0; i < size; i++) {
                    if (tempNode.value == nodeValue) {
                        System.out.println("Found node at location: " + i);
                        return true;
                    }
                    tempNode = tempNode.next;
                }
            }
            System.out.println("Node not found! ");
            return false;
        }

        // Step 8: Method for deleting single node in a Circular Linked List
        public void deleteNodeCircularLinkedList(int location){
            if (head == null) {
                System.out.println("The Circular Linked List does not exist!");
                return;
            }else if(location == 0){
                // Delete an element from the beginning of the list
                head = head.next;
                tail.next = head;
                size--;
                if (size == 0) {
                    tail = null;
                    head.next = null;
                    head = null;
                }
            }else if (location >= size) {
                // Delete an element from the end of the list
                Node tempNode = head;
                for (int i = 0; i < size - 1; i++) {
                    tempNode = tempNode.next;
                }
                if (tempNode == head) {
                    head.next = null;
                    tail = head = null;
                    size--;
                    return;
                }
                tempNode.next = head;
                tail = tempNode;
                size--;
            }else {
                // Delete an element from any given location
                Node tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next.next;
                }
                tempNode.next = tempNode.next.next;
                size--;
            }
        }
        // Step 9: Method for deleting entire Circular Linked List
        public void deleteCircularLinkedList(){
            if (head == null) {
                System.out.println("The CircularLinkedList does not exist!");
            }else{
                head = null;
                tail.next = null;
                tail = null;
                System.out.println("The CircularLinkedList has been deleted!");
            }
        }
    }
}
