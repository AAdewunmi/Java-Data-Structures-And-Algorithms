package LinkedList.CircularSinglyLinkedList.ChatGPT_Implementation;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    // Add a node to the end of the circular linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself since it's the only node
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; // Make it circular
        }
    }

    // Insert a node at a specified location in the circular linked list
    public void insert(int position, int data) {
        if (position < 0) {
            System.out.println("Invalid position. Position must be non-negative.");
            return;
        }

        Node newNode = new Node(data);
        // Insert at the head of the circular linked list
        if (position == 0) {
            newNode.next = head;
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            head = newNode;
        } else {
            int currentPosition = 0;
            Node current = head;
            while (currentPosition < position - 1 && current.next != head) {
                current = current.next;
                currentPosition++;
            }
            if (current.next == head && currentPosition != position - 1) {
                System.out.println("Position is out of bounds.");
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // Traverse and print the circular linked list
    public void traverse() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Delete a node at a specified location in the circular linked list
    public void delete(int position) {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        if (position == 0) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
        } else {
            int currentPosition = 0;
            Node current = head;
            Node previous = null;

            while (currentPosition < position && current.next != head) {
                previous = current;
                current = current.next;
                currentPosition++;
            }

            if (current == head) {
                System.out.println("Position is out of bounds.");
            } else {
                previous.next = current.next;
            }
        }
    }

    // Delete the entire circular linked list
    public void deleteList() {
        head = null;
    }

    // Reverse the circular linked list
    public void reverse() {
        if (head == null || head.next == head) {
            return;  // No need to reverse an empty or a single-element list
        }

        Node prev = null;
        Node current = head;
        Node next = null;
        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);

        head.next = prev;
        head = prev;
    }

    // Search for a node with a specific value in the circular linked list
    public boolean search(int value) {
        if (head == null) {
            return false;
        }

        Node current = head;
        do {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // 1. Create New Circular Linked List
        list.append(1);
        list.append(2);
        list.append(3);

        // 2. Insert Node At Location
        list.insert(1, 4);

        // 3. Traverse Circular Linked List
        System.out.print("Circular Linked List: ");
        list.traverse();

        // 4. Delete Node At Location
        list.delete(2);
        System.out.print("Circular Linked List: ");
        list.traverse();

        // 6. Reverse Circular Linked List
        list.append(5);
        list.append(6);
        System.out.print("Reversed Circular Linked List: ");
        list.reverse();
        list.traverse();

        // 7. Search For Node In Circular Linked List
        System.out.println("Search for 3: " + list.search(3)); // Should print false
        System.out.println("Search for 5: " + list.search(5)); // Should print true

        // 5. Delete Entire Circular Linked List
        list.deleteList();
        list.traverse();
    }
}
