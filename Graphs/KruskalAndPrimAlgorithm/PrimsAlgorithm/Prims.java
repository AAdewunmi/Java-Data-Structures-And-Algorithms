package Graphs.KruskalAndPrimAlgorithm.PrimsAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Prims {
    ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();
    ArrayList<UndirectedEdge> edgeList = new ArrayList<>();

    public Prims(ArrayList<WeightedGraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightUndirectedEdge(int i, int j, int d){
        //UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        WeightedGraphNode first = nodeList.get(i);
        WeightedGraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightedMap.put(second, d);
        second.weightedMap.put(first, d);
        //edgeList.add(edge);
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

    public void prims(WeightedGraphNode node){
        for (int i = 0; i < nodeList.size(); i++) {
            nodeList.get(i).distance = Integer.MAX_VALUE;
        }
        node.distance = 0;
        PriorityQueue<WeightedGraphNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            WeightedGraphNode currentNode = queue.remove();
            for (WeightedGraphNode neighbor : currentNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.weightedMap.get(neighbor)) {
                        neighbor.distance = currentNode.weightedMap.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        int cost = 0;
        for (WeightedGraphNode nodeToCheck : nodeList) {
            System.out.println("Node " + nodeToCheck + ", key " + nodeToCheck.distance + " Parent: " + nodeToCheck.parent);
            cost += nodeToCheck.distance;
        }
        System.out.println("\n Total cost of MST: " + cost);
    }
}
