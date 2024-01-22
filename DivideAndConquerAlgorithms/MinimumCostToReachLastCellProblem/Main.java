package DivideAndConquerAlgorithms.MinimumCostToReachLastCellProblem;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {4,7,8,6,4},
                {6,7,3,9,2},
                {3,8,1,2,4},
                {7,1,7,3,7},
                {2,9,8,9,3}
        };
        MinCostToReachLastCell minCostToReachLastCell = new MinCostToReachLastCell();
        System.out.println(minCostToReachLastCell.findMinCost(array, array.length - 1, array[0].length - 1));
    }
}
