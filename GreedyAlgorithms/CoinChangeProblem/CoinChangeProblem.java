package GreedyAlgorithms.CoinChangeProblem;

import java.util.Arrays;

public class CoinChangeProblem {
    public void coinChangeProblem(int[] coins, int totalAmount){
        Arrays.sort(coins);
        int index = coins.length - 1;
        while(true){
            int coinValue = coins[index];
            index--;
            int maxAmount = (totalAmount/coinValue)*coinValue;
            if (maxAmount > 0) {
                System.out.println("Coin value: " + coinValue + " taken count: " +
                        (totalAmount/coinValue));
                totalAmount = totalAmount - maxAmount;
            }
            if (totalAmount == 0) {
                break;
            }
        }
    }
}
