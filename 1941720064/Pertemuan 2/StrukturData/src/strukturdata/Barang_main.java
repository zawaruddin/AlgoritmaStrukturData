/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata;

/**
 *
 * @author Abdulloh Aqil
 */
public class Barang_main {
    public static void main(String[] args) {
       Barang b1 =new Barang();
       b1.nama_barang = "Corsair 2 gb";
       b1.jenis_barang = "DDR - SD";
       b1.hargasatuan =250000;
       b1.stok = 10;
       b1.tambah_stok(1);
       b1.kurangi_stok(3);
       b1.tampil_barang();
       int harga_total = b1.hitung_harga_stok(4);
       System.out.println("Harga 4 buah = "+harga_total);
        
        Barang b2 = new Barang ("Votre","Kabel Mouse", 15000, 25);
        b2.tampil_barang();
        
        Barang b3 = new Barang ("Asus ROG","Wirless", 1500000, 25);
        b3.tampil_barang();
    }
    
}
