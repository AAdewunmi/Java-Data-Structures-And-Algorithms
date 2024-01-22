package Stack.Stack_Coding_Exercise.MinStack;

public class Main {
    public static void main(String[] args) {
        StackMin stackMin = new StackMin();
        stackMin.push(3);
        stackMin.push(5);
        stackMin.push(2);
        System.out.println(stackMin.min());
    }
}
