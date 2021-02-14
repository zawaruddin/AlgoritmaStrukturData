/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class Tugas2Main {
    public static void main(String[]args){
        Tugas2 sewa = new Tugas2();
        sewa.namaMember = "Edward Kenway Ezio";
        sewa.id = "93947286964-98982";
        sewa.namaGame = "Assasins Creed Black Flag";
        sewa.lamaPinjam = 480;
        sewa.hargaSewa = 250000;
        sewa.tampilkan();
        int hargaTotal = sewa.hitungHargaTotal(1);
        System.out.println("Harga Totalnya Adalah = "+hargaTotal);       
    }
}

