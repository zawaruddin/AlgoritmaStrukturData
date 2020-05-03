/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_DLL;

/**
 *
 * @author rasyed
 */
import java.util.Scanner;

public class DoubleLLMain_1 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        DoubleLL_1 dll = new DoubleLL_1();
        int pilih, index, item;
        try {
            do {
                System.out.println("DOUBLE LINKED LIST DENGAN MENU");
                System.out.println("==============================");
                menu();
                System.out.print(">> ");
                pilih = src.nextInt();
                System.out.println("==============================");
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan data : ");
                        item = src.nextInt();
                        dll.addFirst(item);
                        break;
                    case 2:
                        System.out.print("Masukkan data : ");
                        item = src.nextInt();
                        dll.addLast(item);
                        break;
                    case 3:
                        System.out.print("Masukkan data : ");
                        item = src.nextInt();
                        System.out.print("Masukkan posisi indeks data : ");
                        index = src.nextInt();
                        dll.add(item, index);
                        break;
                    case 4:
                        dll.removeFirst();
                        break;
                    case 5:
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan posisi indeks data : ");
                        index = src.nextInt();
                        dll.remove(index);
                        break;
                    case 7:
                        dll.print();
                        break;
                    case 8:
                        System.out.print("Masukkan data : ");
                        item = src.nextInt();
                        dll.cari(item);
                        break;
                    case 9:
                        System.out.println("Aplikasi keluar");
                        System.exit(0);
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void menu() {
        System.out.println("Memilih Menu");
        System.out.println("1. Tambah Awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Keluar");
        System.out.println("==============================");
    }
}
