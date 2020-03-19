/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSearching;

/**
 *
 * @author RASYED
 */
public class Searching {

    public int[] data;
    public int jumData;

    public Searching(int[] Data, int jmlData) {
        this.jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < jumData; i++) {
            if (data[i] == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void TampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int FindBinarySearch(int cari, int left, int right) {
//        int mid;
         int posisi = -1;
        for (int i = 0; i < jumData; i++) {
            if (data[i] == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void Tampilpoisisi(int cari, int posisi) {
        if (posisi != -1) {
            System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }
}
