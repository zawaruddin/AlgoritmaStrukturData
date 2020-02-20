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

public class MainSum {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan: ");
        int elm = daffa.nextInt();

        for (int a = 0; a < elm; a++) {
            System.out.println("=====================================================");
            System.out.println("Menghitung perusahaan ke-" + (a+1));
            System.out.print("Masukkan jumlah bulan: ");
            int bulan = daffa.nextInt();

            Sum sm = new Sum(elm);
            System.out.println("=====================================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukkan untung bulan ke-" + (i + 1) + ": ");
                sm.keuntungan[i] = daffa.nextDouble();
            }

            System.out.println("=====================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah: " + sm.totalBF(sm.keuntungan));
            System.out.println("=====================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah: " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        }
    }
}
