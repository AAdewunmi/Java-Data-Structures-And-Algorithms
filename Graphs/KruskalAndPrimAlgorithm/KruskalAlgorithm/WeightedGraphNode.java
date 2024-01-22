package Graphs.KruskalAndPrimAlgorithm.KruskalAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedGraphNode implements Comparable<WeightedGraphNode>{
    public String name;
    public ArrayList<WeightedGraphNode> neighbors = new ArrayList<>();
    public HashMap<WeightedGraphNode, Integer> weightedMap = new HashMap<>();
    public boolean isVisited = false;
    public WeightedGraphNode parent;
    public int distance;
    public int index;
    public DisjointSet set;

    public WeightedGraphNode(String name) {
        this.name = name;
        this.distance = Integer.MAX_VALUE;
        this.index = index;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedGraphNode o) {
        return this.distance - o.distance;
    }
}
