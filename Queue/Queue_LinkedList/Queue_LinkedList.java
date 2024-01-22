package Queue.Queue_LinkedList;

public class Queue_LinkedList {
    SinglyLinkedList singlyLinkedList;

    public Queue_LinkedList() {
        this.singlyLinkedList = new SinglyLinkedList();
        System.out.println("The Queue has been created!");
    }

    // isEmpty Method
    public boolean isEmpty(){
        if (singlyLinkedList.head == null) {
            return true;
        }else{
            return false;
        }
    }

    // enQueue Method
    public void enQueue(int value){
        singlyLinkedList.insertInLinkedList(value, singlyLinkedList.size);
        System.out.println("Successfully inserted " + value + " into the queue.");
    }

    // deQueue Method
    public int deQueue(){
        int value = - 1;
        if (isEmpty()) {
            System.out.println("The Queue is Empty!");
        }else{
            value = singlyLinkedList.head.value;
            singlyLinkedList.deletionOfNode(0);
        }
        return value;
    }

    // peek Method
    public int peek(){
        if (isEmpty()) {
            System.out.println("The Queue is Empty!");
            return - 1;
        }else{
            return singlyLinkedList.head.value;
        }
    }

    // delete Method
    public void delete(){
        singlyLinkedList.head = null;
        singlyLinkedList.tail = null;
        System.out.println("The Queue has been succesfully deleted!");
    }
}
