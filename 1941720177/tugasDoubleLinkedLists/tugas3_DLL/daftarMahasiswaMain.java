/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_DLL;

/**
 *
 * @author rasyed
 */
import java.util.Scanner;

public class daftarMahasiswaMain {

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
        daftarMahasiswa dll = new daftarMahasiswa();
        String name;
        int nilai, menu, idx;
        do {
            menu();
            System.out.print(">> ");
            menu = src.nextInt();
            System.out.println("==================================");

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama  : ");
                    name = src.next();
                    System.out.print("Masukkan Nilai : ");
                    nilai = src.nextInt();
                    dll.addFirst(name, nilai);
                    break;
                case 2:
                    System.out.print("Masukkan Nama  : ");
                    name = src.next();
                    System.out.print("Masukkan Nilai : ");
                    nilai = src.nextInt();
                    dll.addLast(name, nilai);
                    break;

                case 3:
                    System.out.print("Masukkan Nama  : ");
                    name = src.next();
                    System.out.print("Masukkan Nilai : ");
                    nilai = src.nextInt();
                    System.out.print("Masukkan posisi index data : ");
                    int index = src.nextInt();
                    dll.add(name, nilai, index);
                    break;
                case 4:
                    dll.removeFirst();
                    break;

                case 5:
                    dll.removeLast();
                    dll.print();
                    break;

                case 6:
                    System.out.print("Masukkan posisi index data yang ingin dihapus : ");
                    idx = src.nextInt();
                    dll.remove(idx);
                    dll.print();
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan Nama    : ");
                    name = src.next();
                    System.out.print("Masukkan Nilai   : ");
                    nilai = src.nextInt();
                    dll.search(name, nilai);
                    break;
                case 9:
                    dll.Urut();
                    dll.print();
                    break;
                case 10:
                    System.exit(0);
                    break;
            }

        } while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6 || menu == 7 || menu == 8 || menu == 9);
    }
}
