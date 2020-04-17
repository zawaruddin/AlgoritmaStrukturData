package UTSsmt2;

import java.util.Scanner;

public class PencarianMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        char data[] = {'d', 'h', 'i', 'm', 'a', 's', 'a', 'r', 'b', 'i', 's', 'u', 'k', 'm', 'a', 'h', 'i', 'm', 'a', 'w', 'a', 'n'};
        Pencarian cr = new Pencarian(data,data.length);
        System.out.println("*** UTS - Pratikum ASD ***\n~~~ Program Pencarian Data ~~~");
        System.out.println("Dibuat oleh\t: Dhimas Arbi Sukma Himawan\nNIM\t\t: 1941720169\n");
        System.out.print("Data: {");
        cr.tampilData();
        System.out.println("Pilih Metode Pencarian: \n1. Sequential Search\n2. Binary Search\n");
        System.out.print("Saya pilih nomor: ");
        int metode = dhimas.nextInt();
        System.out.print("Data yang dicari: ");
        char cari = dhimas.next().charAt(0);
        if (metode == 1) {
            cr.tampilPosisi(cari, metode);
        } else {
            cr.mergeSort();
            cr.jumlahHuruf(cari);
            System.out.print(">> {");
            cr.tampilData();
            for (int i = 0; i < cr.count; i++) {
                cr.posisi[i] = cr.FindBinarySearch(cari, 0, cr.size - i);
                cr.tukar(cari, cr.posisi[i]);
            }
            cr.tampilPosisi(cari, metode);
        }
    }
}
