package UTSsmt2;

import java.util.Arrays;

public class Pencarian {

    public char data[];
    public int size, count, posisi[] = new int[1];

    public Pencarian(char data[], int jmldata) {
        size = jmldata;
        this.data = new char[size];
        for (int i = 0; i < size; i++) {
            this.data[i] = data[i];
        }
    }

//------------------------------------------------------------------------------    
    public void tukar(char cari, int posisi) {
        for (int i = 0; i < size; i++) {
            if (i == posisi) {
                char temp = data[size - 1];
                data[size - 1] = data[i];
                data[i] = temp;
                size--;
                break;
            }
        }
    }

    public void jumlahHuruf(char cari) {
        for (int i = 0; i < size; i++) {
            if (cari == data[i]) {
                count++;
            }
        }
        posisi = new int[count];
    }

//------------------------------------------------------------------------------    
    public int[] FindSeqSearch(char cari) {
        jumlahHuruf(cari);
        posisi = new int[count];
        int k = 0;
        for (int j = 0; j < size; j++) {
            if (data[j] == cari) {
                posisi[k] = j;
                k++;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(char cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == data[mid]) {
                return (mid);
            } else if (data[mid] > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

//------------------------------------------------------------------------------    
    public void mergeSort() {
        System.out.println("\nHasil Pengurutan data dengan Merge Sort:");
        sort(data, 0, data.length - 1);
    }

    private void merge(char Data[], int left, int middle, int right) {
        char temp[] = new char[Data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = Data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] < temp[b]) {
                Data[c] = temp[a];
                a++;
            } else {
                Data[c] = temp[b];
                b++;
            }
            c++;
        }
        while (a <= middle) {
            Data[c] = temp[a];
            c++;
            a++;
        }
    }

    private void sort(char Data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(Data, left, middle);
            sort(Data, middle + 1, right);
            merge(Data, left, middle, right);
        }
    }

//------------------------------------------------------------------------------
    public void tampilPosisi(char cari, int metode) {
        String method[] = {"Sequential", "Binary"};
        if (metode == 1) {
            FindSeqSearch(cari);
        }
        System.out.println("\nHasil Pencarian dengan " + method[metode - 1]
                + " Search");
        if (count > 1) {
            if (posisi[0] != -1) {
                System.out.print("Huruf " + cari + " ditemukan pada indeks ke-");
                for (int i = 0; i < posisi.length; i++) {
                    System.out.print(posisi[i]);
                    if (i < posisi.length - 1) {
                        System.out.print(", ");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            } else {
                System.out.println("Data: tidak ditemukan");
            }
        } else {
            if (posisi[0] != -1) {
                System.out.println("Huruf " + cari + " ditemukan pada indeks ke-" + posisi[0]);
            } else {
                System.out.println("Data: tidak ditemukan");
            }
        }
    }

    public void tampilData() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) {
                System.out.print(", ");
            } else {
                System.out.print("}\n");
            }
        }
    }
}
//------------------------------------------------------------------------------
