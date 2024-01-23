package LinkedList.SinglyLinkedList.ChatGPT_Implementation;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    // 1. Append (Add a node to the end of the list)
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // 2. Insert (Insert a node at a specific position)
    public void insert(int position, int data) {
        if (position < 0) {
            System.out.println("Invalid position. Position must be non-negative.");
            return;
        }

        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int currentPosition = 0;
            while (currentPosition < position - 1 && current != null) {
                current = current.next;
                currentPosition++;
            }

            if (current == null) {
                System.out.println("Position is out of bounds.");
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // 3. Traverse (Display the elements in the list)
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 4. Delete (Delete a node at a specific position)
    public void delete(int position) {
        if (position < 0) {
            System.out.println("Invalid position. Position must be non-negative.");
            return;
        }

        if (position == 0) {
            if (head != null) {
                head = head.next;
            }
        } else {
            Node current = head;
            int currentPosition = 0;
            while (currentPosition < position - 1 && current != null) {
                current = current.next;
                currentPosition++;
            }

            if (current == null || current.next == null) {
                System.out.println("Position is out of bounds.");
            } else {
                current.next = current.next.next;
            }
        }
    }

    // 5. Delete Entire List
    public void deleteList() {
        head = null;
    }

    // 6. Reverse List
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // 7. Search (Search for a node with a given value)
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
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        System.out.print("Singly Linked List: ");
        list.traverse();

        list.insert(1, 4);
        System.out.print("After inserting 4 at position 1: ");
        list.traverse();

        list.delete(2);
        System.out.print("After deleting node at position 2: ");
        list.traverse();

        System.out.println("Search for 3: " + list.search(3));
        System.out.println("Search for 5: " + list.search(5));

        list.reverse();
        System.out.print("After reversing: ");
        list.traverse();

        list.deleteList();
        System.out.print("After deleting the entire list: ");
        list.traverse();
    }
}

