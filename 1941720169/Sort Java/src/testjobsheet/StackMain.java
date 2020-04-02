package testjobsheet;

import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        char data[] = {'d', 'h', 'i', 'm', 'a', 's', 'a', 'r', 'b', 'i', 's', 'u', 'k', 'm', 'a', 'h', 'i', 'm', 'a', 'w', 'a', 'n'};
        Stack tumpukan = new Stack(data.length);
        for (int i = 0; i < tumpukan.size; i++) {
            tumpukan.push(data[i]);
        }
        System.out.println("*** UTS - Pratikum ASD ***\n~~~ Program Pencarian Data ~~~");
        System.out.println("Dibuat oleh\t: Dhimas Arbi Sukma Himawan\nNIM\t\t: 1941720169\n");
        System.out.print("Data: {");
        tumpukan.tampilData();
        System.out.println("Pilih Metode Pencarian: \n1. Sequential Search\n2. Binary Search\n");
        System.out.print("Saya pilih nomor: ");
        int metode = dhimas.nextInt();
        System.out.print("Data yang dicari: ");
        char cari = dhimas.next().charAt(0);
        if (metode == 1) {
            tumpukan.tampilPosisi(cari, metode);
        } else {
            tumpukan.mergeSort();
            tumpukan.jumlahHuruf(cari);
            System.out.print(">> {");
            tumpukan.tampilData();
            for (int i = 0; i < tumpukan.count; i++) {
                tumpukan.posisi[i] = tumpukan.FindBinarySearch(cari, 0, tumpukan.data.length - i);
                tumpukan.tukar(cari, tumpukan.posisi[i]);
            }
            tumpukan.tampilPosisi(cari, metode);
        }
    }
}
