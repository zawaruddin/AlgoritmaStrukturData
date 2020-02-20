package jobsheet2tugas;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class tugas3main {
    public static void main(String[] args){
        Scanner irul = new Scanner(System.in);
        tugas3 brg = new tugas3();
        
        System.out.println("Masukkan Nama Barang : ");
        brg.Nama = irul.nextLine();
        System.out.println("Jumlah Barang : ");
        brg.jml = irul.nextInt();
        System.out.println("Harga Satuan : ");
        brg.hrgSatuan = irul.nextInt();
        System.out.println("==================================");
        System.out.println("Nama \t\t : " + brg.Nama);
        System.out.println("Jumlah \t\t : " + brg.jml);
        System.out.println("Harga Satuan \t : " + brg.hrgSatuan);
        System.out.println("Total Harga \t : " + brg.hitungHrgTot());
        System.out.println("Diskon \t\t : " + brg.hitungDiskon());
        System.out.println("Total Bayar \t : " + brg.hitungHargaBayar());
    }
}
