package TugasJobsheet14;

/**
 *
 * @author dhimas
 */
import java.util.Scanner;

public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
        int idxLast=0, idxStart = 0, pilih, data;

        do {
            if (bta.data == null) {
                System.out.print("Masukkan panjang array :");
                idxLast = dhimas.nextInt();
            }
            System.out.println("\nPilihan menu");
            System.out.println("1. add");
            System.out.println("2. display");
            System.out.println("=====================");
            pilih = dhimas.nextInt();
            System.out.println("---------------------");
            switch (pilih) {
                case 1:
                    bta.populateData(idxLast);
                    for (int i = 0; i < idxLast; i++) {
                        System.out.printf("Masukkan data %d: ", i);
                        data = dhimas.nextInt();
                        bta.add(data);
                    }
                    break;
                case 2:
                    System.out.print("Traverse inOrder\t: ");
                    bta.traverseInOrder(idxStart);
                    System.out.println("");
                    System.out.print("Traverse preOrder\t: ");
                    bta.traversepreOrder(idxStart);
                    System.out.println("");
                    System.out.print("Traverse postOrder \t: ");
                    bta.traversepostOrder(idxStart);
                    System.out.println("");
            }
        } while (pilih == 1 || pilih == 2);
    }
}
