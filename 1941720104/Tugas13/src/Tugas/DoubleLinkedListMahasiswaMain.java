/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class DoubleLinkedListMahasiswaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        DoubleLinkedListMahasiswa dll = new DoubleLinkedListMahasiswa();
        try {
            int n = 1;
            while (n != 10) {
                menu();
                System.out.println("Input : ");
                n = sc.nextInt();
                System.out.println("==============================");
                switch (n) {
                    case 1: {
                        System.out.print("Input Nama : ");
                        String nm = sc1.nextLine();
                        System.out.print("Input Nilai : ");
                        int x = sc.nextInt();
                        dll.addFirst(nm, x);
                        break;
                    }
                    case 2: {
                        System.out.print("Input Nama : ");
                        String nm = sc1.nextLine();
                        System.out.print("Input Nilai : ");
                        int x = sc.nextInt();
                        dll.addLast(nm, x);
                        break;
                    }
                    case 3: {
                        System.out.print("Input Nama : ");
                        String nm = sc1.nextLine();
                        System.out.print("Input Nilai : ");
                        int x = sc.nextInt();
                        System.out.print("Input index : ");
                        int idx = sc.nextInt();
                        dll.add(nm, x, idx);
                        break;
                    }
                    case 4: {
                        dll.removeFirst();
                        break;
                    }
                    case 5: {
                        dll.removeLast();
                        break;
                    }
                    case 6: {
                        System.out.print("Input data : ");
                        int x = sc.nextInt();
                        dll.remove(x);
                        break;
                    }
                    case 7: {
                        dll.print();
                        break;
                    }
                    case 8: {
                        System.out.print("Input data yang di cari : ");
                        String cari = sc1.nextLine();
                        if (dll.cari(cari) == 0) {
                            System.out.println("Data tidak ada");
                        } else {
                            System.out.println("Data " + cari + " pada index ke-" + dll.cari(cari));
                        }
                        break;
                    }
                    case 9: {
                        dll.bubbleShort();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
        sc1.close();
    }

    static void menu() {
        System.out.println("----------SYSTEM START----------");
        System.out.println("--------------------------------");
        System.out.println("1. Tambah awal");
        System.out.println("2. Tambah akhir");
        System.out.println("3. Tambah data index tertentu");
        System.out.println("4. Hapus awal");
        System.out.println("5. Hapus akhir");
        System.out.println("6. Hapus index tertentu");
        System.out.println("7. Cetak data");
        System.out.println("8. Cari");
        System.out.println("9. Sorting");
        System.out.println("10. Keluar");
        System.out.println("--------------------------------");
    }
}
