/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasGraph;

/**
 *
 * @author rasyed
 */
public class Graph {

    int vertex, jenis = 1;
    LinkedList list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        if (!graphType()) {
            list[source].addFirst(destination);
        } else {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        }
    }

    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[source].size);

        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) != source) {
                } else {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex: " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEgde(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[source].get(i) != destination) {
            } else {
                list[source].remove(i);
                break;
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
                System.out.print("Vertex " + i + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    // tipe graph

    public boolean graphType() {
        if (jenis != 0) {
            if (jenis != 1) {
            } else {
                return true;
            }
        } else {
            return false;
        }
        return true;
    }
}
