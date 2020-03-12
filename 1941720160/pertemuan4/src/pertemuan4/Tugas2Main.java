package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class Tugas2Main {
    public static void main(String[] args) {
        Scanner irul = new Scanner(System.in);
        Tugas2 tg2 = new Tugas2();
        System.out.print("Masukkan angka: ");
        tg2.angka = irul.nextInt();
        
        tg2.hitungFiboBF();
        System.out.println("");
        System.out.println("Program Menghitung Deret Fibonacci : ");
        for (int i = 0; i < tg2.angka; i++) {
            System.out.print(tg2.hitungFiboDC(i)+" ");
        }
    }
}
