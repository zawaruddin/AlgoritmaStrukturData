/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp2;

/**
 *
 * @author Windows 10
 */import java.util.Scanner;
public class PeminajamanMain {
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        Peminjaman pjm = new Peminjaman();
        
        System.out.print("Masukkan Id Peminjam: ");
        pjm.id = luluk.nextInt();
        System.out.print("Masukkan nama member: ");
        pjm.namaMember = mufida.nextLine();
        System.out.print("Masukkan nama game: ");
        pjm.namaGame = mufida.nextLine();
        System.out.print("Masukkan lama sewa: ");
        pjm.lamaPinjam = luluk.nextInt();
        System.out.print("Masukka harga sewa: ");
        pjm.hargaSewa = luluk.nextInt();
        System.out.println();
        pjm.dataHasilPeminjaman();
        pjm.hargaBayar();
    }
    
}
