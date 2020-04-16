/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Pemilihan metode yang digunakan");
        System.out.println("1.Brute Force\n2.Divide Conquer");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = luluk.nextInt();
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = luluk.nextInt();

        Pangkat png[] = new Pangkat[elemen];

        for (int a = 0; a < elemen; a++) {
            png[a] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (a + 1) + " : ");
            png[a].nilai = luluk.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (a + 1) + " : ");
            png[a].pangkat = luluk.nextInt();
        }

        if (pilihan == 1) {
            System.out.println("==============================================");
            System.out.println("Hasil dengan Brute Force");
            for (int a = 0; a < elemen; a++) {
                System.out.println("Nilai " + png[a].nilai + " adalah : " + png[a].pangkatBF(png[a].nilai, png[a].pangkat));
            }
        } else {
            System.out.println("==============================================");
            System.out.println("Hasil dengan Divide Conquer");
            for (int a = 0; a < elemen; a++) {
                System.out.println("Nilai " + png[a].nilai + " adalah : " + png[a].pangkatDC(png[a].nilai, png[a].pangkat));
            }
            System.out.println("==============================================");

        }

    }

}
