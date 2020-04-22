/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasLinkedLists;

/**
 *
 * @author Rasyedrenaldi
 */
import java.util.Scanner;

public class linkedQueueMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Membuat objek class linkedQueue */
        linkedQueue lq = new linkedQueue();
        /* Lakukan Queue Operations */
        System.out.println("Linked Queue Test\n");
        char ch;
        do {
            System.out.println("\nQueue Operations");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check empty");
            System.out.println("5. Size");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data");
                    lq.insert(scan.nextInt());
                    break;
                case 2: 
                try {
                    System.out.println("Hapus Data = " + lq.remove());
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
                case 3: 
                try {
                    System.out.println("Peek Data = " + lq.peek());
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
                case 4:
                    System.out.println("Empty status = " + lq.isEmpty());
                    break;

                case 5:
                    System.out.println("Size = " + lq.getSize());
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /* display queue */
            lq.display();

            System.out.println("\nApakah anda mau melanjutkan ( y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
