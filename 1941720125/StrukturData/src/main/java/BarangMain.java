/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.namaBarang = "Corsair 2GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok =10;
        b1.tambahstok(1);
        b1.kurangstok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
    
        Barang b3 = new Barang("logitech","Wireless Mouse",150000,25);
        b3.tampilBarang();
    
    
    }
}
