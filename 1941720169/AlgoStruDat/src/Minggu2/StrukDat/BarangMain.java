
package Minggu2.StrukDat;

public class BarangMain {
    public static void main(String[] args) {
        Barang bl = new Barang();
        bl.namaBarang = "Corsair 2GB";
        bl.jenisBarang = "DDR";
        bl.hargaSatuan = 250000;
        bl.stok = 10;
        bl.tambahStok(1);
        bl.kurangiStok(3);
        bl.tampilbarang();
        int hargaTotal = bl.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        
        Barang b2 = new Barang("Logitech", "Wireless Mouse", 150000,25);
        b2.tampilbarang();
        
        Barang b3 = new Barang("JBL", "earphone", 80000, 10);
        b3.tampilbarang();
    }
}
