package Graphs.DijkstraAlgorithm;

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
}
