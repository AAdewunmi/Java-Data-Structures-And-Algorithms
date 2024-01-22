package Graphs.KruskalAndPrimAlgorithm.KruskalAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kruskal {
    ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();
    ArrayList<UndirectedEdge> edgeList = new ArrayList<>();

    public Kruskal(ArrayList<WeightedGraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightUndirectedEdge(int firstIndex, int secondIndex, int weight){
        UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        WeightedGraphNode first = edge.first;
        WeightedGraphNode second = edge.second;
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightedMap.put(second, weight);
        second.weightedMap.put(first, weight);
        edgeList.add(edge);
    }

    public void kruskal(){
        DisjointSet disjointSet = new DisjointSet();
        disjointSet.makeSet(nodeList);
        Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {
            @Override
            public int compare(UndirectedEdge o1, UndirectedEdge o2) {
                return o1.weight - o2.weight;
            }
        };
        Collections.sort(edgeList, comparator);
        int cost = 0;
        for (UndirectedEdge edge : edgeList) {
            WeightedGraphNode first = edge.first;
            WeightedGraphNode second = edge.second;
            if (!disjointSet.findSet(first).equals(disjointSet.findSet(second))) {
                disjointSet.unionSet(first, second);
                cost += edge.weight;
                System.out.println("Taken " + edge);
            }
        }
        System.out.println("\nTotal cost of MST: " + cost);
    }
}
