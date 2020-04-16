/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;

/**
 *
 * @author Windows 10
 */
public class Searching {

    public int[] data;
    public int jumlahData;

    public Searching(int[] Data, int jmlData) {
        this.jumlahData = jmlData;
        data = new int[jmlData];
        for (int a = 0; a < jumlahData; a++) {
            data[a] = Data[a];
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int b = 0; b < jumlahData; b++) {
            if (data[b] == cari) {
                posisi = b;
                break;
            }
        }
        return posisi;
    }

    public void TampilData() {
        for (int a = 0; a < jumlahData; a++) {
            System.out.print(data[a] + " ");
        }
        System.out.println();
    }
    
    public int FindBinarySearch(int cari, int data[], int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return FindBinarySearch(cari, data, left, mid - 1);
            } else {
                return FindBinarySearch(cari, data, mid + 1, right);
            }
        }
        return -1;
    }
    
    public void Tampilposisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        }
        else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}

    

