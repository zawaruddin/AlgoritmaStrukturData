/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasGraph.Weigthed;

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

    public void addEdge(int source, int destination, int weight) {
        Edges edge = new Edges(source, destination, weight);
//        if (!graphType()) {
        list[source].addFirst(edge);
/*        } else {
//            list[source].addFirst(weight);
//            list[destination].addFirst(weight);
        }   */
    }

    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[source].size);

        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j).source == source) {
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
            if (list[source].get(i).destination != destination) {
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
            if (list[i].size() <= 0) {
            } else {
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print("Vertex " + i + " terhubung dengan " + list[i].get(j).destination
                            + " dengan weight " + list[i].get(j).weight);
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }
    // tipe graph

    public boolean graphType() {
        if (jenis == 0) {
            return false;
        } else if (jenis == 1) {
            return true;
        }
        return true;
    }
}
