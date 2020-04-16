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
import java.util.Locale;
import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("==============================================");
        System.out.println("Program menghitung keuntungan total (Satuan juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int elemen = luluk.nextInt();

        for (int a = 0; a < elemen; a++) {
            System.out.println("==========================================");
            System.out.println("Mengitung perusahaan ke-" + (a + 1));
            System.out.print("Masukkan jumlah bulan: ");
            int bulan = luluk.nextInt();

            Sum sm = new Sum(bulan);
            System.out.println("==============================================");
            for (int b = 0; b < sm.elemen; b++) {
                System.out.print("Masukkan untung bulan ke-" + (a + 1) + " = ");
                sm.keuntungan[b] = luluk.nextDouble();
            }
            System.out.println("==============================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
            System.out.println("==============================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        }

    }

}
