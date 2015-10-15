package org.santhoshkumar.Graphs;

/**
 * Created by santhoshkumar on 15/10/15.
 */
public class AdjacencyList {

}

class Neighbor {
    public int vertexNum;
    public Neighbor next;
    public Neighbor(int vertexNum, Neighbor neighbor) {
        this.vertexNum = vertexNum;
        next = neighbor;
    }
}

class Vertex {
    String name;
    Neighbor neighbors;
    Vertex(String name, Neighbor neighbors) {
        this.name = name;
        this.neighbors = neighbors;
    }
}

class Graph{
    Vertex[] vertices;

    public void addVertex(String name){

    }

    public void addEdge(String vertexA, String vertexB){

    }

    int indexForName(String name) {
        for (int v=0; v < vertices.length; v++) {
            if (vertices[v].name.equals(name)) {
                return v;
            }
        }
        return -1;
    }
}