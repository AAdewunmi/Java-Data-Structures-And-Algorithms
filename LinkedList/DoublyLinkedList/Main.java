package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createDoublyNode(1);
        doublyLinkedList.insertDoublyNode(2, 0);
        doublyLinkedList.insertDoublyNode(3, 1);
        doublyLinkedList.insertDoublyNode(4, 7);
        doublyLinkedList.traverseDoublyLinkedList();
        doublyLinkedList.reverseTraverseDoublyLinkedList();
        doublyLinkedList.searchNodeDoublyLinkedList(10);
        doublyLinkedList.deleteNodeDoublyLinkedList(2);
        System.out.println();
        doublyLinkedList.reverseTraverseDoublyLinkedList();
        doublyLinkedList.deleteEntireDoublyLinkedList();
    }

    static class DoublyNode{
        public int value;
        public DoublyNode next;
        public DoublyNode prev;
    }

    static class DoublyLinkedList{
        DoublyNode head;
        DoublyNode tail;
        int size;

        public DoublyNode createDoublyNode(int nodeValue){
            head = new DoublyNode();
            DoublyNode newNode = new DoublyNode();
            newNode.value = nodeValue;
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            tail = newNode;
            size = 1;
            return head;
        }

        public void insertDoublyNode(int nodeValue, int location){
            DoublyNode newNode = new DoublyNode();
            newNode.value = nodeValue;
            if (head == null) {
                createDoublyNode(nodeValue);
                return;
            } else if (location == 0) {
                // insert at the beginning of list
                newNode.next = head;
                newNode.prev = null;
                head.prev = newNode;
                head = newNode;
            } else if (location >= size) {
                // insert at the end of list
                newNode.next = null;
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }else{
                // insert specified location
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

        public void traverseDoublyLinkedList(){
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
                System.out.println("The Doubly Linked List does not exist!");
            }
            System.out.println("\n");
        }

        public void reverseTraverseDoublyLinkedList(){
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
                System.out.println("The Doubly Linked List does not exist!");
            }
            System.out.println("\n");
        }

        public boolean searchNodeDoublyLinkedList(int nodeValue){
            if(head != null){
                DoublyNode tempNode = head;
                for (int i = 0; i < size; i++) {
                    if (tempNode.value == nodeValue) {
                        System.out.println("The Node is found at location: " + i);
                        return true;
                    }
                    tempNode = tempNode.next;
                }
            }
            System.out.println("Node not found!");
            return false;
        }

        public void deleteNodeDoublyLinkedList(int location){
            if (head == null) {
                System.out.println("The Doubly Linked List does not exist");
                return;
            } else if (location == 0) {
                // Delete from start of List
                if (size == 1) {
                    head = null;
                    tail = null;
                    size--;
                    return;
                }else {
                    head = head.next;
                    head.prev = null;
                    size--;
                }
            }else if (location >= size) {
                // Delete from end of List
                DoublyNode tempNode = tail.prev;
                if (size == 1) {
                    head = null;
                    tail = null;
                    size--;
                    return;
                }else {
                    tempNode.next = null;
                    tail = tempNode;
                    size--;
                }
            }else{
                // Specified location
                DoublyNode tempNode = head;
                for (int i = 0; i < location - 1; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = tempNode.next.next;
                tempNode.next.prev = tempNode;
                size--;
            }
        }

        public void deleteEntireDoublyLinkedList(){
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("The Doubly Linked List has been deleted!");
        }
    }

}
