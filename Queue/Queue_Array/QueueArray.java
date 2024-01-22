package Queue.Queue_Array;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    // Create Queue Method
    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with size of: " + size);
    }
    // isFull Method
    public boolean isFull(){
        if (topOfQueue == arr.length - 1) {
            return true;
        }else {
            return false;
        }
    }

    // isEmpty Method
    public boolean isEmpty(){
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
            return true;
        }else{
            return false;
        }
    }

    // EnQueue Method
    public void enQueue(int value){
        if (isFull()) {
            System.out.println("The Queue is full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " into queue!");
        }else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " into queue!");
        }
    }

    // DeQueue Method
    public int deQueue(){
        if (isEmpty()) {
            System.out.println("The Queue is Empty!");
            return -1;
        }else{
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // Peek
    public int peek(){
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        }else {
            System.out.println("The Queue is Empty!");
            return -1;
        }
    }

    public void delete(){
        arr = null;
        System.out.println("The Queue has been successfully deleted!");
    }

}
