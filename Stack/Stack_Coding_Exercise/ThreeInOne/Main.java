package Stack.Stack_Coding_Exercise.ThreeInOne;

public class Main {
    public static void main(String[] args) {
        ThreeInOne threeInOne = new ThreeInOne(3);
        threeInOne.push(0, 1);
        threeInOne.push(0, 2);
        threeInOne.push(1, 3);
        threeInOne.push(1, 4);
        threeInOne.push(2, 5);
        threeInOne.push(2, 6);
        System.out.println(threeInOne.pop(0));

        System.out.println(threeInOne.pop(0));

    }
}
