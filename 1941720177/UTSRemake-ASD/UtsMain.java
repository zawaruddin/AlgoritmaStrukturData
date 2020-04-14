/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_ASD;

import java.util.Scanner;

/**
 *
 * @author rasyedrenaldi
 */
public class UtsMain {

    public static void main(String[] args) {
        Scanner rasyed = new Scanner(System.in);
        char data[] = {'r', 'a', 's', 'y', 'e', 'd', 'r', 'e', 'n', 'a', 'l', 'd', 'i'};
        Uts cr = new Uts(data, data.length);
        System.out.println("*** UTS - Pratikum ASD ***\n~~~Pencarian Data ~~~");
        System.out.println("Dibuat oleh\t: Rasyed Renaldi\nNIM\t\t: 1941720177\n");
        System.out.print("Data: {");
        cr.tampilData();
        System.out.println("Pilih Metode Pencarian: \n1. Sequential Search\n2. Binary Search\n");
        System.out.print("Saya pilih nomor: ");
        int metode = rasyed.nextInt();
        System.out.print("Data yang dicari: ");
        char cari = rasyed.next().charAt(0);
        if (metode == 1) {
            cr.tampilPosisi(cari, metode);
        } else {
            cr.mergeSort();
            cr.jumlahHuruf(cari);
            System.out.print(">> {");
            cr.tampilData();
            for (var i = 0; i < cr.count; i++) {
                cr.posisi[i] = cr.FindBinarySearch(cari, 0, cr.size - i);
                cr.tukar(cari, cr.posisi[i]);
            }
            cr.tampilPosisi(cari, metode);
        }
    }
}
