package Stack.Stack_Coding_Exercise.QueueViaStack;

import java.util.Stack;

public class QueueViaStack {
    Stack<Integer> stackNewest, stackOldest;
    public QueueViaStack(){
        this.stackNewest = new Stack<>();
        this.stackOldest = new Stack<>();
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    public void enqueue(int value){
        stackNewest.push(value);
    }

    private void shiftStacks(){
        if (stackOldest.isEmpty()) {
            while(!stackNewest.isEmpty()){
                int poppedOut = stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    public int deQueue(){
        shiftStacks();
        return stackOldest.pop();
    }

    public int peek(){
        shiftStacks();
        return stackOldest.peek();
    }
}
