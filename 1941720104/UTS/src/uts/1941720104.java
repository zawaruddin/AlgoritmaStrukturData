/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class UTS {

    static Scanner daffa = new Scanner(System.in);

    static char nama[] = {'d', 'a', 'f', 'f', 'a',
        'c', 'a', 'h', 'y', 'o',
        'a', 'l', 'g', 'h', 'i', 'f', 'a', 'r', 'i'};

    static char sequential[] = {'d', 'a', 'f', 'f', 'a',
        'c', 'a', 'h', 'y', 'o',
        'a', 'l', 'g', 'h', 'i', 'f', 'a', 'r', 'i'};

//Mohon maaf jika ada kekurangan, sesungguhnya saya sudah berusaha sekuat mungkin dalam UTS ini, terima kasih ....
    public static void main(String[] args) {
        System.out.println("====================System Start====================");
        System.out.println("********************UTS Semester********************");
        System.out.println("NIM   : 1941720104");
        System.out.println("Nama  : Daffa Cahyo Alghifari");
        for (char i = 0; i < nama.length; i++) {
            System.out.print("'");
            System.out.print(nama[i] + "', ");
        }
        System.out.println();
        System.out.println();
        System.out.print("Pilihan metode pencarian \n1. Sequential search\n2. Binary search");
        System.out.print("\nPilih metode   : ");
        int metode = daffa.nextInt();
        System.out.print("Masukkan huruf : ");
        char huruf = daffa.next().charAt(0);

//      Di bawah ini adalah program insertion sort
        for (char i = 0; i < nama.length; i++) {
            char min = nama[i];
            char j = i;
            while ((j > 0) && (min < nama[j - 1])) {
                nama[j] = nama[j - 1];
                j--;
            }
            nama[j] = min;
        }
        System.out.println("Hasil merge sort");
        for (char h = 0; h < nama.length; h++) {
            System.out.print("'");
            System.out.print(nama[h] + "', ");
        }
        System.out.println();

//      Sequential search
        if (metode == 1) {
            char Data[] = new char[sequential.length];
            System.out.println("Sort khusus sequential!");
            for (char b = 0; b < sequential.length; b++) {
                System.out.print("'");
                System.out.print(sequential[b] + "', ");
            }
            System.out.println();

            char key = huruf;
            boolean temukan = false;
            for (int i = 0; i < sequential.length; i++) {
                if (key == sequential[i]) {
                    temukan = true;
                    break;
                }
            }
            if (temukan) {
                System.out.println("Hasil sequential search");
                System.out.println("Data : " + key);
                System.out.println("Ada");
            } else {
                System.out.println("Hasil sequential search");
                System.out.println("Tidak Ada");
            }

//      Binary search
        } else if (metode == 2) {
            int N = 19;
            int BatasAtas, BatasBawah, Tengah;
            char cari = huruf;
            BatasAtas = 0;
            BatasBawah = N - 1;
            Tengah = 0;
            boolean ketemu;
            ketemu = false;

            while ((BatasAtas <= BatasBawah) && (ketemu == false)) {

                Tengah = (BatasAtas + BatasBawah) / 2;
                if (nama[Tengah] == cari) {
                    ketemu = true;
                } else if (nama[Tengah] <= cari) {
                    BatasAtas = Tengah + 1;
                } else {
                    BatasBawah = Tengah - 1;
                }
            }

            if (ketemu) {
                System.out.println("Huruf : " + cari + " Data berada di index nomor " + Tengah);
            } else {
                System.out.println("Huruf : " + cari + " Data tidak ditemukan");
            }

        } else {
            System.out.println("Jawaban Anda salah!");
        }
        System.out.println();
        System.out.println("====================System End====================");
    }
}