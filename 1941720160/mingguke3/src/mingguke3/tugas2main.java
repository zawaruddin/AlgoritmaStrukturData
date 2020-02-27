package mingguke3;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class tugas2main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner angka = new Scanner(System.in);
        int elemen;

        System.out.print("Masukkan jumlah elemen yang akan diinput : ");
        elemen = angka.nextInt();
        tugas2 na = new tugas2();
        tugas2[] main = new tugas2[elemen];

        for (int i = 0; i < elemen; i++) {
            main[i] = new tugas2();
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + " : ");
            main[i].namaMhs = sc.nextLine();
            System.out.print("Masukkan Nilai Tugas Mahasiswa \t: ");
            main[i].nilaiTugas = angka.nextInt();
            System.out.print("Masukkan Nilai Kuis Mahasiswa \t: ");
            main[i].nilaiKuis = angka.nextInt();
            System.out.print("Masukkan Nilai UTS Mahasiswa \t: ");
            main[i].nilaiUTS = angka.nextInt();
            System.out.print("Masukkan Nilai UAS Mahasiswa \t: ");
            main[i].nilaiUAS = angka.nextInt();
        }

        for (int i = 0; i < elemen; i++) {
            System.out.println("==============================================================");
            System.out.println("Mahasiswa dengan Nama \t: " + main[i].namaMhs);
            System.out.println("Memiliki Nilai Total  \t: " + main[i].hitungTotal());
        }

    }// main
}// class

