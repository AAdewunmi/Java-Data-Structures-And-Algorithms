package Queue.Queue_Circular_Array;

public class Queue_Circular_Array {

    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;
    // Create Circular Array Queue Method
    public Queue_Circular_Array(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        this.size = size;
        System.out.println("The Queue Circular Array has been successfully created with a size of " + size);
    }

    // Create isEmpty Method
    public boolean isEmpty(){
        if (topOfQueue == -1) {
            return true;
        }else{
            return false;
        }
    }

    // Create isFull Method
    public boolean isFull(){
        if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        }else if (beginningOfQueue == 0 && topOfQueue + 1 == size){
            return true;
        }else{
            return false;
        }
    }

    // Create enQueue Method
    public void enQueue(int value){
        if (isFull()) {
            System.out.println("The Queue Circular Array is full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value +
                    " into the queue!");
        } else{
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            }else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value +
                    " into the queue!");
        }
    }

    // Create deQueue Method
    public int deQueue(){
        if (isEmpty()) {
            System.out.println("The Queue Circular Array is Empty!");
            return - 1;
        }else{
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            }else{
                beginningOfQueue++;
            }
            return result;
        }
    }

    // Create Peek Method
    public int peek(){
        if (isEmpty()) {
            System.out.println("The Queue Circular Array is Empty!");
            return -1;
        }else {
            return arr[beginningOfQueue];
        }
    }

    // Create Delete Method
    public void deleteQueue(){
        arr = null;
        System.out.println("The Queue Circular Array has been deleted!");
    }
}
