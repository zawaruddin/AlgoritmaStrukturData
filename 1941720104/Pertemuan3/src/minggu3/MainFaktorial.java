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

public class MainFaktorial {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        System.out.println("=========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = daffa.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            fk[i].nilai = daffa.nextInt();
        }

        long start = System.nanoTime();
        System.out.println("=========================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai: " + fk[i].nilai + " adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }
        long end = System.nanoTime();
        System.out.println("\nwaktu yang diperlukan selama proses : " + ((end - start) / 1000000.0) + " milisecond");
        start = 0;
        end = 0;
        start = System.nanoTime();
        
        System.out.println("=========================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }

        System.out.println("=========================================================");
        end = System.nanoTime();
        System.out.println("\nwaktu yang diperlukan selama proses : " + ((end - start) / 1000000.0) + " milisecond");
    }
}
