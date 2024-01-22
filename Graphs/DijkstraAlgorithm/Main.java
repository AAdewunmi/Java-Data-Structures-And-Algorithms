package Graphs.DijkstraAlgorithm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedGraphNode("A", 0));
        nodeList.add(new WeightedGraphNode("B", 1));
        nodeList.add(new WeightedGraphNode("C", 2));
        nodeList.add(new WeightedGraphNode("D", 3));
        nodeList.add(new WeightedGraphNode("E", 4));
        nodeList.add(new WeightedGraphNode("F", 5));
        nodeList.add(new WeightedGraphNode("G", 6));
        WeightedGraph weightedGraph = new WeightedGraph(nodeList);
        weightedGraph.addWeightedEdge(0, 1, 2);
        weightedGraph.addWeightedEdge(0, 2, 5);
        weightedGraph.addWeightedEdge(1, 2, 6);
        weightedGraph.addWeightedEdge(1, 3, 1);
        weightedGraph.addWeightedEdge(1, 4, 3);
        weightedGraph.addWeightedEdge(2, 5, 8);
        weightedGraph.addWeightedEdge(3, 4, 4);
        weightedGraph.addWeightedEdge(4, 6, 9);
        weightedGraph.addWeightedEdge(5, 6, 7);
        System.out.println("Printing Dijkstra Algorithm from source: A");
        weightedGraph.dijkstra(nodeList.get(0));
    }
}
