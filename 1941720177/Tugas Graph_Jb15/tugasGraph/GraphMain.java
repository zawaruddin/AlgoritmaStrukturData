/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasGraph;

import java.util.Scanner;

/**
 *
 * @author rasyed
 */
public class GraphMain {

    static void menu() {
        System.out.println("Pilihan menu");
        System.out.println("1. Jenis Graph (directed/undirected)");
        System.out.println("2. Input jumlah vertex");
        System.out.println("3. addEdge");
        System.out.println("4. removeEdge");
        System.out.println("5. removeAllEdges");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) throws Exception {
        Scanner rasyed = new Scanner(System.in);

        int pilih, vertex = 0;
        Graph graph = new Graph(vertex);

        do {
            System.out.println("====================================");
            menu();
            System.out.println("====================================");
            pilih = rasyed.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Pilih jenis Graph: 0(directed) | 1(undirected)");
                    graph.jenis = rasyed.nextInt();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah vertex : ");
                    vertex = rasyed.nextInt();
                    graph = new Graph(vertex);
                    break;
                case 3:
                    System.out.println("Masukkan edges: <source> <destination>");
                    for (int i = 0; i < vertex; i++) {
                        int source = rasyed.nextInt();
                        int destination = rasyed.nextInt();

                        graph.addEdge(source, destination);
                    }
                    graph.printGraph();
                    break;
                case 4:
                    System.out.print("Masukkan source : ");
                    int source = rasyed.nextInt();
                    System.out.print("Masukkan destination : ");
                    int destination = rasyed.nextInt();
                    graph.removeEgde(source, destination);
                    graph.printGraph();
                    break;
                case 5:
                    graph.removeAllEdges();
                    graph.printGraph();
                    break;
                case 6:
                    System.out.println("Aplikasi keluar");
                    System.exit(0);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
