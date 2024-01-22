package LinkedList.CircularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        circularDoublyLinkedList.createCircularDoublyLinkedList(1);
        circularDoublyLinkedList.insertNodeCircularDoublyLinkedList(2, 0);
        circularDoublyLinkedList.insertNodeCircularDoublyLinkedList(3, 2);
        circularDoublyLinkedList.insertNodeCircularDoublyLinkedList(4, 5);
        circularDoublyLinkedList.traverseCircularDoublyLinkedList();
        circularDoublyLinkedList.reverseCircularDoublyLinkedList();
        System.out.println();
        circularDoublyLinkedList.searchNodeCircularDoublyLinkedList(3);
        circularDoublyLinkedList.searchNodeCircularDoublyLinkedList(10);
        circularDoublyLinkedList.deleteNodeCircularDoublyLinkedList(2);
        circularDoublyLinkedList.traverseCircularDoublyLinkedList();
        circularDoublyLinkedList.deleteCircularDoublyLinkedList();
        circularDoublyLinkedList.traverseCircularDoublyLinkedList();
    }

    static class DoublyNode{
        public int value;
        public DoublyNode next;
        public DoublyNode prev;
    }

    static class CircularDoublyLinkedList{
        public DoublyNode head;
        public DoublyNode tail;
        public int size;

        public DoublyNode createCircularDoublyLinkedList(int nodeValue){
            head = new DoublyNode();
            DoublyNode newNode = new DoublyNode();
            newNode.value = nodeValue;
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
            size = 1;
            return head;
        }

        public void insertNodeCircularDoublyLinkedList(int nodeValue, int location){
            DoublyNode newNode = new DoublyNode();
            newNode.value = nodeValue;
            if (head == null) {
                createCircularDoublyLinkedList(nodeValue);
                return;
            } else if (location == 0) {
                // Insert at the beginning to List
                newNode.next = head;
                newNode.prev = tail;
                head.prev = newNode;
                tail.next = newNode;
                head = newNode;
            } else if (location >= size) {
                // Insert at end of List
                newNode.next = head;
                newNode.prev = tail;
                head.prev = newNode;
                tail.next = newNode;
                tail = newNode;
            } else {
                // Insert at a specified location
                DoublyNode tempNode = head;
                int index = 0;
                while(index < location - 1){
                    tempNode = tempNode.next;
                    index++;
                }
                newNode.prev = tempNode;
                newNode.next = tempNode.next;
                tempNode.next = newNode;
                newNode.next.prev = newNode;
            }
            size++;
        }

        public void traverseCircularDoublyLinkedList(){
            if (head != null) {
                DoublyNode tempNode = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    if (i != size - 1) {
                        System.out.print(" -> ");
                    }
                    tempNode = tempNode.next;
                }
            }else{
                System.out.println("The Circular Doubly Linked List does not exist");
            }
            System.out.println();
        }

        public void reverseCircularDoublyLinkedList(){
            if (head != null) {
                DoublyNode tempNode = tail;
                for (int i = 0; i < size; i++) {
                    System.out.print(tempNode.value);
                    if (i != size - 1) {
                        System.out.print(" <- ");
                    }
                    tempNode = tempNode.prev;
                }
            }else{
                System.out.println("The Circular Doubly Linked List does not exist");
            }
        }

        public boolean searchNodeCircularDoublyLinkedList(int nodeValue){
            if (head != null) {
                DoublyNode tempNode = head;
                for (int i = 0; i < size; i++) {
                    if (tempNode.value == nodeValue) {
                        System.out.println("The node is found at location: " + i);
                        return true;
                    }
                    tempNode = tempNode.next;
                }
            }
            System.out.println("Node not found!");
            return false;
        }

        public void deleteNodeCircularDoublyLinkedList(int location){
            if (head == null) {
                System.out.println("The Circular Doubly LinkedList does not exist!");
                return;
            } else if (location == 0) {
                // delete head position
                if (size == 1) {
                    head.prev = null;
                    head.next = null;
                    head = tail = null;
                    size--;
                    return;
                }else{
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                    size--;
                }
            } else if (location >= size) {
                // delete tail position
                if (size == 1) {
                    head.prev = null;
                    head.next = null;
                    head = tail = null;
                    size--;
                    return;
                }else{
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                    size--;
                }
            }else {
                // delete at specified location
                DoublyNode tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                tempNode.next.prev = tempNode;
                size--;
            }
        }

        public void deleteCircularDoublyLinkedList(){
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("The Circular Doubly LinkedList has been deleted!");
        }
    }

}
