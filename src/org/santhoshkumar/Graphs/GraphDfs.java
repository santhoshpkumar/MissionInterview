package org.santhoshkumar.Graphs;

/**
 * Created by santhoshkumar on 15/10/15.
 */

public class GraphDfs {
    Vertex[] vertices;
    boolean directed;

    public GraphDfs(boolean directed, int verticesCount){
        this.directed = directed;
        vertices = new Vertex[verticesCount];
    }

    public void createDefault(){
        vertices = new Vertex[5];

        addVertex("one");
        addVertex("two");
        addVertex("three");
        addVertex("four");
        addVertex("five");

        addEdge("one", "two");
        addEdge("one", "three");
        addEdge("two", "three");
        addEdge("two", "four");
        addEdge("five", "three");
        addEdge("five", "four");
    }

    public void addVertex(String name){
        for (int v=0; v < vertices.length; v++) {
            if(vertices[v] == null){
                vertices[v] = new Vertex(name, null);
            }
        }
    }

    public void addEdge(String vertexA, String vertexB){
        // read vertex names and translate to vertex numbers
        int v1 = indexForName(vertexA);
        int v2 = indexForName(vertexB);

        // add v2 to front of v1's adjacency list and
        // add v1 to front of v2's adjacency list
        vertices[v1].neighbors = new Neighbor(v2, vertices[v1].neighbors);
        if (!this.directed) {
            vertices[v2].neighbors = new Neighbor(v1, vertices[v2].neighbors);
        }
    }

    int indexForName(String name) {
        for (int v=0; v < vertices.length; v++) {
            if (vertices[v].name.equals(name)) {
                return v;
            }
        }
        return -1;
    }

    // recursive dfs
    private void dfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println("visiting " + vertices[v].name);
        for (Neighbor nbr=vertices[v].neighbors; nbr != null; nbr=nbr.next) {
            if (!visited[nbr.vertexNum]) {
                System.out.println("\n" + vertices[v].name + "--" + vertices[nbr.vertexNum].name);
                dfs(nbr.vertexNum, visited);
            }
        }
    }

    public void dfs() {
        boolean[] visited = new boolean[vertices.length];
        for (int v=0; v < visited.length; v++) {
            if (!visited[v]) {
                System.out.println("\nSTARTING AT " + vertices[v].name);
                dfs(v, visited);
            }
        }
    }

    public void print() {
        System.out.println();
        for (int v=0; v < vertices.length; v++) {
            System.out.print(vertices[v].name);
            for (Neighbor nbr=vertices[v].neighbors; nbr != null;nbr=nbr.next) {
                System.out.print(" --> " + vertices[nbr.vertexNum].name);
            }
            System.out.println("\n");
        }
    }
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