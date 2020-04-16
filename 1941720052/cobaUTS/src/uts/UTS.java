/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Windows 10
 */
public class UTS {
public char[] data;
    public int[] huruf;
    public int jumlah;
    public int banyak = 0;

    public UTS(char[] Data, int Jumlah) {
        jumlah = Jumlah;
        data = new char[Jumlah];
        huruf = new int[Jumlah];
        for (int i = 0; i < jumlah; i++) {
            data[i] = Data[i];
        }
    }

    public int Sequential(char cari) {
        int posisi = -1, j = 0;
        for (int i = 0; i < jumlah; i++) {
            if (data[i] == cari) {
                huruf[j] = i;
                j++;
            } else if (data[i] != cari) {
                posisi = -1;
            }
        }
        if (j != 0) {
            return j;
        } else {
            return posisi;
        }
    }

    public void PrintPos(char x, int j) {
        if (j >= 0) {
            System.out.print(">> Huruf '" + x + "' ditemukan pada indeks ke ");
            for (int i = 0; i < j; i++) {
                System.out.print(huruf[i] + ", ");
            }
        } else if (j == -1) {
            System.out.println(">> Huruf '" + x + "' tidak ditemukan");
        }
    }

    void merge(char data[], int le, int mid, int ri) {
        char[] temp = new char[data.length];
        for (int i = le; i <= ri; i++) {
            temp[i] = data[i];
        }
        int a = le;
        int b = mid + 1;
        int c = le;

        while (a <= mid && b <= ri) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int d = mid - a;
        for (int i = 0; i <= d; i++) {
            data[c + i] = temp[a + i];
        }
    }

    void sort(char data[], int le, int ri) {
        if (le < ri) {
            int mid = (le + ri) / 2;
            sort(data, le, mid);
            sort(data, mid + 1, ri);
            merge(data, le, mid, ri);
        }
    }

    public void mergeSort(char[] data) {
        sort(data, 0, data.length - 1);
    }

    public int jumlah(char cari) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == cari) {
                banyak++;
            }
        }
        return banyak;
    }

    public int Binary(char cari, int le, int ri) {
        int mid;
        if (ri >= le) {
            mid = (le + ri) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return Binary(cari, le, mid - 1);
            } else {
                return Binary(cari, mid + 1, ri);// yopo iki au di copas ednine binguung aku, mosok kabeh?, au tolong jawaben
            }
        }
        return -1;
    }

    public void PosisiBinary(char data[], char cari) {
        int k, j = 0;
        for (int i = 0; i < jumlah; i++) {
            if (data[i] == cari) {
                huruf[j] = i;
                j++;
            } else if (data[i] != cari) {
                k = -1;
            }
        }
    }

    public void PrintArray(char x, int j) {
        if (banyak > 0) {
            System.out.print(">> Huruf '" + x + "' ditemukan pada indeks ke ");
            for (int i = 0; i < banyak; i++) {
                System.out.print(huruf[i] + ", ");
            }
        } else if (banyak <= 0) {
            System.out.println(">> Huruf '" + x + "' tidak ditemukan");
        }
    }
}
