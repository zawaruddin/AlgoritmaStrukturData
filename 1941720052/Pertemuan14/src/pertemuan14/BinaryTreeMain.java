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
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner luluk = new Scanner(System.in);
        int pilih, data1, data2, data3;
        
        do {            
            System.out.println("=======================================");
            System.out.println(" MENU  BINARY TREE ");
            System.out.println("=======================================");
            System.out.println(" Memilih Menu ");
            System.out.println(" 1. Add ");
            System.out.println(" 2. Delete ");
            System.out.println(" 3. Find ");
            System.out.println(" 4. traverse inOrder");
            System.out.println(" 5. traverse preOrder ");
            System.out.println(" 6. traverse postOrder ");
            System.out.println(" 7. Keluar ");
            System.out.println("=========================================");
            System.out.print("Masukkan pilihan Anda: ");
            pilih = luluk.nextInt();
            System.out.println("=========================================");
            
            switch(pilih){
                    case 1:
                        System.out.print(" Masukkan Data: ");
                        data1 = luluk.nextInt();
                        bt.add(data1);
                        break;

                    case 2:
                        System.out.print(" Masukkan Data: ");
                        data2 = luluk.nextInt();
                        bt.delete(data2);
                        break;
                        
                    case 3: 
                        System.out.print(" Masukkan Data: ");
                        data3 = luluk.nextInt();                        
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
            
             } while (pilih >=1 && pilih <= 6 );
//        
//        bt.add(6);
//        bt.add(4);
//        bt.add(8);
//        bt.add(3);
//        bt.add(5);
//        bt.add(7);
//        bt.add(9);
//        bt.add(10);
//        bt.add(15);
//        
//        bt.traversePreOrder(bt.root);
//        System.out.println("");
//        bt.traverseInOrder(bt.root);
//        System.out.println("");
//        bt.traversePostOrder(bt.root);
//        System.out.println("");
//        System.out.println("Find "+ bt.find(5));
//        bt.delete(8);
//        bt.traversePreOrder(bt.root);
//        System.out.println("");
//        
//        bt.PrintMinMax(bt.root);
//        System.out.println("");
//        bt.leaf(bt.root);
//        System.out.println("");
//        System.out.println("Jumlah Leaf : " + bt.hitungLeaf(bt.root));
    }   
}
