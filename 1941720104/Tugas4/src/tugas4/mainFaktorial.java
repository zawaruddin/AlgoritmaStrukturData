/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class mainFaktorial {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        long start, end;
        System.out.println("Masukkan jumlah elemen: ");
        int elemen = daffa.nextInt();
        Faktorial[] fktrl = new Faktorial[elemen];
        for(int i = 0; i < elemen; i++){
            fktrl[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            fktrl[i].nilai = daffa.nextInt();
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("Hasil Faktorial dengan Brute Force");
        start = System.nanoTime();
        for(int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai-" +fktrl[i].nilai+ " adalah: " +fktrl[i].faktorialBF(fktrl[i].nilai));
        }
        end = System.nanoTime();
        
        System.out.println("Habisnya waktu atas jalannya program FaktorialBF sebanyak: " +(end - start) / 1000000 + " millisecond");
        System.out.println("--------------------------------------------");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
    
        start = System.nanoTime();  
        for(int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai: " +fktrl[i].nilai+ " adalah: " +fktrl[i].faktorialDC(fktrl[i].nilai));
        }
        end = System.nanoTime();
        System.out.println("Habisnya waktu atas jalannya program faktorialDC sebanyak: " +(end - start) / 1000000 + " millisecond");
    }
}
//Jumlah Operasi: 1 + 1 + 1 + 1 + 1 (n * 1 * 1 * 1) + 1 + 1 + 1 + (n * 1) + 1 + 1 + 1 + 1 + 1 + (n * 1) + 1 + 1
//              : 5 + n + 3 + n + 5 + n + 2
//              : 15 + 3n Operasi
//Notasi BigO   : O(n) + O(n) + O(n)
//              : 3 * O(n)