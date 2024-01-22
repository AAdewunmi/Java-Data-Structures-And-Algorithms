package Graphs.FloydWarshallAlgorithm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedGraphNode("A", 0));
        nodeList.add(new WeightedGraphNode("B", 1));
        nodeList.add(new WeightedGraphNode("C", 2));
        nodeList.add(new WeightedGraphNode("D", 3));

        WeightedGraph weightedGraph = new WeightedGraph(nodeList);
        weightedGraph.addWeightedEdge(0, 3, 1);
        weightedGraph.addWeightedEdge(0, 1, 8);
        weightedGraph.addWeightedEdge(1, 2, 1);
        weightedGraph.addWeightedEdge(2, 0, 4);
        weightedGraph.addWeightedEdge(3, 1, 2);
        weightedGraph.addWeightedEdge(3, 2, 9);

        System.out.println("Printing FloydWarshall Algorithm from source: A");
        weightedGraph.floydWarshall();
    }
}
