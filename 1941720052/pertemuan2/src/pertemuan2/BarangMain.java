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
public class BarangMain {
   

    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+ hargaTotal);
        
        Barang b2 = new Barang("Logitech","Wireless Mouse", 150000, 25);
        b2.tampilBarang();
        
        Barang b3 = new Barang("Corsair 4 GB","DDR", 300000,30);
        b3.tampilBarang();
    }

}


