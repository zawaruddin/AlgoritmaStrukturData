/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasGraph.Weigthed;

import java.util.Scanner;
/**
 *
 * @author rasyed
 */
public class GraphMain {
      static void menu() {
        System.out.println("Pilihan menu");
        System.out.println("1. Input jumlah vertex");
        System.out.println("2. addEdge");
        System.out.println("3. removeEdge");
        System.out.println("4. removeAllEdges");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) throws Exception {
        Scanner rasyed = new Scanner(System.in);

        int pilih, vertex = 0;
        Graph gr = new Graph(vertex);

        do {
            System.out.println("====================================");
            menu();
            System.out.println("====================================");
            pilih = rasyed.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jumlah vertex : ");
                    vertex = rasyed.nextInt();
                    gr = new Graph(vertex);
                    break;
                case 2:
                    for (int i = 0; i < vertex; i++) {
                        System.out.println("Masukkan edges: <source> <destination> <weight>");
                        int source = rasyed.nextInt();
                        int destination = rasyed.nextInt();
                        int weight = rasyed.nextInt();
                        gr.addEdge(source, destination, weight);
                    }
                    gr.printGraph();
                    break;
                case 3:
                    System.out.print("Masukkan source : ");
                    int source = rasyed.nextInt();
                    System.out.print("Masukkan destination : ");
                    int destination = rasyed.nextInt();
                    gr.removeEgde(source, destination);
                    gr.printGraph();
                    break;
                case 4:
                    gr.removeAllEdges();
                    gr.printGraph();
                    break;
                case 5:
                    System.out.println("Aplikasi keluar");
                    System.exit(0);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
