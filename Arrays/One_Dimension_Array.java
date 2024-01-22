package Arrays;

import java.util.Arrays;

public class One_Dimension_Array {
    public static void main(String[] args) {
        // Create an Array
        int[] arr;
        arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        insertArray(arr, 4, 7);
        System.out.println(Arrays.toString(arr));
    }
    // Insert into Array
    public static void insertArray(int[] array, int location, int value){
        try{
            array[location] = value;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Invalid index!");
            e.printStackTrace();
        }
    }
    // Accessing Array Element

}
