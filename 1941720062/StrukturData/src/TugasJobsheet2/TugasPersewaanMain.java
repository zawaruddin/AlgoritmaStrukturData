package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class TugasPersewaanMain {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String nama, id;
        int hari;
        char pilih;
        String[] Game
                = {"Battlefield 4",
                    "GTA V",
                    "Call OF Duty AW",
                    "Sniper Elite 4",
                    "Forza Horizon 4",
                    "Keluar Progam"};

        System.out.println("Selamat Datang Di Peminjaman Game Malang");
        System.out.print("Masukkan id Pelanggan anda = ");
        id = faris.next();
        System.out.print("Masukkan Nama Anda = ");
        nama = faris.next();
        System.out.println("< Berikut Game Yang Tersedia >");
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + ". " + Game[i]);
        }
        System.out.print("Masukkan Nama Game Pilihan (1-6) =");
        pilih = input.next().charAt(0);
        System.out.print("Rencana Pinjam (Hari) = ");
        hari = input.nextInt();

        TugasPersewaan P = new TugasPersewaan();
        if (pilih == '1') {
            P.namaGame = "Battlefield 4";
            P.pinjamHari = hari;
            P.sewaPerhari = 5000;
        } else if (pilih == '2') {
            P.namaGame = "GTA V";
            P.pinjamHari = hari;
            P.sewaPerhari = 6000;
        } else if (pilih == '3') {
            P.namaGame = "Call OF Duty AW";
            P.pinjamHari = hari;
            P.sewaPerhari = 4000;
        } else if (pilih == '4') {
            P.namaGame = "Sniper Elite 4";
            P.pinjamHari = hari;
            P.sewaPerhari = 3000;
        } else if (pilih == '5') {
            P.namaGame = "Forza Horizon 4";
            P.pinjamHari = hari;
            P.sewaPerhari = 10000;
        } else if (pilih == '6') {
            System.out.println("Terima Kasih Telah Menggunakan Progam By Faris Ikhlasul Haq");
        } else {
            System.out.println("Maaf data Yang Anda Masukkan Salah");
        }
        System.out.println("=== STRUK PEMINJAMAN ANDA ===");
        System.out.println("Nomor ID = " + id);
        System.out.println("Nama Pemilik = " + nama);
        P.tampilBarang();
        System.out.println("Total Pembayaran Anda = "+P.perhitungan());
    }

}
