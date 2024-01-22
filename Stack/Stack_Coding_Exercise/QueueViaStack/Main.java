package Stack.Stack_Coding_Exercise.QueueViaStack;

public class Main {
    public static void main(String[] args) {
        QueueViaStack queueViaStack = new QueueViaStack();
        queueViaStack.enqueue(1);
        queueViaStack.enqueue(2);
        queueViaStack.enqueue(3);
        System.out.println(queueViaStack.deQueue());
    }
}
