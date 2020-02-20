package jobsheet2tugas;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class Lingkaranmain {
    public static void main(String[] args){
        Scanner irul = new Scanner (System.in);
        tugas1 lingkaran1 = new tugas1();
        
        System.out.println("Masukkan Jari-Jari Lingkaran : ");
        lingkaran1.r = irul.nextDouble();
        
        System.out.println("Luas : " + lingkaran1.HitungLuas());
        System.out.println("Keliling : " + lingkaran1.HitungKeliling());
    }
}
