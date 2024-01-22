package DivideAndConquerAlgorithms.ZeroOneKnapsackProblem;

public class ZeroOneKnapsack {
    private int knapSack(int[] profits, int[] weights, int capacity, int currentIndex) {
        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length) {
            return 0;
        }
        int profit1 = 0;
        if (weights[currentIndex] <= capacity) {
            profit1 = profits[currentIndex] + knapSack(profits, weights, capacity-weights[currentIndex], currentIndex+1);
        }
        int profit2 = knapSack(profits, weights, capacity, currentIndex+1);
        return Math.max(profit1, profit2);
    }

    public int knapSack(int[] profits, int[] weights, int capacity) {
        return this.knapSack(profits, weights,  capacity, 0);
    }
}
