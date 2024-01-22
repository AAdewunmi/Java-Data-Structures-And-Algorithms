package BigOQuestions;

public class Question_2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[i] + "," + numbers[j]);
            }
        }
    }
}
