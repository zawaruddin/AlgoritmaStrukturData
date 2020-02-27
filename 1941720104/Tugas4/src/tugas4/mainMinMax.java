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
import static tugas4.minMax.max_min;

public class mainMinMax {

    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];
 
        Scanner daffa = new Scanner(System.in);

        for (int a = 0; a < 5; a++) {
            ppArray[a] = new minMax();
            System.out.println("Nilai array indeks ke-" + a);
            System.out.print("Masukkan nilai: ");
            ppArray[a].nilaiArray = daffa.nextInt();
        }

        int min = ppArray[0].nilaiArray;
        int max = ppArray[0].nilaiArray;

        System.out.println("Brute Force");
        System.out.println("Nilai Minimal: " + min);
        System.out.println("Nilai Maksimal: " + max);

        int arr[] = new int[5];
        for (int d = 0; d < 5; d++) {
            arr[d] = ppArray[d].nilaiArray;
        }
        maxMin hasil = new maxMin();
        max_min(arr, 0, 4, hasil);

        System.out.println("Divide Conquer");
        System.out.println("Nilai minimal: " + hasil.minimum + "\nNilai Maksimal: " + hasil.maximum);
        System.out.print("\n");
    }
}