/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor4;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class MainPenduduk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        
        System.out.println("Pencarian Data Penduduk Berdasarkan NIK Penduduk");
        System.out.println("===========================================================");
        System.out.print("Jumlah data : ");
        int jml = luluk.nextInt();
        
        SearchingPenduduk pencarian = new SearchingPenduduk(jml);

        for (int i = 0; i < pencarian.jumlahData; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.print("NIK : ");
            int nik = luluk.nextInt();
            System.out.print("Nama : ");
            String nama = mufida.nextLine();
            System.out.print("Alamat : ");
            String alamat = mufida.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisK = mufida.nextLine();
            System.out.println();
            
            Penduduk P = new Penduduk(nik, nama, alamat, jenisK);
            pencarian.tambah(P);
        }
        
        System.out.print("Masukkan NIK data penduduk yang dicari : ");
        int cari = luluk.nextInt();
        System.out.println("===========================================================");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
    }
    
}
