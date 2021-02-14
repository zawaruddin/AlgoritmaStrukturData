/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan13;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class DoubleLinkedListsMain {
    static String[] menu = { "Tambah awal", "Tambah akhir", "Tambah data indeks tertentu", "Hapus awal", "Hapus akhir",
            "Hapus indeks tertenu", "Cetak data", "Cari", "Sorting data"};
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        boolean ulang = true;
        int data, index;
        DoubleLinkedLists dll = new DoubleLinkedLists();
        
        do {
            try {
                System.out.println("DOUBLE LINKED LIST DENGAN MENU");
                System.out.println("==============================");
                System.out.println("Memilih menu");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println((i + 1) + ". " + menu[i]);
                    if (i + 1 == menu.length) {
                        System.out.println((i + 2) + ". Keluar");
                    }
                }
                System.out.print("Masukkan pilihan menu Anda : ");
                int menu = luluk.nextInt() - 1;

                switch (menu) {
                    case 0:
                        System.out.print("Masukkan Data: ");
                        data = luluk.nextInt();
                        dll.addFirst(data);
                        break;
                    case 1:
                        System.out.print("Masukkan Data: ");
                        data = luluk.nextInt();
                        dll.addLast(data);
                        break;
                    case 2:
                        System.out.print("Masukkan data: ");
                        data = luluk.nextInt();
                        System.out.print("Masukkan posisi indeks data: ");
                        index = luluk.nextInt()-1;
                        dll.add(data, index);
                        ;
                        break;
                    case 3:
                        System.out.println("Data awal dihapus");
                        dll.removeFirst();
                        break;
                    case 4:
                        System.out.println("Data akhir dihapus");
                        dll.removeLast();
                        break;
                    case 5:
                        System.out.print("Masukkan posisi indeks data yang dihapus: ");
                        index = luluk.nextInt()-1;
                        dll.remove(index);
                        break;
                    case 6:
                        System.out.println("Data:");
                        dll.print();
                        break;
                    case 7:
                        System.out.print("Masukkan data yang dicari: ");
                        data = luluk.nextInt();
                        dll.getByData(data);
                        break;
                    case 8:
                        System.out.print("Mengurutkan dari terkecil?(y)\n>> ");
                        luluk.nextLine();
                        char asc = luluk.nextLine().charAt(0);
                        dll.sortingData(asc);
                        break;
                    default:
                        ulang = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (ulang);
    }
}
