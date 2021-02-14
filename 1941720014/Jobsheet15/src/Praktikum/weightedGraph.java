package Praktikum;

/**
 *
 * @author Aulafz
 */
public class weightedGraph {

    int vertex;
    adjacencyList list[];

    public weightedGraph(int vertex) {
        this.vertex = vertex;
        list = new adjacencyList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new adjacencyList();
        }
    }

    public void addEdge(int source, int destination, int weight) {
        //add edge
        list[source].addFirst(destination, weight);

        //add back edge (for undirected)
        list[destination].addFirst(source, weight);
    }

    public void degree(int source) throws Exception {
        //degree undirected graph
        System.out.println("Degree vertex" + source + " : " + list[source].size());

        //degree directed graph
        //inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    ++totalIn;
                }
            }
            //ourDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) throws Exception {
        weightedGraph graph = new weightedGraph(6);
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 4, 3);
        graph.addEdge(1, 2, 4);
        graph.addEdge(1, 3, 6);
        graph.addEdge(1, 4, 8);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 4, 4);
        graph.addEdge(3, 0, 1);
        graph.printGraph();
        graph.degree(2);
    }
}
