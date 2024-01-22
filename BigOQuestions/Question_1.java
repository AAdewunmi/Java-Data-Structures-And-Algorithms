package BigOQuestions;

public class Question_1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
        }
        System.out.println("Sum = " + sum + " , " + "Product = " + product);
    }
}
