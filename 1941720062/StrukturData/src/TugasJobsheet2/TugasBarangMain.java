package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class TugasBarangMain {

    public static void main(String[] Args) {
        String i;
        Scanner faris = new Scanner(System.in);
        System.out.println("=== Selamat Di Toko Komputer === ");
        System.out.println("1. Keyboard Corsair Rp.550.000");
        System.out.println("2. Keyboard SteelSeries Rp.850.000");
        System.out.println("3. Mouse Razer Rp.700.000");
        System.out.println("4. Mouse DA Rp.350.000");
        System.out.println("5. Batal");
        System.out.print("Masukkan Pilihan Anda = ");
        int pilih = faris.nextInt();
        System.out.print("Berapa Jumlah Barang Yang Akan Anda Beli = ");
        int x = faris.nextInt();
        TugasBarang b1 = new TugasBarang();
        if (pilih == 1) {
            b1.nama = "Keyboard Corsair Rp.550.000";
            b1.HargaSatuan = 550000;
            b1.jumlah = x;
        } else if (pilih == 2) {
            b1.nama = "Keyboard SteelSeries Rp.850.000";
            b1.HargaSatuan = 850000;
            b1.jumlah = x;
        } else if (pilih == 3) {
            b1.nama = "Mouse Razer Rp.700.000";
            b1.HargaSatuan = 700000;
            b1.jumlah = x;
        } else if (pilih == 4) {
            b1.nama = "Mouse DA Rp.350.000";
            b1.HargaSatuan = 350000;
            b1.jumlah = x;
        } else if (pilih == 5) {
            System.out.println("Terima Kasih Telah Menggunakan Progam By Faris Ikhlasul H");
        } else {
            System.out.println("Pilihan Anda Tidak Terdaftar");
        }
        b1.tampilBarang();
        System.out.println("Harga Sebelum Diskon = " +b1.hitungHargatotal());
        System.out.println("Harga Setelah Diskon = " +b1.hitungHargaBayar());
        
    }

}
