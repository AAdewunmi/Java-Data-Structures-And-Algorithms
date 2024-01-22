package Searching.LinearSearch;

public class LinearSearch {

    public int linearSearch(int[] arrayNumber, int number){
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] == number) {
                System.out.println("Found number: " + number);
                return i;
            }
        }
        System.out.println("Number not found!");
        return -1;
    }
}
