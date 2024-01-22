package BigOQuestions;

import java.util.Arrays;

public class Question_6 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length/2; i++) {
            int other = numbers.length - i - 1;
            int temp = numbers[i];
            numbers[i] = numbers[other];
            numbers[other] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
