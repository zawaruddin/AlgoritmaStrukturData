
import java.util.Scanner;

public class BarangMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Barang br = new Barang();
        int hSatuan[] = {20000, 5000, 25000, 15000};
        String barang[] = {"Sampo", "Sabun", "Sabun Cuci", "Pasta Gigi"}, barangDibeli;

        for (int i = 0; i < barang.length; i++) {
            System.out.println((i + 1)+". " + barang[i]);
        }
        System.out.print("Masukkan Nama: ");
        br.nama = dhimas.nextLine();
        System.out.print("Masukkan barang yang akan dibeli: ");
        barangDibeli = dhimas.nextLine();
        System.out.print("Masukkan jumlah barang: ");
        br.jumlah = dhimas.nextInt();

        if (barangDibeli.equalsIgnoreCase("sampo")) {
            br.hargaSatuan = hSatuan[0];
        } else if (barangDibeli.equalsIgnoreCase("sabun")) {
            br.hargaSatuan = hSatuan[1];
        } else if (barangDibeli.equalsIgnoreCase("sabun cuci")) {
            br.hargaSatuan = hSatuan[2];
        } else if (barangDibeli.equalsIgnoreCase("pasta gigi")) {
            br.hargaSatuan = hSatuan[3];
        } else {
            System.out.println("input yang anda masukkan salah!!");
        }
        
        int hargaTotal = br.hitungHargaTotal();
        int diskon = br.hitungDiskon(hargaTotal);
        String jmlDiskon = (diskon == 0) ? "Anda tidak mendapatkan diskon" : "Anda mendapat diskon Rp."+diskon;
        System.out.println("Total harga: Rp."+hargaTotal);
        System.out.println(jmlDiskon);
        System.out.println("Harga yang harus dibayarkan adalah Rp."+br.hitungHargaBayar(hargaTotal, diskon));
    }
}
