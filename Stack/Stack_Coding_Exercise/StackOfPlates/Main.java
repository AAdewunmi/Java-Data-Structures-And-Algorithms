package Stack.Stack_Coding_Exercise.StackOfPlates;

public class Main {
    public static void main(String[] args) {
        SetOfStacks newStack = new SetOfStacks(3);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        System.out.println(newStack.popAt(0));
    }
}
