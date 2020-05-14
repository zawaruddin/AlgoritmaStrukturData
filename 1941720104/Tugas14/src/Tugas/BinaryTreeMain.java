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
public class BinaryTreeMain {

    static Scanner daffa = new Scanner(System.in);
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int pilih, data1, data2, data3;

        do {
            System.out.println("----------------System ON-----------------");            
            System.out.println("------------------------------------------");
            System.out.println("Pilihan Menu");
            System.out.println(" 1. Add ");
            System.out.println(" 2. Delete ");
            System.out.println(" 3. Find ");
            System.out.println(" 4. traverse inOrder");
            System.out.println(" 5. traverse preOrder ");
            System.out.println(" 6. traverse postOrder ");
            System.out.println(" 7. Keluar ");
            System.out.println("------------------------------------------");
            System.out.print("Masukkan pilihan Anda: ");
            pilih = daffa.nextInt();
            System.out.println("------------------------------------------");

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Data: ");
                    data1 = daffa.nextInt();
                    bt.add(data1);
                    break;

                case 2:
                    System.out.print("Masukkan Data: ");
                    data2 = daffa.nextInt();
                    bt.delete(data2);
                    break;

                case 3:
                    System.out.print("Masukkan Data: ");
                    data3 = daffa.nextInt();
                    bt.find(data3);
                    break;

                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;

                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;

                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    break;
            }

        } while (pilih >= 1 && pilih <= 6);

    } 
}
