package Queue.Queue_Circular_Array;

public class Main {
    public static void main(String[] args) {
        Queue_Circular_Array queue_circular_array =
                new Queue_Circular_Array(3);
       queue_circular_array.enQueue(10);
       queue_circular_array.enQueue(20);
       queue_circular_array.enQueue(30);
       System.out.println(queue_circular_array.deQueue());
       System.out.println(queue_circular_array.peek());
       queue_circular_array.deleteQueue();
    }
}
