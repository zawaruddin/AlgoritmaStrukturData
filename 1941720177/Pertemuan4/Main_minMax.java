/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author RASYED
 */
import static Praktikum.minMax.max_min;
import java.util.Scanner;

public class Main_minMax {

    public int maximum;
    public int minimum;

    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];
        ppArray[0] = new minMax();

        Scanner rasyed = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.println("Nilai array indeks ke- " + i);
            System.out.print("Masukkan nilai: ");
            ppArray[i].nilaiArray = rasyed.nextInt();

        }

        int min = ppArray[0].nilaiArray;
        int max = ppArray[0].nilaiArray;
        for (int i = 0; i < 5; i++) {
            if (ppArray[i].nilaiArray < min) {
                min = ppArray[i].nilaiArray;
            } else if (ppArray[i].nilaiArray > max) {
                max = ppArray[i].nilaiArray;
            }

        }
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maksimal : " + max);

        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = ppArray[i].nilaiArray;
        }
        Main_minMax hasil = new Main_minMax();

        max_min(arr, 0, 4, hasil);

        System.out.println("Divide Conquer");
        System.out.println("Nilai Minimal: " + hasil.minimum + "\nNilai Maksimaly: " + hasil.maximum);
        System.out.println("\n");
    }
}
