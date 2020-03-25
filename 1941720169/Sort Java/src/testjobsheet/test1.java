/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjobsheet;

/**
 *
 * @author Windows
 */
public class test1 {
    static int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
    static int jmlData = data.length, maks, count;
    public static void main(String[] args) {
        
        int posisi[] = new int[1];
        System.out.println("Isi Array sebelum sort: ");
        tampilData();
        insertionSort();
        System.out.println("Isi Array setelah sort: ");
        tampilData();
        posisi[0] = FindBinarySearch(data[0], 0, data.length - 1);
        System.out.println("Data terbesar ditemukan sebanyak " + count);
        if (count > 1) {
            posisi = new int[count];
            count = 0;
            for (int i = 0; i < posisi.length; i++) {
                posisi[i] = FindBinarySearch(data[0], 0, data.length-(i+1));
                if (posisi[i] != -1) {
                    System.out.println("Data terbesar: " + maks + " ditemukan pada indeks " + posisi[i]);
                } else {
                    System.out.println("Data: " + maks + " tidak ditemukan");
                }
            }
        }
    }
    static int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            maks = cari;
            if (data[mid] == cari) {
                count++;
                if(data[mid-1]==cari){
                    count++;
                }
                return (mid);
            } else if (data[mid-1] > data[mid]) {
                return FindBinarySearch(data[mid-1], left, mid - 1);
            } else {
                return FindBinarySearch(data[mid], mid + 1, right);
            }
        }
        return -1;
    }
    static void insertionSort() {
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

    static void tampilData() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}
