/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class BinaryTreeArrayMain {

    static Scanner daffa = new Scanner(System.in);
    
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        System.out.print("Masukkan panjang Node : ");
        int x = daffa.nextInt();
        int data[] = new int[x];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Node [" + i + "] :");
            data[i] = daffa.nextInt();
        }

        int idxLast = x - 1;
        bta.populateData(data, idxLast);

        System.out.println(" \nMenggunakan traverseInOrder: ");
        bta.traverseInOrder(0);
        System.out.println(" \nMenggunakan traversePostOrder: ");
        bta.traversePostOrder(0);
        System.out.println(" \nMenggunakan traversePrenOrder: ");
        bta.traversePreOrder(0);
        System.out.println();

    }
}
