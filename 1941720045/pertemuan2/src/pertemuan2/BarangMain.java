/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang b1= new Barang();
        b1.namaBarang="Corsair 2 GB";
        b1.jenisBarang="DDR";
        b1.hargaSatuan=250000;
        b1.stok=0;
        b1.tambahStok(0);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal=b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        
        //Barang b2=new Barang ("Logitect","Wireless Mouse", 15000,25);
        //b2.tampilBarang();
        
       // Barang b3=new Barang ("Asus ROG","Gaming Laptop", 10, 25000000);
       // b3.tampilBarang();
    }
}
