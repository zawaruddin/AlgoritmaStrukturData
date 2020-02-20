package mingguke3;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class MainSum {
    public static void main(String[] args){
        Scanner whyd = new Scanner (System.in);
        System.out.println("=======================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta Misal 5.9)");
        System.out.println("Masukkan Jumlah bulan : ");
        int elm = whyd.nextInt();
        
        Sum sm = new Sum(elm);
        System.out.println("========================================");
        for (int i = 0; i<sm.elemen; i++){
            System.out.println("Masukkan untung bulan ke -"+(i+1)+" = ");
            sm.keuntungan[i] = whyd.nextDouble();
        }
        System.out.println("==========================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen + "bulan adalah = "+ sm.totalBF(sm.keuntungan));
        System.out.println("==============================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen + "bulan adalah = "+ sm.totalDC(sm.keuntungan, 0,sm.elemen-1));
    }
}