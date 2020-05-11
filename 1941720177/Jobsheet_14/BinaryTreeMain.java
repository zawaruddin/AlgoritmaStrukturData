/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet_14;

/**
 *
 * @author rasyed
 */
import java.util.Scanner;
public class BinaryTreeMain {

    static void menu() {
        System.out.println("Pilihan menu");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse In-Order");
        System.out.println("5. Traverse Pre-Order");
        System.out.println("6. Traverse Post-Order");
        System.out.println("7. Keluar");
    }

    public static void main(String[] args) {
        Scanner rasyed = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        int pilih, data;
        do {
            menu();
            System.out.println("=====================");
            pilih = rasyed.nextInt();
            System.out.println("=====================");
            switch (pilih) {
                case 1:
                    System.out.print("Sub menu\n1. Add secara iterasi\n2. Add secara rekursif");
                    System.out.println("\n--------------------");
                    pilih = rasyed.nextInt();
                    System.out.print("Masukkan data : ");
                    data = rasyed.nextInt();
                    if (pilih == 1) {
                        bt.add(data);
                    } else if (pilih == 2) {
                        bt.addRekursif(data);
                    } else {
                        System.out.println("Input salah!");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan data : ");
                    data = rasyed.nextInt();
                    bt.delete(data);
                    break;
                case 3:
                    System.out.print("Masukkan data : ");
                    data = rasyed.nextInt();
                    System.out.printf("Ketemu %s %s",data,bt.find(data));
                    System.out.println("");
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println("");
                    break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println("");
                    break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Aplikasi keluar!!");
                    System.exit(0);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
