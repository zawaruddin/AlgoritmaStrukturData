/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

import java.util.Scanner;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class InputPenduduk {
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
       Scanner Hosnol = new Scanner(System.in);
        
        System.out.println("Pencarian Data Penduduk Berdasarkan NIK Penduduk");
        System.out.println("=============================================");
        System.out.print("Jumlah data : ");
        int jml = arif.nextInt();
        
        cariPenduduk pencarian = new cariPenduduk(jml);

        for (int i = 0; i < pencarian.jmlData; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.print("NIK\t\t: ");
            int nik = arif.nextInt();
            System.out.print("Nama\t\t: ");
            String nama = Hosnol.nextLine();
            System.out.print("Alamat\t\t: ");
            String alamat = Hosnol.nextLine();
            System.out.print("Jenis Kelamin\t: ");
            String jenisK = Hosnol.nextLine();
            System.out.println();
            
            penduduk P = new penduduk(nik, nama, alamat, jenisK);
            pencarian.tambah(P);
        }
        
        System.out.print("Masukkan NIK data penduduk yang dicari : ");
        int cari = arif.nextInt();
        System.out.println("============================================");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
            
    }
}