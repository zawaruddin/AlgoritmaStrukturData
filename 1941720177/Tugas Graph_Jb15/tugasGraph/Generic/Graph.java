/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasGraph.Generic;

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

    public void addEdge(String source, String destination, int x, int y) {
        if (!graphType()) {
            list[x].addFirst(destination);
        } else {
            list[x].addFirst(destination);
            list[y].addFirst(source);
        }
    }

    public void degree(String source, int x) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[x].size);

        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (!list[i].get(j).equalsIgnoreCase(source)) {
                } else {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[x].size(); k++) {
                list[x].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex: " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEgde(String source, String destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (!list[i].get(i).equalsIgnoreCase(destination)) {
            } else {
                list[i].remove(i);
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
        if (jenis == 0) {
            return false;
        } else if (jenis == 1) {
            return true;
        }
        return true;
    }
}
