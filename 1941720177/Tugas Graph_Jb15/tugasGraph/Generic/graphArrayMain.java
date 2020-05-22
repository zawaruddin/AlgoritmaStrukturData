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
public class graphArrayMain {
      public static void main(String[] args) {
        Scanner rasyed = new Scanner(System.in);
        Scanner renaldi = new Scanner(System.in);
        int v, e, count = 1, to = 0, from = 0;
        String data;
        graphArray gr;
        try {
            System.out.print("Masukkan jumlah vertices: ");
            v = renaldi.nextInt();
            System.out.print("Masukkan jumlah edges: ");
            e = renaldi.nextInt();

            gr = new graphArray(v);

            for (int i = 1; i <= v; i++) {
                System.out.print("Masukkan data: ");
                data = rasyed.nextLine();
                gr.makeVertices(i, i, data);
            }
            count = 1;
            while (count <= e) {
                System.out.println("Masukkan edges: <to> <from>");
                to = rasyed.nextInt();
                from = rasyed.nextInt();

                gr.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai reoresentasi graph sbb: ");
            System.out.print("\t");
            for (int i = 1; i <= v; i++) {
                System.out.print(gr.getVertices(i, i) + "\t");
            }
            System.out.println("");
            for (int i = 1; i <= v; i++) {
                System.out.print(gr.getVertices(i, i) + "\t");
                for (int j = 1; j <= v; j++) {
                    System.out.print(gr.getEdge(i, j) + "\t");
                }
                System.out.println("");
            }
        } catch (Exception E) {
            System.out.println("error silahkan cek kembali!!..");
        }
        renaldi.close();
    }
}
