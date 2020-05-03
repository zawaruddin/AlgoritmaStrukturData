/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_DLL;

/**
 *
 * @author rasyed
 */
import java.util.Scanner;

public class DLL2Main {

   public static void menu() {
        
        System.out.println(" DOUBLE LINKED LIST DENGAN MENU ");
        System.out.println("==================================");
        System.out.println("1.Tambah Awal");
        System.out.println("2.Tambah Akhir");
        System.out.println("3.Tambah Data Indeks Tertentu");
        System.out.println("4.Hapus Awal");
        System.out.println("5.Hapus Akhir");
        System.out.println("6.Hapus Indeks Tertentu");
        System.out.println("7.Cetak Data");
        System.out.println("8.Cari");
        System.out.println("9.Sorting");
        System.out.println("10.Keluar");
        System.out.println("==================================");
    }

    public static void main(String[] args) throws Exception {
        Scanner src = new Scanner(System.in);
        DLL2 dll = new DLL2();
        int menu;
        int data;
        do {
            menu();
            System.out.print(">> ");
            menu = src.nextInt();
            System.out.println("==================================");

            try {
                switch (menu) {
                    case 1:
                        System.out.print("Masukkan Data: ");
                        data = src.nextInt();
                        dll.addFirst(data);
                        break;
                    case 2:
                        System.out.print("Masukkan Data: ");
                        data = src.nextInt();
                        dll.addLast(data);
                        break;

                    case 3:
                        System.out.print("Masukkan Data: ");
                        data = src.nextInt();
                        System.out.print("Masukkan Posisi Index Data: ");
                        int index = src.nextInt();
                        dll.add(data, index);
                        break;
                    case 4:
                        dll.removeFirst();
                        break;

                    case 5:
                        dll.removeLast();
                        dll.print();
                        break;

                    case 6:
                        System.out.print("Masukkan Posisi Index Data Yang Ingin Dihapus: ");
                        int idx = src.nextInt();
                        dll.remove(idx);
                        dll.print();
                        break;

                    case 7:

                        dll.print();
                        break;
                    case 8:
                        System.out.print("Data yang ingin dicari: ");
                        data = src.nextInt();
                        dll.get(data);
                        break;
                    case 9:
                        dll.sortAscending();
                        dll.print();
                        break;
                    case 10:

                        dll.clear();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6 || menu == 7 || menu == 8 || menu == 9 || menu == 10);
    }
}
