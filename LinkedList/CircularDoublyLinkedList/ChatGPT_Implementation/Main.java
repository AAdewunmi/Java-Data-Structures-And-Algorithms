package LinkedList.CircularDoublyLinkedList.ChatGPT_Implementation;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = this;
        this.next = this;
    }
}

class CircularDoublyLinkedList {
    Node head;
    int size = 0;

    // 1. Append
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
        size++;
    }

    // 2. Insert at a position and keep track of size
    public void insert(int position, int data) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position.");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            if (head == null) {
                head = newNode;
            } else {
                Node last = head.prev;
                newNode.next = head;
                newNode.prev = last;
                head.prev = newNode;
                last.next = newNode;
                head = newNode;
            }
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }

    // 3. Traverse
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // 4. Delete a node
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        do {
            if (current.data == data) {
                if (current == head) {
                    if (size == 1) {
                        head = null;
                    } else {
                        head.prev.next = current.next;
                        current.next.prev = head.prev;
                        head = head.next;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        } while (current != head);
        System.out.println("Element not found.");
    }

    // 5. Delete entire list
    public void deleteEntireList() {
        head = null;
        size = 0;
    }

    // 6. Reverse list
    public void reverse() {
        if (head == null || size == 1) {
            return;
        }
        Node current = head, temp;
        do {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        } while (current != head);
        head = head.prev;
    }

    // 7. Search
    public boolean search(int data) {
        if (head == null) {
            return false;
        }
        Node current = head;
        do {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        } while (current != head);
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.append(1);
        //list.append(20);
        //list.append(30);
        //list.append(40);
        list.traverse(); // 10 20 30 40
        list.insert(3, 2);
        list.insert(5, 3);
        list.insert(7, 4);
        list.traverse(); // 5 10 20 30 40
        list.delete(10);
        list.traverse(); // 5 20 30 40
        System.out.println(list.search(5)); // true
        System.out.println(list.search(60)); // false
        list.reverse();
        list.traverse(); // 40 30 20 5
        list.deleteEntireList();
        list.traverse(); // List is empty.
    }
}


