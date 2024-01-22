package LinkedList.CrackingLinkedListInterviewQuestions;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList_1 = new SinglyLinkedList();
        singlyLinkedList_1.createSinglyLinkedList(1);
        singlyLinkedList_1.insertNode(2);
        singlyLinkedList_1.insertNode(3);
        singlyLinkedList_1.insertNode(2);
        singlyLinkedList_1.insertNode(5);
        singlyLinkedList_1.traverseSinglyLinkedList();
        singlyLinkedList_1.deleteDups(singlyLinkedList_1);
        singlyLinkedList_1.traverseSinglyLinkedList();
        /*LinkedList.SinglyLinkedList.java singlyLinkedList_2 = new LinkedList.SinglyLinkedList.java();
        singlyLinkedList_1.createSinglyLinkedList(5);
        singlyLinkedList_1.insertNode(6);
        singlyLinkedList_1.insertNode(4);
        singlyLinkedList_1.reverseTraverseSinglyLinkedList();*/

    } // end main
    static class Node{
        public int nodeValue;
        public Node nodeNext;
        public Node nodePrev;
    } // end Node Class

    static class SinglyLinkedList{
        public Node head;
        public Node tail;
        public int size;
        public void createSinglyLinkedList(int nodeValue){
            Node newNode = new Node();
            newNode.nodeValue = nodeValue;
            newNode.nodeNext = null;
            head = newNode;
            tail = newNode;
            size = 1;
        }
        public void insertNode(int nodeValue){
                Node newNode = new Node();
                newNode.nodeValue = nodeValue;
                newNode.nodeNext = null;
                tail.nodeNext = newNode;
                tail = newNode;
                size++;
        }

        public void traverseSinglyLinkedList(){
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.nodeValue);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.nodeNext;
            }
            System.out.println("\n");
        }

        public void deleteDups(SinglyLinkedList singlyLinkedList){
            HashSet<Integer> hashSet = new HashSet<>();
            Node current = singlyLinkedList.head;
            Node prev = null;
            while(current != null){
               int curval = current.nodeValue;
                if (hashSet.contains(curval)) {
                    prev.nodeNext = current.nodeNext;
                    singlyLinkedList.size--;
                }else{
                    hashSet.add(curval);
                    prev = current;
                }
                current = current.nodeNext;
            }
        }

    } // end LinkedList.SinglyLinkedList.java Class

}// end Main Class
