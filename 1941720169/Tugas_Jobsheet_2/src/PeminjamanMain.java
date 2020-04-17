
import java.util.Scanner;

public class PeminjamanMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Peminjaman pj = new Peminjaman();
        int harga[] = {25000, 25000, 50000, 50000}, barangSewa;
        String barang[] = {"VCD game", "Stick Game", "Xbox 360", "PS3"};
        
        System.out.println("Sewa Harian");
        for (int i = 0; i < barang.length; i++) {
            System.out.println((i + 1) + ". " + barang[i]);
        }
        System.out.print("Masukkan ID member: ");
        pj.ID = dhimas.nextLine();
        System.out.print("Masukkan Nama: ");
        pj.namaMember = dhimas.nextLine();
        System.out.print("Masukkan nomor barang: [1-4] ");
        barangSewa = dhimas.nextInt();
        System.out.print("Masukkan Lama pinjam: ");
        pj.lamaPinjam = dhimas.nextInt();

        switch (barangSewa) {
            case 1:
                pj.hargaSewa = harga[0];
                pj.namaGame = barang[0];
                break;
            case 2:
                pj.hargaSewa = harga[1];
                pj.namaGame = barang[1];
                break;
            case 3:
                pj.hargaSewa = harga[2];
                pj.namaGame = barang[2];
                break;
            case 4:
                pj.hargaSewa = harga[3];
                pj.namaGame = barang[3];
                break;
            default:
                System.out.println("input yang anda masukkan salah!!");
                break;
        }
        System.out.println("");
        pj.tampil();
    }

}
