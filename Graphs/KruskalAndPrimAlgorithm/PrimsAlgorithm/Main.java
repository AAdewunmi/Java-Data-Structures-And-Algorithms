package Graphs.KruskalAndPrimAlgorithm.PrimsAlgorithm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedGraphNode("A"));
        nodeList.add(new WeightedGraphNode("B"));
        nodeList.add(new WeightedGraphNode("C"));
        nodeList.add(new WeightedGraphNode("D"));
        nodeList.add(new WeightedGraphNode("E"));

        Prims graph = new Prims(nodeList);
        graph.addWeightUndirectedEdge(0, 1, 5);
        graph.addWeightUndirectedEdge(0, 2, 13);
        graph.addWeightUndirectedEdge(0, 4, 15);
        graph.addWeightUndirectedEdge(1, 2, 10);
        graph.addWeightUndirectedEdge(1, 3, 8);
        graph.addWeightUndirectedEdge(2, 3, 6);
        graph.addWeightUndirectedEdge(2, 4, 20);

        System.out.println("Running Prims Algorithm on the graph: ");
        graph.prims(nodeList.get(4));
    }
}
