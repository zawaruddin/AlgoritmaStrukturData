package Jobsheet11;

import java.util.Scanner;

public class MainLinkedLists {

    static Scanner dhimas = new Scanner(System.in);
    static Scanner arbi = new Scanner(System.in);

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

        LinkedLists data = new LinkedLists();
        int pilih, index;
        String item;
        try {
            do {
                menu();
                System.out.print("Masukkan Pilihan -|>");
                pilih = dhimas.nextInt();
                subMenu(pilih);
                System.out.print("Pilih Operasi: ");
                int opr = dhimas.nextInt();
                switch (pilih) {
                    case 1:
                        if (opr == 1) {
                            System.out.print("Masukkan data pertama: ");
                            item = arbi.nextLine();
                            data.addFirst(item);
                        } else if (opr == 2) {
                            System.out.print("Masukkan data: ");
                            item = arbi.nextLine();
                            System.out.print("Masukkan index: ");
                            index = dhimas.nextInt();
                            data.add(item, index);
                        } else if (opr == 3) {
                            System.out.print("Masukkan data terakhir: ");
                            item = arbi.nextLine();
                            data.addLast(item);
                        } else {
                            data.print();
                            System.out.print("data yang akan ditambahkan: ");
                            item = arbi.nextLine();
                            System.out.print("Posisi setelah data: ");
                            String index1 = arbi.nextLine();
                            data.addByValue(item, index1);
                            data.print();
                        }
                        break;
                    case 2:
                        if (opr == 1) {
                            System.out.print("Hapus data index ke-");
                            index = dhimas.nextInt();
                            data.remove(index);
                        } else if (opr == 2) {
                            data.print();
                            System.out.print("Masukkan data: ");
                            item = arbi.nextLine();
                            data.removeByKey(item);
                            data.print();
                        } else if (opr == 3) {
                            System.out.print("Menjalankan Penghapusan");
                            data.clear();
                        } else {
                        }
                        break;
                    case 3:
                        if (opr == 1) {
                            System.out.print("Cari data pada indeks ke-");
                            index = dhimas.nextInt();
                            data.cariByIndex(index);
                        } else if (opr == 2) {
                            System.out.print("Masukkan data: ");
                            item = arbi.nextLine();
                            data.cari(item);
                        } else {
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
