package Queue.Queue_Array;

public class Main {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(3);
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        System.out.println(queueArray.deQueue());
        System.out.println(queueArray.peek());
        System.out.println(queueArray.deQueue());
        System.out.println(queueArray.peek());
        //queueArray.delete();
        System.out.println(queueArray.isEmpty());
        System.out.println(queueArray.isFull());


    }
}
