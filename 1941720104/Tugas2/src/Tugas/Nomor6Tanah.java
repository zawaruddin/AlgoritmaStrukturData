/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class Nomor6Tanah {

    static Scanner daffa = new Scanner(System.in);

    public static void main(String[] args) {
        Nomor6Tanah tanah = new Nomor6Tanah();
        int jumlah = jumlah();
        rincian(jumlah);
    }
    public int panjang, lebar, jumlah;

    public static int jumlah() {
        System.out.print("Masukkan jumlah tanah: ");
        int jmlhTanah = daffa.nextInt();
        return jmlhTanah;
    }

    public static int rincian(int jmlhTanah) {
        for (int a = 0; a < jmlhTanah; a++) {
            System.out.println("Tanah ke-" + (a + 1));
            System.out.print("Panjang   : ");
            int panjang = daffa.nextInt();
            System.out.print("Lebar     : ");
            int lebar = daffa.nextInt();
            int luas = panjang * lebar;
            System.out.println("Luas tanah ke-" + (a + 1)+ ": " +luas);
            System.out.println("====================");
        }
        return jmlhTanah;
    }
}
