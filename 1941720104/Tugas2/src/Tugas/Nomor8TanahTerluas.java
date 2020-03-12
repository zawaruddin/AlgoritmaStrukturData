/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author daffa
 */
import java.util.Scanner;

public class Nomor8TanahTerluas {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        Nomor8TanahTerluas2 tanah3 = new Nomor8TanahTerluas2();
        int jumlah, temp = 0, tanah = 0;
        System.out.print("Jumlah tanah: ");
        tanah3.jmlTanah = daffa.nextInt();

        Nomor8TanahTerluas2 tanah2[] = new Nomor8TanahTerluas2[tanah3.jmlTanah];

        for (int a = 0; a < tanah2.length; a++) {
            System.out.println("Tanah ke-" + (a + 1));
            tanah2[a] = new Nomor8TanahTerluas2();
            System.out.print("Panjang   : ");
            tanah2[a].panjang = daffa.nextInt();
            System.out.print("Lebar     : ");
            tanah2[a].lebar = daffa.nextInt();
            System.out.println("====================");
        }

        for (int b = 0; b < tanah2.length; b++) {
            System.out.println("Luas Tanah ke-" + (b + 1) + ": " + tanah2[b].hitungLuasTanah());
            if (tanah2[b].hitungLuasTanah() > temp) {
                temp = tanah2[b].hitungLuasTanah();
                tanah = b + 1;
            }
        }
        System.out.println();
        System.out.println("Tanah terluas: Tanah ke-" + tanah);
    }
}
