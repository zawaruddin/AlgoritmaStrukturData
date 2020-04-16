/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp2;

/**
 *
 * @author Windows 10
 */
public class Peminjaman {
    String namaMember, namaGame;
    int id, lamaPinjam, hargaSewa, totalHarga;
    
    void dataHasilPeminjaman(){
        System.out.println("Id Peminjam: "+id);
        System.out.println("Nama Member: "+namaMember);
        System.out.println("Nama game: "+namaGame);
        System.out.println("Lama Pinjam: "+lamaPinjam);
        System.out.println("Harga Sewa per Hari: "+hargaSewa);
    }
    void hargaBayar(){
        totalHarga = lamaPinjam * hargaSewa;
        System.out.println("Total harga sewa: "+ totalHarga);
    }
    
}
