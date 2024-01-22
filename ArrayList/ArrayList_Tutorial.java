package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Tutorial {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        System.out.println(numberList);
        System.out.println(findNumber(numberList, 30));
        System.out.println(deleteNumber(numberList, 30));
        System.out.println(numberList);
        System.out.println(insertNumber(numberList, 40));
        System.out.println(numberList);
    }

    // Accessing elements if statement // .get() // arraylist if.contains // object for if.equals
    // arrayList.indexOf
    public static boolean findNumber(List<Integer> numberList, int numb){
            if (numberList.contains(numb)) {
                return true;
            }
        return false;
    }
    public static boolean deleteNumber(List<Integer> numberList, int numb){
            if (numberList.contains(numb)) {
                numberList.remove(numberList.indexOf(numb));
                return true;
            }
        return false;
    }

    private static boolean insertNumber(List<Integer> numberList, int numb) {
            if (!(numberList.contains(numb))) {
                numberList.add(numb);
                return true;
            }
        return false;
    }
}
