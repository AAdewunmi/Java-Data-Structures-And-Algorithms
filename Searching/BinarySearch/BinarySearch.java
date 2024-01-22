package Searching.BinarySearch;

public class BinarySearch {
    public int binarySearch(int[] array, int number){
        int startIndex = 0;
        int endIndex = array.length - 1;
        while(startIndex <= endIndex){
            int middleIndex = (startIndex + endIndex)/2; // O(Log N)
            if (array[middleIndex] == number) {
                System.out.println("Number " + number + " is in array!");
                return middleIndex;
            } else if (number > array[middleIndex]) {
                startIndex = middleIndex + 1;
            }else {
                endIndex = middleIndex - 1;
            }
        }
        System.out.println("Number " + number + " is not in array!");
        return -1;
    }
}
