package pertemuan2khoirul;

/**
 *
 * @author khoirul
 */
public class barangMain {
    public static void main(String[] args){
        barang b1 = new barang();
        b1.namaBarang = "Corsair 2GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangistok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        
        barang b2 = new barang("Logitech", "Wireless Mouse", 150000, 25);
        b2.tampilBarang();
        
        barang b3 = new barang("Razor", "Cable Mouse", 200000, 25 );
        b3.b3();
    }
}
