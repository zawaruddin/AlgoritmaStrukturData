/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author rasyed
 */
import java.util.Scanner;

public class Buku_Rasyed {

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner rasyed = new Scanner(System.in);
        rasyed.useDelimiter("\n");
        int pilihan = 0;

        do {
            menu();
            System.out.print("Masukkan Pilihan: ");
            pilihan = rasyed.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Buku: ");
                    int kdBuku = rasyed.nextInt();
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = rasyed.next();
                    System.out.print("Masukkan Stok: ");
                    int stok = rasyed.nextInt();
                    String keadaan = "Baik";
                    Buku data = new Buku(kdBuku, judul, stok, keadaan);

                    dll.addFirst(data);
                    break;
                case 2:
                    System.out.print("Masukkan index: ");
                    int idx = rasyed.nextInt();
                    dll.remove(idx);
                    break;
                case 3:
                    System.out.print("Masukkan index: ");
                    idx = rasyed.nextInt();
                    dll.addRusak(idx);
                    break;
                case 4:
                    dll.sortList();
                    dll.print();
                    break;
                case 5:
                    System.out.print("Masukkan Kode Buku atau Judul");
                    Object key = rasyed.next();
                    dll.getFind(key);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (pilihan > 0 && pilihan < 7);
    }

    public static void menu() {
        System.out.println("1. Buku Masuk");
        System.out.println("2. Buku Keluar");
        System.out.println("3. Buku Rusak");
        System.out.println("4. Tampil data");
        System.out.println("5. Pencarian");
        System.out.println("6. Keluar");
    }
}
