/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author mac14
 */
public class Barang {

    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    Barang() {

    }

    Barang(String nm, String jn, int st, int hs) {
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    Barang b3 = new Barang();

    void tampilBarang() {
        System.out.println("Nama: " + namaBarang);
        System.out.println("Jenis: " + jenisBarang);
        System.out.println("Stok: " + stok);
        System.out.println("Harga satuan: " + hargaSatuan);
    }

    void tambahStok(int n) {
        stok = stok + n;
    }

    void kurangiStok(int n) {
        if (n > 0) {
            stok = stok - n;
        }
    }

    int hitungHargaTotal(int jumlah) {
        return jumlah * hargaSatuan;
    }
}
