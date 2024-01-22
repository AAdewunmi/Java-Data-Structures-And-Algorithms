package Arrays;

import java.util.Arrays;

public class Two_Dimension_Array {
    static int[][] arr = null;

    public Two_Dimension_Array(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueInTheArray(int row, int col, int value){
        try{
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value is successfully inserted!");
            }else {
                System.out.println("This cell is already occupied!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array!");
        }
    }

    public void accessCell(int row, int col){
        System.out.println("\nAccessing Row#" + row + ", Col#" + col);
        try{
            System.out.println("Cell value is: " + arr[row][col]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array!");
        }
    }

    public void traverse2DArray(){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
        System.out.println();
    }

    public void searchingValue(int value){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is found at Row#: " + row + ", Col# " + col);
                    return;
                }
            }
        }
        System.out.println("Value not found!");
    }

    public void deleteValueFromArray(int row, int col){
        try{
            System.out.println("Value deleted at Row#: " + row + ", Col# " + col);
            arr[row][col] = Integer.MIN_VALUE;
            return;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index!");
        }
    }

    public static void main(String[] args) {
        /*int[][] int2DArray;
        int2DArray = new int[2][2];
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;
        System.out.println(Arrays.deepToString(int2DArray));
        String[][] string2DArray = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(string2DArray));*/
        Two_Dimension_Array sda = new Two_Dimension_Array(3, 3);
        sda.insertValueInTheArray(0,0, 10);
        sda.insertValueInTheArray(0,1, 20);
        sda.insertValueInTheArray(1,0, 30);
        sda.insertValueInTheArray(2,0, 40);
        System.out.println(Arrays.deepToString(sda.arr));
        sda.insertValueInTheArray(0,1, 20);
        sda.accessCell(0, 1);
        sda.traverse2DArray();
        sda.searchingValue(20);
        sda.deleteValueFromArray(0, 1);
        sda.traverse2DArray();
        //sda.deleteValueFromArray(20);
    }
}
