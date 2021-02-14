package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class BinaryTreeMain {

    public static void menu() {
        System.out.println("------------------------");
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. Traverse In-Order");
        System.out.println("5. Traverse Pre-Order");
        System.out.println("6. Traverse Post-Order");
        System.out.println("7. Keluar");
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner aula = new Scanner(System.in);
        int menu, data;

//        bt.add(6);
//        bt.add(4);
//        bt.add(8);
//        bt.add(3);
//        bt.add(5);
//        bt.add(7);
//        bt.add(9);
//        bt.add(10);
//        bt.add(15);
//        bt.traversePreOrder(bt.root);
//        System.out.println("");
//        bt.traverseInOrder(bt.root);
//        System.out.println("");
//        bt.traversePostOrder(bt.root);
//        System.out.println("");
//        System.out.println("Find " + bt.find(5));
//        bt.delete(8);
//        bt.traversePreOrder(bt.root);
//        System.out.println("-------------------------");
        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Data terkecil = " + bt.min(bt.root));
        System.out.println("Data terbesar = " + bt.max(bt.root));
        System.out.println("-------------------------");
        System.out.println("Data pada leaf : ");
        bt.printLeaf(bt.root);
        System.out.println();
        System.out.println("-------------------------");
        System.out.print("Banyaknya data pada leaf = " + bt.countLeaf());
        System.out.println();
        System.out.println("================================");

        do {
            menu();
            System.out.print("Masukkan pilihan menu (1-7) = ");
            menu = aula.nextInt();
            System.out.println();
            System.out.println("------------------------------");

            switch (menu) {
                case 1:
                    System.out.print("Masukkan data : ");
                    data = aula.nextInt();
                    bt.addRecursive(data);
                    break;
                case 2:
                    System.out.print("Masukkan data yang ingin dihapus : ");
                    data = aula.nextInt();
                    bt.delete(data);
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Masukkan data yang ingin dicari : ");
                    data = aula.nextInt();
                    System.out.println("Find " + bt.find(data));
                    break;
                case 4:
                    System.out.println("Traverse In-Order\n----------------------");
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Traverse Pre-Order\n----------------------");
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Traverse Post-Order\n----------------------");
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu yang anda masukkan tidak tersedia.");
            }
        } while (menu > 0 && menu < 8);

    }
}
