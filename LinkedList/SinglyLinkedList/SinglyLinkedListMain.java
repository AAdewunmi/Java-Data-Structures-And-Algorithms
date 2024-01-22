package LinkedList.SinglyLinkedList;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSinglyLinkedList(5);
        //System.out.println(singlyLinkedList.head.value);
        singlyLinkedList.insertInLinkedList(6, 1);
        singlyLinkedList.insertInLinkedList(7, 3);
        singlyLinkedList.insertInLinkedList(8, 4);
        singlyLinkedList.insertInLinkedList(9, 0);
        //System.out.println(singlyLinkedList.head.next.next.value);
        singlyLinkedList.traversalSinglyLinked();
        singlyLinkedList.searchNode(9);
        singlyLinkedList.deleteSLL();
        singlyLinkedList.traversalSinglyLinked();
    }
}
