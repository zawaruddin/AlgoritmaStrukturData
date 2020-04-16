/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor3;

/**
 *
 * @author Windows 10
 */
public class Searching {
    public int[] data;
    public int jumlahData;
    int terbesar = 0;

    public Searching(int[] Data, int jmlData) {
        this.jumlahData = jmlData;
        data = new int[jmlData];
        for (int a = 0; a < jumlahData; a++) {
            data[a] = Data[a];
        }
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
    
    public int jumlahTerbesar(int cari, int data[]) {
        
        for (int a = 0; a < jumlahData; a++) {
            if (cari == data[a]) {
                terbesar++;
            }
        }
        return terbesar;
    }
    
    public void Tampilposisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("Lokasi elemen terbesar berada pada indeks " + pos);
        }
        else {
            System.out.println("Data tidak ditemukan");
        }
    }
    
    public int maks(int nilai[]) {
        int max = nilai[0];
        for (int a=0; a<10; a++) {
            if (nilai[a]>max) {
                max = nilai[a];
            }
        }
        return max;
    }
    
}
