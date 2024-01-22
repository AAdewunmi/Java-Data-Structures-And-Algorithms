package Stack.Stack_Array;

public class Main {

    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.pop();
        System.out.println(newStack.peek());
        //System.out.println(newStack.isEmpty());
        //System.out.println(newStack.isFull());
        newStack.deleteStack();
    }

    static class Stack{
        int[] arr;
        int topOfStack;

        // Create Stack
        public Stack(int size){
            this.arr = new int[size];
            this.topOfStack = -1;
            System.out.println("The Stack is created with size of: " + size);
        }
        // Create isEmpty method
        public boolean isEmpty(){
            if (topOfStack == -1) {
                return true;
            }else{
                return false;
            }
        }
        // Create isFull method
        public boolean isFull(){
            if (topOfStack == arr.length - 1) {
                System.out.println("The Stack is full!");
                return true;
            }else{
                return false;
            }
        }
        // Create Push method
        public void push(int value){
            if (isFull()) {
                System.out.println("The Stack is full!");
            }else{
                arr[topOfStack + 1] = value;
                topOfStack++;
                System.out.println("The value has been successfully inserted");
            }
        }
        // Create Pop method
        public int pop(){
            if (isEmpty()) {
                System.out.println("The stack is empty");
                return -1;
            }
            else{
                int topStack = arr[topOfStack];
                topOfStack--;
                return topStack;
            }
        }
        // Create Peek method
        public int peek(){
            if (isEmpty()) {
                System.out.println("The stack is empty!");
                return -1;
            }else{
                return arr[topOfStack];
            }
        }
        // Create Delete method
        public void deleteStack(){
            arr = null;
            System.out.println("The Stack is successfully deleted!");
        }
    }

}
