package LinkedList.DoublyLinkedList.ChatGPT_Implementation;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // 1. Append (Add a node to the end of the list)
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // 2. Insert (Insert a node at a specified position)
    public void insert(int position, int data) {
        if (head == null) {
            append(data);
            return;
        }

        Node newNode = new Node(data);

        if (position == 0) {
            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            }
            head = newNode;
        } else if (position >= size) {
            append(data);
        } else {
            Node current = head;
            int currentPosition = 0;

            while (currentPosition < position - 1) {
                current = current.next;
                currentPosition++;
            }

            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }

    // 3. Traverse (Display the elements in the list)
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 4. Delete (Delete a node at a specified position)
    public void delete(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position. Position must be between 0 and " + (size - 1));
            return;
        }

        if (position == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (position == size - 1) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            Node current = head;
            int currentPosition = 0;

            while (currentPosition < position) {
                current = current.next;
                currentPosition++;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    // 5. Delete Entire List
    public void deleteList() {
        head = null;
        tail = null;
        size = 0;
    }

    // 6. Reverse List
    public void reverse() {
        Node current = head;
        while (current != null) {
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        }
        Node temp = head;
        head = tail;
        tail = temp;
    }

    // 7. Search for a node with a given value
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Get the size of the list
    public int size() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(1);
        //list.append(2);
        //list.append(3);

        System.out.print("Doubly Linked List: ");
        list.traverse();

        list.insert(0, 2);
        list.insert(1, 3);
        list.insert(7, 4);
        //System.out.print("After inserting 4 at position 1: ");
        list.traverse();

        list.delete(2);
        System.out.print("After deleting node at position 2: ");
        list.traverse();

        System.out.println("Search for 3: " + list.search(3));

        list.reverse();
        System.out.print("After reversing: ");
        list.traverse();

        list.deleteList();
        System.out.print("After deleting the entire list: ");
        list.traverse();
    }
}




