package Queue.Queue_LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue_LinkedList queue_linkedList = new Queue_LinkedList();
        queue_linkedList.enQueue(10);
        queue_linkedList.enQueue(20);
        queue_linkedList.enQueue(30);
        System.out.println(queue_linkedList.deQueue());
        System.out.println(queue_linkedList.peek());
        queue_linkedList.delete();
    }
}
