package Graphs.KruskalAndPrimAlgorithm.PrimsAlgorithm;

import java.util.ArrayList;

public class DisjointSet {

    private ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();

    public void makeSet(ArrayList<WeightedGraphNode> nodeList){
        for (WeightedGraphNode node : nodeList) {
            DisjointSet set = new DisjointSet();
            set.nodeList.add(node);
            node.set = set;
        }
    }

    public DisjointSet findSet(WeightedGraphNode node){
        return node.set;
    }

    public DisjointSet unionSet(WeightedGraphNode node1, WeightedGraphNode node2){
        if (node1.set.equals(node2.set)) {
            return null;
        }else {
            DisjointSet set1 = node1.set;
            DisjointSet set2 = node2.set;
            if (set1.nodeList.size() > set2.nodeList.size()) {
                ArrayList<WeightedGraphNode> nodeSet2 = set2.nodeList;
                for (WeightedGraphNode node: nodeSet2){
                    node.set = set1;
                    set1.nodeList.add(node);
                }
                return set1;
            } else {
                ArrayList<WeightedGraphNode> nodeSet1 = set1.nodeList;
                for (WeightedGraphNode node: nodeSet1){
                    node.set = set2;
                    set2.nodeList.add(node);
                }
                return set2;
            }
        }
    }

    public void printAllNodesOfThisSet(){
        System.out.println("Printing all nodes of the set: ");
        for (WeightedGraphNode node : nodeList) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

}
