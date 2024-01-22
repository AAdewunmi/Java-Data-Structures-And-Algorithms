package GreedyAlgorithms.KnapsackProblem;

public class KnapsackItem {
    private int index;
    private int value;
    private int weight;
    private double ration;

    public KnapsackItem(int index, int value, int weight) {
        this.index = index;
        this.value = value;
        this.weight = weight;
        this.ration = value * 1.0 / weight;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getRation() {
        return ration;
    }

    public void setRation(double ration) {
        this.ration = ration;
    }

    @Override
    public String toString() {
        return "Item index= " + index +
                ", value=" + value +
                ", weight=" + weight +
                ", ration=" + ration;
    }
}
