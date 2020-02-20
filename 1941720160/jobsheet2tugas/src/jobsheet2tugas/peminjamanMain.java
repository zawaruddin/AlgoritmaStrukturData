package jobsheet2tugas;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class peminjamanMain {
    public static void main(String[] args){
        Scanner irul = new Scanner(System.in);
        Scanner whyd = new Scanner(System.in);
        peminjaman pinjam = new peminjaman();
        
        System.out.println("Masukkan ID member : ");
        pinjam.id = irul.nextInt();
        System.out.println("Masukkan Nama Member : ");
        pinjam.nama_member = whyd.nextLine();
        System.out.println("Masukkan Nama Game : ");
        pinjam.nama_game = whyd.nextLine();
        System.out.println("Masukkan Lama Sewa : ");
        pinjam.lama_pinjam = whyd.nextInt();
        System.out.println("Masukkan Harga Sewa : ");
        pinjam.harga_sewa = irul.nextInt();
        
        System.out.println("=============================");
        pinjam.DataPeminjaman();
        pinjam.hitungtotalHarga();
    }
}
