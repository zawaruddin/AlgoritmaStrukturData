/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;
import java.util.Scanner;
/**
 *
 * @author Rasyedrenaldi
 */
public class MainLinkedList {
     static Scanner rasyed = new Scanner(System.in);
    static Scanner renaldi = new Scanner(System.in);

    public static void menu() {
        System.out.println("Masukkan Operasi yang diinginkan");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
    }
    public static void subMenu(int menu) {
        System.out.println("Pilih SubMenu: ");
        switch (menu) {
            case 1:
                System.out.println("1. Tambah First");
                System.out.println("2. Tambah(item,index)");
                System.out.println("3. Tambah Last");
                System.out.println("4. Add by value");
                break;
            case 2:
                System.out.println("1. Hapus(index)");
                System.out.println("2. Hapus (key)");
                System.out.println("3. Clear");
                break;
            case 3:
                System.out.println("1. Cari(index)");
                System.out.println("2. Cari(key)");
                break;
            case 4:
                System.out.println("Aplikasi keluar");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {

        LinkedList data = new LinkedList();
        int pilih, index;
        String item;
        try {
            data.addFirst("1");
            data.add("3", 1);
            data.add("5", 2);
            data.add("8", 3);
            data.add("9",4);
            do {
                menu();
                System.out.print("Masukkan Pilihan -|>");
                pilih = rasyed.nextInt();
                subMenu(pilih);
                System.out.print("Pilih Operasi: ");
                int opr = rasyed.nextInt();
                switch (pilih) {
                    case 1:
                    switch (opr) {
                        case 1:
                            System.out.print("Masukkan data pertama: ");
                            item = renaldi.nextLine();
                            data.addFirst(item);
                            break;
                        case 2:
                            System.out.print("Masukkan data: ");
                            item = renaldi.nextLine();
                            System.out.print("Masukkan index: ");
                            index = rasyed.nextInt();
                            data.add(item, index);
                            break;
                        case 3:
                            System.out.print("Masukkan data terakhir: ");
                            item = renaldi.nextLine();
                            data.addLast(item);
                            break;
                        default:
                            data.print();
                            System.out.print("data yang akan ditambahkan: ");
                            item = renaldi.nextLine();
                            System.out.print("Posisi setelah data: ");
                            String index1 = renaldi.nextLine();
                            data.addByValue(item, index1);
                            data.print();
                            break;
                    }
                        break;

                    case 2:
                    switch (opr) {
                        case 1:
                            System.out.print("Hapus data index ke-");
                            index = rasyed.nextInt();
                            data.remove(index);
                            break;
                        case 2:
                            data.print();
                            System.out.print("Masukkan data: ");
                            item = renaldi.nextLine();
                            data.removeByKey(item);
                            data.print();
                            break;
                        case 3:
                            System.out.print("Menjalankan Penghapusan");
                            data.clear();
                            break;
                        default:
                            break;
                    }
                        break;

                    case 3:
                    switch (opr) {
                        case 1:
                            System.out.print("Cari data pada indeks ke-");
                            index = rasyed.nextInt();
                            data.cariByIndex(index);
                            break;
                        case 2:
                            System.out.print("Masukkan data: ");
                            item = renaldi.nextLine();
                            data.cari(item);
                            break;
                        default:
                            break;
                    }
                        break;

                    default:
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
