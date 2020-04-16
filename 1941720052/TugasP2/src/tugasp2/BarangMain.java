/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp2;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class BarangMain {
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        Barang brg = new Barang();
        System.out.print("Masukkan nama barang: ");
        brg.nama = luluk.nextLine();
        System.out.print("Masukkan harga satuan: ");
        brg.hargaSatuan = mufida.nextInt();
        System.out.print("Masukkan jumlah barang: ");
        brg.jumlah = mufida.nextInt();

        System.out.println("Barang yang Anda beli adalah: " + brg.nama);
        System.out.println("Harga total belanja Anda: " + brg.hitungHargaTotal());
        System.out.println("Diskon yang Anda dapatkan: " + brg.hitungDiskon());
        System.out.println("Jumlah harga yang harus Anda bayar: " + brg.hitungHargaBayar());

    }
    
}
