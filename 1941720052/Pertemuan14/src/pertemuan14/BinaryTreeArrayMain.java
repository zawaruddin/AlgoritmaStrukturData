/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan14;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        Scanner luluk = new Scanner(System.in);
        
        System.out.print("Masukkan panjang Node : ");
        int x = luluk.nextInt();
        int data[] = new int[x];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Node [" + i + "] :");
            data[i] = luluk.nextInt();
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
//        int idxLast = 6;
//        bta.populateData(data, idxLast);
//        bta.traverseInOrder(0);
    }
}
