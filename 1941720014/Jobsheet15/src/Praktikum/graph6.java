package Praktikum;

/**
 *
 * @author Aulafz
 */
public class graph6 {

    int vertex;
    linkedlist6 list[];

    public graph6(int vertex) {
        this.vertex = vertex;
        list = new linkedlist6[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new linkedlist6();
        }
    }

    public void addEdge(int source, int destination, String source2, String destination2) {
        list[source].addFirst(destination2);
        list[destination].addFirst(source2);
    }

    public void degree(int source, String source2) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[source].size());
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j).equals(source2)) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list[source].size; k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination, String destination2) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(list[source].getByValue(destination2));
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph(String kota[]) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Kota " + kota[i] + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + ", ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public static void main(String[] args) throws Exception {
        graph6 graph = new graph6(6);
        String kota[] = new String[5];
        kota[0] = "Malang";
        kota[1] = "Surabaya";
        kota[2] = "Gresik";
        kota[3] = "Bandung";
        kota[4] = "Semarang";
        graph.addEdge(0, 1, kota[0], kota[1]);
        graph.addEdge(0, 4, kota[1], kota[4]);
        graph.addEdge(1, 2, kota[1], kota[2]);
        graph.addEdge(1, 3, kota[1], kota[3]);
        graph.addEdge(1, 4, kota[1], kota[4]);
        graph.addEdge(2, 3, kota[2], kota[3]);
        graph.addEdge(3, 4, kota[3], kota[4]);
        graph.addEdge(3, 0, kota[3], kota[0]);
        graph.printGraph(kota);
        graph.degree(2, kota[2]);
        graph.removeEdge(1, 3, kota[3]);
        graph.printGraph(kota);
    }
}
