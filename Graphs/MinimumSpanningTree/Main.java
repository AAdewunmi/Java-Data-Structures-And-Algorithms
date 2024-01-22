package Graphs.MinimumSpanningTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedGraphNode("A"));
        nodeList.add(new WeightedGraphNode("B"));
        nodeList.add(new WeightedGraphNode("C"));
        nodeList.add(new WeightedGraphNode("D"));

        DisjointSet disjointSet = new DisjointSet();
        disjointSet.makeSet(nodeList);
        WeightedGraphNode firstNode = nodeList.get(0);
        WeightedGraphNode secondNode = nodeList.get(1);
        DisjointSet output = disjointSet.findSet(secondNode);
        output.printAllNodesOfThisSet();

        disjointSet.unionSet(firstNode, secondNode);
        output = disjointSet.findSet(secondNode);
        output.printAllNodesOfThisSet();
    }
}
