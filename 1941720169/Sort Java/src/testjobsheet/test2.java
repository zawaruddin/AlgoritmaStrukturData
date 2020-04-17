package testjobsheet;

import java.util.*;

public class test2 {

    public static void main(String[] args) {
        test2 b = new test2();
        int data[] = {1, 3, 9, 11, 12, 15, 17, 23, 31, 35, 45};
        int x = 31;
        int hasil = search(data, x, 0, data.length - 1);
        if (hasil != -1) {
            System.out.println("Data terbesar: " + x + " ditemukan pada indeks " + hasil);
        } else {
            System.out.println("Data: tidak ditemukan");
        }
    }

    static int search(int b[], int cari, int l, int r) {
        //bubble(b);
        int i=0, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (cari == b[mid]) {
                return mid;
            } else if (cari < b[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            System.out.println(i);
            i++;
        }
        
        return -1;
    }
    static void bubble(int arr[]) {
        int n = arr.length;
        int k;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - 1; j++) {
                k = j + 1;
                if (arr[j] > arr[k]) {
                    swap(j, k, arr);
                }
            }
        }
    }

    static void swap(int i, int j, int[] arr) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
