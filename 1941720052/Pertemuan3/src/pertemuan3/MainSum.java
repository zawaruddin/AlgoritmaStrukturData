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
        System.out.print("Masukkan jumlah bulan : ");
        int elemen = luluk.nextInt();
        
        Sum sm = new Sum(elemen);
        System.out.println("==============================================");
        for(int a=0; a<sm.elemen; a++){
            System.out.print("Masukkan untung bulan ke-"+(a+1)+" = ");
            sm.keuntungan[a] = luluk.nextDouble();
        }
        System.out.println("==============================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+ " bulan adalah = "+ sm.totalBF(sm.keuntungan));
        System.out.println("==============================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
    
}
