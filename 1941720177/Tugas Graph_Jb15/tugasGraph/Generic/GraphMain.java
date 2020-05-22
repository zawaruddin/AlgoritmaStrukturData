/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasGraph.Generic;

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
        System.out.println("6. Keluar");
    }

    public static void main(String[] args) throws Exception {
        Scanner rasyed = new Scanner(System.in);
        Scanner renaldi = new Scanner(System.in);

        int pilih, vertex = 0;
        Graph graph = new Graph(vertex);

        do {
            System.out.println("====================================");
            menu();
            System.out.println("====================================");
            pilih = renaldi.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Pilih jenis graph: 0(directed) | 1(undirected)");
                    graph.jenis = renaldi.nextInt();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah vertex : ");
                    vertex = renaldi.nextInt();
                    graph = new Graph(vertex);
                    break;
                case 3:
                    for (int i = 0; i < vertex; i++) {
                        System.out.print("Masukkan data: <source> <destination>\n");
                        String source = rasyed.nextLine();
                        String destination = rasyed.nextLine();
                        System.out.print("Masukkan edge: <source> <destination>\n");
                        int x = renaldi.nextInt();
                        int y = renaldi.nextInt();
                        graph.addEdge(source, destination, x, y);
                    }
                    graph.printGraph();
                    break;
                case 4:
                    System.out.print("Masukkan source : ");
                    String source = rasyed.nextLine();
                    System.out.print("Masukkan destination : ");
                    String destination = rasyed.nextLine();
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
