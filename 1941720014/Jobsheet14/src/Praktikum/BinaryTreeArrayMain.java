package Praktikum;

/**
 *
 * @author Aulafz
 */
public class BinaryTreeArrayMain {
    
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        
        for (int i = 0; i < data.length; i++) {
            bta.add(data[i]);
        }
        
        bta.populateData(data, idxLast);
        System.out.println("Traverse In-Order : ");
        bta.traverseInOrder(0);
        System.out.println();
        System.out.println("Traverse Pre-Order : ");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println("Traverse Post-Order : ");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
