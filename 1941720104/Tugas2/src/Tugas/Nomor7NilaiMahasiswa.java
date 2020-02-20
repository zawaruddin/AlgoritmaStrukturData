/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class Nomor7NilaiMahasiswa {

    public static void main(String[] args) {
        int mahasiswa = mahasiswa();
        nilai(mahasiswa);
    }

    static Scanner daffa = new Scanner(System.in);

    public static int mahasiswa() {
        System.out.print("Jumlah mahasiswa: ");
        int mahasiswa = daffa.nextInt();
        return mahasiswa;
    }

    public static int nilai(int mahasiswa) {
        for (int a = 0; a < mahasiswa; a++) {
            System.out.println("Mahasiswa ke-" + (a + 1));
            System.out.print("Nilai 1: ");
            int nilai1 = daffa.nextInt();
            System.out.print("Nilai 2: ");
            int nilai2 = daffa.nextInt();
            System.out.print("Nilai terbaik Mhs ke-" + (a + 1) + ": ");
            if (nilai1 > nilai2) {
                System.out.print(nilai1);
            } else {
                System.out.print(nilai2);
            }
            System.out.println();
            System.out.println("===============");
        }
        return mahasiswa;
    }
}
