package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class Graph {

    int vertex;
    LinkedList list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);

        //add back edge (for undirected)
        list[destination].addFirst(source);
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
                list[source].remove(list[source].getByValue(destination));
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

    public boolean graphType(int num) {
        //0 = directed, 1 = undirected, def = undirected, type = numb;
        if (num == 0) {
            return false;
        } else if (num == 1) {
            return true;
        } else {
            return true;
        }
    }
    static Scanner aula = new Scanner(System.in);
    static Scanner farida = new Scanner(System.in);
    static boolean tipe = true;
    static Graph graph = new Graph(6);
    static int type;

    public static void menu() throws Exception {
        System.out.println("PILIHAN MENU");
        System.out.println("1. Jenis Graph");
        System.out.println("2. Input Jumlah Vertex");
        System.out.println("3. Add Edge");
        System.out.println("4. Remove Edge");
        System.out.println("5. Remove All Edges");
        System.out.println("6. Keluar");
        System.out.println("-------------------------");
        System.out.print("Masukkan menu (1-6) : ");
        int menu = aula.nextInt();
        switch (menu) {
            case 1:
                if (tipe == true) {
                    System.out.print("Input graph type (0 = directed / 1 = undirected) : ");
                    type = aula.nextInt();
                    System.out.println(graph.graphType(type));
                    tipe = false;
                } else {
                    System.out.println(graph.graphType(type));
                }
                break;
            case 2:
                System.out.print("Input : ");
                int in = aula.nextInt();
                graph = new Graph(in);
                break;
            case 3:
                String input;
                do {
                    System.out.println("Input : <source> <destination>");
                    int source = aula.nextInt();
                    int destination = aula.nextInt();
                    graph.addEdge(source, destination);
                    do {
                        System.out.print("Tambahkan input (Y/T)? : ");
                        input = farida.nextLine();
                        if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("t")) {
                            System.out.println("Inputan salah.");
                        }
                    } while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("t"));
                } while (input.equalsIgnoreCase("y"));
                graph.printGraph();
                break;
            case 4:
                System.out.println("Remove <source> <destination> : ");
                int source = aula.nextInt();
                int destination = aula.nextInt();
                graph.removeEdge(source, destination);
                break;
            case 5:
                graph.removeAllEdges();
                break;
            case 6:
                System.exit(0);
        }
    }

    public static void main(String[] args) throws Exception {
//        Scanner aula = new Scanner(System.in);
//        Scanner farida = new Scanner(System.in);

//        Graph graph = new Graph(6);
//        System.out.print("Input graph type (0 = directed / 1 = undirected) : ");
//        int type = aula.nextInt();
//        System.out.println(graph.graphType(type));
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
//        graph.printGraph();
//        graph.degree(2);
//        graph.removeEdge(1, 2);
//        graph.printGraph();
        while (true) {
            menu();
        }
    }
}
