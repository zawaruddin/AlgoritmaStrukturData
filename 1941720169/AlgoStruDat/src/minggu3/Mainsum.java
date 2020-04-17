package minggu3;

import java.util.Locale;
import java.util.Scanner;

public class Mainsum {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("=====================================================");
        System.out.println("Program menghitung Keuntungan Total (Satuan juta, misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan: ");
        int prshn = dhimas.nextInt();
        for (int a = 0; a < prshn; a++) {
            System.out.println("======================================================");
            System.out.println("Perusahaan ke-"+(a+1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = dhimas.nextInt();

            sum sm = new sum(elm);
            System.out.println("=====================================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
                sm.keutungan[i] = dhimas.nextDouble();
            }
            System.out.println("=====================================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah %.2f\n", sm.totalBF(sm.keutungan));
            System.out.println("=====================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalDC(sm.keutungan, 0, sm.elemen - 1));
            System.out.println("======================================================\n\n");
        }
    }
}
