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

public class Nomor3 {

    static Scanner daffa = new Scanner(System.in);

    public int data[], jmlData, max, hitung, posisi[];

    Nomor3(int d[], int n) {
        this.jmlData = n;
        data = d;
    }

    void insertionSort() {
        int i, j;
        for (i = 1; i < jmlData; i++) {
            int temp;
            temp = data[i];
            j = i;
            while ((j > 0) && (data[j - 1] > temp)) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }

    public void tampilData() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            max = cari;
            if (data[mid] == cari) {
                jumlahTerbesar(data[mid]);
                return (mid);
            } else if (data[mid - 1] > data[mid]) {
                return FindBinarySearch(data[mid - 1], left, mid - 1);
            } else {
                return FindBinarySearch(data[mid], mid + 1, right);
            }
        }
        return -1;
    }

    public void tampilPosisi(int cari) {
        posisi = new int[hitung];
        int j = 0;
        for (int i = 0; i < jmlData; i++) {
            if (cari == data[i]) {
                posisi[j] = i;
                j++;
            }
        }
        System.out.println("Data terbesar ditemukan sebanyak " + hitung);
        if (hitung > 1) {
            for (int i = 0; i < posisi.length; i++) {
                if (posisi[i] != -1) {
                    System.out.println("Data terbesar: " + max + " ditemukan pada indeks " + posisi[i]);
                } else {
                    System.out.println("Data: tidak ditemukan");
                }
            }
        } else {
            if (posisi[0] != -1) {
                System.out.println("Data terbesar: " + max + " ditemukan pada indeks " + posisi[0]);
            } else {
                System.out.println("Data: tidak ditemukan");
            }
        }
    }

    public void jumlahTerbesar(int cari) {
        for (int i = 0; i < jmlData; i++) {
            if (cari == data[i]) {
                hitung++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Nomor3 t = new Nomor3(data, data.length);
        int posisi;
        System.out.println("Isi Array sebelum sort: ");
        t.tampilData();
        t.insertionSort();
        System.out.println("Isi Array setelah sort: ");
        t.tampilData();
        posisi = t.FindBinarySearch(data[0], 0, t.data.length - 1);
        t.tampilPosisi(data[posisi]);
    }
}
