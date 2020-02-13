package strukturdata;

/**
 *
 * @author Faris Ikhlasul H
 */
public class BarangMain {

    public static void main(String[] Args) {
        Barang b1 = new Barang();
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("harga 4 Buah = " + hargaTotal);

        Barang b2 = new Barang("Logitech", "Wireless Mouse", 150000, 25);
        b2.tampilBarang();
        Barang b3 = new Barang("SteelSeries", "Wireless Keyboard", 550000, 25);
        b3.tampilBarang();

    }
}
