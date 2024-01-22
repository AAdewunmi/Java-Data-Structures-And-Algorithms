package Arrays;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[][] arrayMatrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arrayMatrix));
        System.out.println(rotateMatrix(arrayMatrix));
        System.out.println(Arrays.deepToString(arrayMatrix));
    }

    public static boolean rotateMatrix(int[][] matrix){
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for(int layer = 0; layer < n/2; layer++){
           int first = layer;
           int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }

    /*private static boolean permutation(int[] array1, int[] array2) {
        int sumArray1 = 0;
        int mulArray1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sumArray1 += array1[i];
            mulArray1 *= array1[i];
        }
        int sumArray2 = 0;
        int mulArray2 = 0;
        for (int i = 0; i < array2.length; i++) {
            sumArray2 += array2[i];
            mulArray2 *= array2[i];
        }
        if ((sumArray1 == sumArray2) && (mulArray1 == mulArray2)) {
            return true;
        }
        return false;
    }*/

    /*public static boolean isUnique(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }*/

    /*private static String maxProduct(int[] myArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] * myArray[j] > maxProduct) {
                    maxProduct = myArray[i] * myArray[j];
                    pairs = Integer.toString(myArray[i]) + "," + Integer.toString(myArray[j]);
                }
            }
        }
        return pairs;
    }*/

    /*public static int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                return i;
            }
        }
        return -1;
    }*/

    // O(n) complexity
   /* private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }*/

    //O(n2) Complexity
   /* private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }*/

    /*private static int maxProfit(int[] prices ){
        int min_price = 0;
        int profit = 0;

        if (profit < 0) {
            return 0;
        }

        for (int price: prices) {
            if (price < min_price) {
                min_price = price;
            }else if (price - min_price > profit){
                profit = price - min_price;
            }
        }

        return profit;
    }*/

    /*private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }*/

    /*private static int[] removeDuplicate(int[] arr) {
        int[] newArray = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean uniqueNumber = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    uniqueNumber = true;
                    break;
                }
            }
            if (!(uniqueNumber)) {
                newArray[index++] = arr[i];
            }
        }
        return Arrays.copyOf(newArray, index);
    }*/

    /*private static int findMissingNumberInArray(int[] myArray) {
        int i = myArray.length + 1;
        int sumArrayWithNumber = (i * (i + 1)) / 2; // 21
        int sumArrayWithOutNumber = 0;
        for (int j = 0; j < myArray.length; j++) {
            sumArrayWithOutNumber += myArray[j]; // 16
        }
        return sumArrayWithNumber - sumArrayWithOutNumber;
    }*/

    /*private static int[] firstSecond(int[] myArray) {
        int firstScore = 0;
        int secondScore = 0;

        for (int score: myArray) {
            if (score >  firstScore) {
                secondScore = firstScore;
                firstScore = score;
            }else if(score > secondScore && score < firstScore){
                secondScore = score;
            }
        }

        return new int[] {firstScore, secondScore};
    }*/

   /* private static int sumDiagonalElements(int[][] myArray2D) {
        int sum = 0;
        for (int row = 0; row < myArray2D.length; row++) {
            sum += myArray2D[row][row];
        }
        return sum;
    }*/

    /*public static int[] middle(int[] array) {
        // Take an array and return it in another array
        int[] newArray = new int[array.length - 2];
        for (int i = 1; i < array.length - 1; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }*/

    /*public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }

        // Create a new array with a size of the input array length minus 2
        int[] middleArray = new int[array.length - 2];

        // Copy the elements from the input array, excluding the first and last elements
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }

        return middleArray;
    }*/
}
