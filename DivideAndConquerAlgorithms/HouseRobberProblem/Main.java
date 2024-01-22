package DivideAndConquerAlgorithms.HouseRobberProblem;

public class Main {
    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int[] houseWorth = {6, 7,1, 30, 8, 2, 4};
        System.out.println(houseRobber.maxMoney(houseWorth));
    }
}
