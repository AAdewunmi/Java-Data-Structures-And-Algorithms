package Graphs.FloydWarshallAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
    ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedGraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void dijkstra(WeightedGraphNode node){
        PriorityQueue<WeightedGraphNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            WeightedGraphNode currentNode = queue.remove();
            for (WeightedGraphNode neighbor : currentNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.distance +
                    currentNode.weightedMap.get(neighbor)) {
                        neighbor.distance = currentNode.distance +
                                (currentNode.weightedMap.get(neighbor));
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        for (WeightedGraphNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck + ", distance: "
                    + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    public void pathPrint(WeightedGraphNode node){
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void addWeightedEdge(int i, int j, int d){
        WeightedGraphNode first = nodeList.get(i);
        WeightedGraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightedMap.put(second, d);
    }

    public void floydWarshall(){
        int size = nodeList.size();
        int[][] V = new int[size][size];
        for (int i = 0; i < size; i++) {
            WeightedGraphNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedGraphNode second = nodeList.get(j);
                if (i == j) {
                    V[i][j] = 0;
                }else if (first.weightedMap.containsKey(second)){
                    V[i][j] = first.weightedMap.get(second);
                } else {
                    V[i][j] = Integer.MAX_VALUE/10;
                }
            }
        }
        for (int i = 0; i < nodeList.size(); i++) {
            for (int j = 0; j < nodeList.size(); j++) {
                for (int k = 0; k < nodeList.size(); k++) {
                    if (V[j][k] > V[j][i] + V[i][k]) {
                        V[j][k] = V[j][i] + V[i][k];
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print("Printing distance list for node " + nodeList.get(i) + ": ");
            for (int j = 0; j < size; j++) {
                System.out.print(V[i][j] + " ");
            }
            System.out.println();
        }
    }
}
