package Graphs.AdjacencyList;

import java.util.ArrayList;

public class GraphNode {
    public String name;
    public int index;
    // Extra Variable DFS
    public boolean isVisited = false;
    // Extra Variable BFS - Single Source Shortest Path Problem
    public GraphNode parent;

    public ArrayList<GraphNode> neighbors = new ArrayList<>();

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }

}
