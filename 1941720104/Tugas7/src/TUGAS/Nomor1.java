/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class Nomor1 {

    static Scanner daffa = new Scanner(System.in);

    public static void mergeSort(int n[], int l, int h) {
        int low = l;
        int high = h;
        if (low >= high) {
            return;
        }
        int middle = (low + high) / 2;
        mergeSort(n, low, middle);
        mergeSort(n, middle + 1, high);
        int end_low = middle;
        int start_high = middle + 1;
        while ((l <= end_low) && (start_high <= high)) {
            if (n[low] < n[start_high]) {
                low++;
            } else {
                int Temp = n[start_high];
                for (int k = start_high - 1; k >= low; k--) {
                    n[k + 1] = n[k];
                }
                n[low] = Temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }
    
    public static void main(String[] args) {
        int n[] = {20,37,14,7,67,89,23,46};
        System.out.println("Sebelum di Urutkan merge sort ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        mergeSort(n, 0, n.length - 1);
        System.out.println();
        System.out.println("Setelah di Urutkan merge sort ");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }

        System.out.println();
        int jumlah = 8;
        System.out.print("Masukkan angka: ");
        int angka = daffa.nextInt();

        int bA, bW, t;
        bA = 0;
        bW = jumlah - 1;
        t = 0;
        boolean ketemu;
        ketemu = false;

        while ((bA <= bW) && (ketemu == false)) {
            t = (bA + bW) / 2;
            if (n[t] == angka) {
                ketemu = true;
            } else if (n[t] <= angka) {
                bA = t + 1;

            } else {
                bW = t - 1;
            }
        }

        if (ketemu) {
            System.out.println("Angka: " + angka + " Data berada di indeks nomor " + t);
        } else {
            System.out.println("Angka: " + angka + " Data tidak ditemukan");
        }
    }
}