/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = daffa.nextInt();
        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + ": ");
            png[i].nilai = daffa.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + ": ");
            png[i].pangkat = daffa.nextInt();
        }

        System.out.println("=====================================================");
        System.out.println("1. Pangkat menggunakan Bruce Force\n2. Pangkat menggunakan Divide and Conquer");
        System.out.print("Masukkan pilihan Anda (1/2): ");
        int pilihan = daffa.nextInt();

        switch (pilihan) {
            case 1:
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("=====================================================");
                System.out.println("Hasil pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah: " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Angka yang Anda masukkan salah!");
        }
    }
}
