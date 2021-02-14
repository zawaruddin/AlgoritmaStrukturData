/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Windows 10
 */
public class Barang {

    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    Barang(){
    }
    Barang (String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    void tampilBarang() {
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga satuan = " + hargaSatuan);
    }

    void tambahStok(int a) {
        stok = stok + a;
    }

    void kurangiStok(int a) {
        if(stok > 0){
            stok = stok - a;
        }
    }

    int hitungHargaTotal(int total) {
        return total * hargaSatuan;
    }

    /**
     * @param args the command line arguments
     */
}

