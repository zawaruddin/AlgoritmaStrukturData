/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class UTSMain {

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        System.out.println("===============PROGRAM MENCARI DATA (UTS ASD 2020)===============");
        System.out.println("Dibuat Oleh : Luluk Mufida");
        System.out.println("NIM         : 1941720052");

        char data[] = {'l', 'u', 'l', 'u', 'k', 'm', 'u', 'f', 'i', 'd', 'a'};
        UTS pencarian = new UTS(data, data.length);
        

        System.out.print("Pilih metode pencarian(1/2): \n1.Sequential Search\n2.Binary Search. \nIsi disini: ");
        int pilihan = luluk.nextInt();
        System.out.println("Nomor yang saya pilih : " + pilihan);
        System.out.print("Masukkan data yang akan dicari: ");
        char cari = luluk.next().charAt(0);       
        switch (pilihan) {
            case 1:
                System.out.println("Hasil Pencarian dengan Sequential Search : ");
                int pos = pencarian.Sequential(cari);
                pencarian.PrintPos(cari, pos);
                break;
            case 2:
                System.out.println("Hasil Pengurutan Data dengan Merge Sort : ");
                pencarian.mergeSort(data);
                System.out.print(">> ");
                for (int i = 0; i < data.length; i++) {
                    System.out.print("'" + data[i] + "', ");
                }
                pencarian.PosisiBinary(data, cari);
                System.out.println();
                System.out.println();
                System.out.println("Banyaknya huruf '" + cari + "' adalah : " + pencarian.jumlah(cari));
                System.out.println();
                System.out.println("Hasil Pencarian dengan Binary Search : ");
                int posisi = pencarian.Binary(cari, 0, data.length - 1);
                pencarian.PrintArray(cari, posisi);
                break;
        }
    }
}
