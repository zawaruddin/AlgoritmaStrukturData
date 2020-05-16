/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persewaanCD;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class MainProgram {
    
    static Scanner daffa = new Scanner(System.in);
    static Scanner cahyo = new Scanner(System.in);
    
    public static void main(String[] args) {
        DoubleLinkedListCD dll = new DoubleLinkedListCD();
        try {
            int n = 1;
            while (n != 10) {
                menu();
                System.out.print("Jawaban: ");
                n = daffa.nextInt();
                System.out.println("==============================");
                switch (n) {
                    case 1: {
                        System.out.print("Masukkan Index : ");
                        int index = daffa.nextInt();
                        System.out.print("Masukkan Kode : ");
                        int kode = daffa.nextInt();
                        System.out.print("Masukkan judul: ");
                        String judul = daffa.next();
                        System.out.print("Masukkan penerbit: ");
                        String penerbit = cahyo.next();
                        System.out.print("Masukkan stok: ");
                        int stok = daffa.nextInt();
                        dll.addFirst(index, kode, judul, penerbit, stok);
                        break;
                    }
                    case 2: {
                        System.out.print("Input data : ");
                        int x = daffa.nextInt();
                        dll.remove(x);
                        break;
                    }
                    case 3: {
                        System.out.print("Input data : ");
                        int x = daffa.nextInt();
                        System.out.println("Judul: ");
                        String judul = daffa.nextLine();
                        System.out.println("Penerbit: ");
                        String penerbit = daffa.nextLine();
                        System.out.println("Jumlah stok: ");
                        int stok = daffa.nextInt();
                        System.out.println("Jumlah rusak: ");
                        int rusak =+ x;
                        break;
                    }
                    case 4: {
                        dll.print();
                        break;
                    }
                    case 5: {
                        System.out.print("Input data yang di cari : ");
                        String cari = cahyo.nextLine();
                        if (dll.cari(cari) == 0) {
                            System.out.println("Data tidak ada");
                        } else {
                            System.out.println("Data " + cari + " pada index ke-" + dll.cari(cari));
                        }
                        break;
                    }
                    case 6:
                        System.exit(0);
                }
            }    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        daffa.close();
        cahyo.close();
    }

    static void menu() {
        System.out.println("----------SYSTEM START----------");
        System.out.println("--------------------------------");
        System.out.println("1. Tambah CD");
        System.out.println("2. Keluar CD");
        System.out.println("3. CD Rusak");
        System.out.println("4. Cetak semua CD");
        System.out.println("5. Cari CD");
        System.out.println("6. Keluar");
        System.out.println("--------------------------------");
    }
}
