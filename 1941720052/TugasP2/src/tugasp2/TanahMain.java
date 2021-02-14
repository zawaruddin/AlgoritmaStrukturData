/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp2;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class TanahMain {

    public static void main(String[] args) {

        int maks = 0, tanah = 0;
        Scanner luluk = new Scanner(System.in);
        System.out.print("Masukkan jumlah tanah: ");
        int jml = luluk.nextInt();
        Tanah tn[] = new Tanah[jml];

        for (int a = 0; a < tn.length; a++) {
            System.out.println("Tanah ke-" + (a + 1));
            tn[a] = new Tanah();
            System.out.print("Panjang: ");
            tn[a].panjang = luluk.nextInt();
            System.out.print("Lebar: ");
            tn[a].lebar = luluk.nextInt();
        }
        System.out.println();
        for (int a = 0; a < tn.length; a++) {
            System.out.println("Tanah ke-" + (a + 1));
            System.out.println("Panjang: " + tn[a].panjang);
            System.out.println("Lebar: " + tn[a].lebar);
            System.out.println();
        }
        System.out.println();
        for (int a = 0; a < tn.length; a++) {;
            System.out.println("Luas Tanah " + (a + 1) + " : " + tn[a].hitungLuasTanah());
        }
        System.out.println();
        for (int a = 0; a < tn.length; a++) {
            if (tn[a].hitungLuasTanah() > maks) {
                maks = tn[a].hitungLuasTanah();
                tanah = a + 1;
            }
        }
        System.out.println("Tanah Terluas: Tanah " + tanah);
    }
}
