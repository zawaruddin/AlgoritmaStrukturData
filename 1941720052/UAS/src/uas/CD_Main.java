/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class CD_Main {

    static void menu() {
        System.out.println("MENU OPERASI");
        System.out.println("1. CD Masuk");
        System.out.println("2. CD Keluar");
        System.out.println("3. CD Rusak");
        System.out.println("4. Tampilan Semua Data");
        System.out.println("5. Cari CD");
        System.out.println("6. Keluar");
    }

    public static void main(String[] args) throws Exception {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int kd, jml_stok, jml_rusak;
        String dist;
        char jdl;

        try {
            int n = 1;
            while (n != 10) {
                menu();
                System.out.print("Masukkan menu pilihan Anda : ");
                n = luluk.nextInt();
                System.out.println("==============================");
                switch (n) {
                    case 1: {
                        System.out.print("Input Kode :");
                        kd = luluk.nextInt();
                        System.out.print("Input judul : ");
                        jdl = sc.next().charAt(0);
                        System.out.print("Input Distributor : ");
                        dist = mufida.nextLine();
                        System.out.print("Input jumlah Stok : ");
                        jml_stok = luluk.nextInt();
                        System.out.print("Input jumlah cd rusak : ");
                        jml_rusak = luluk.nextInt();
                        dll.CD_Masuk(kd, jdl, dist, jml_stok, jml_rusak);
                        break;
                    }
                    case 2: {
                        System.out.print("Input index data : ");
                        int x = luluk.nextInt();
                        dll.remove(x);
                        break;
                    }
                    case 3: {
                        //cd rusak
                        break;
                    }
                    case 4: {
                        dll.print();
                        break;
                    }
                    case 5: {
                        System.out.print("Input data yang di cari : ");
                        String cari = mufida.nextLine();
                        if (dll.cari(cari) == 0) {
                            System.out.println("Data tidak ada");
                        } else {
                            System.out.println("Data " + cari + " pada index ke-" + dll.cari(cari));
                        }
                        break;
                    }
                    case 6: {
                        System.exit(0);
                        break;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        luluk.close();
        mufida.close();
    }

}
