package Praktikum;
import java.util.Scanner;
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        Scanner retno = new Scanner(System.in);
        
        System.out.print("Masukkan panjang Node : ");
        int x = retno.nextInt();
        int data[] = new int[x];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Node [" + i + "] :");
            data[i] = retno.nextInt();
        }
        
        int idxLast = x - 1;
        bta.populateData(data, idxLast);
 
        System.out.println(" \ntraverseInOrder: ");        
        bta.traverseInOrder(0);        
        System.out.println(" \ntraversePostOrder: ");
        bta.traversePostOrder(0);        
        System.out.println(" \ntraversePrenOrder: ");
        bta.traversePreOrder(0);
        System.out.println();
        /*int[]data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);*/
    }
}
