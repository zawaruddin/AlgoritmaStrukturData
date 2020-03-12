package quiz;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class kuis1 {                                            
    public static void main(String[] args) {
        char[] nama = { 'M', 'U', 'H', 'A', 'M', 'M', 'A', 'D', 'K', 'H', 'O', 'I', 'R', 'U', 'L','W','A','H','Y','U','D','I','N'};     //O(1)
        int hitungHuruf = 1;                                                                                                            //
        int panjangNama = nama.length;                                                                                                  //

        System.out.println("\nInput : MUHAMMAD KHOIRUL WAHYUDIN");

        System.out.println();
        Arrays.sort(nama);
        System.out.println("\nOutput : ");

        for (int i = 0; i < panjangNama; i++) {                                                                                          //O(log n)
            for (int j = 0; j < panjangNama; j++) {                                                                                        //O(log n)
                if (nama[i] != ' ') {                                                                                                    
                    if (i != j && nama[i] == nama[j]) {                                                                                //
                        hitungHuruf++;                                                                                                  //O(1)
                        nama[j] = ' ';                                                                                              //
                    }
                    if (j == panjangNama - 1) {                                                                                           
                        System.out.println("Jumlah Huruf " + nama[i] + " = " + hitungHuruf);
                        hitungHuruf = 1;                                                                                                   // O(1)
                    }
                }
            }
        }
    }
}