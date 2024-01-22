package Graphs.AdjacencyMatrix;

public class GraphNode {
    public String name;
    public int index;
    // Topological Sort Variable
    public boolean isVisited = false;
    // Single Source Shortest Path Problem (SSSPP) Variable
    public GraphNode parent;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
