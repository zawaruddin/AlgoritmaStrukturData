/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu15;

/**
 *
 * @author ANGGA
 */
import java.util.Scanner;

public class graphArrayMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        int v, e, count = 1, to = 0, from = 0;
        grapharray graph;
        try {
            System.out.print("Masukkan jumlah vertices: ");
            v = dhimas.nextInt();
            System.out.print("Masukkan jumlah edges: ");
            e = dhimas.nextInt();

            graph = new grapharray(v);

            System.out.println("Masukkan edges: <to> <from>");
            while (count <= e) {
                to = dhimas.nextInt();
                from = dhimas.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai reoresentasi graph sbb: ");
            System.out.print("  ");
            for (int i = 1; i <= v; i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
            for (int i = 1; i <= v; i++) {
                System.out.print(i + " ");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + " ");
                }
                System.out.println("");
            }
        } catch (Exception E) {
            System.out.println("Error Silahkan cek kembali");
        }
        dhimas.close();
    }
}
