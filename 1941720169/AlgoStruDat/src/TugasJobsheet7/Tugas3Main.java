package TugasJobsheet7;

import java.util.Scanner;

public class Tugas3Main {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        int data[] = {12, 17, 2, 100, 70, 50, 90, 17, 2, 90};
        Tugas3 t = new Tugas3(data, data.length);
        t.insertionSort();
        System.out.println("Isi Array: ");
        t.tampilData();
        int posisi = t.FindBinarySearch(data[0], 0, data.length - 1);
        if (posisi != -1) {
            System.out.println("data: " + t.maks + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data: " + t.maks + " tidak ditemukan");
        }
    }
}
