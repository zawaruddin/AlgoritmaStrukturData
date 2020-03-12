/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasminggu3;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class nilaiAlgoritma {

    static Scanner daffa = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===============SYSTEM ON===============");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlh = daffa.nextInt();
        nilaiObject[] mhs = new nilaiObject[jmlh];
        int a = mhs.length;

        for (int b = 0; b < a; b++) {
            mhs[b] = new nilaiObject();
            System.out.print("Masukkan nama mahasiswa   : ");
            mhs[b].setnamaMhs(daffa.next());
            System.out.print("Masukkan nilai tugas      : ");
            mhs[b].setNilaiTugas(daffa.nextInt());
            System.out.print("Masukkan nilai quiz       : ");
            mhs[b].setNilaiQuiz(daffa.nextInt());
            System.out.print("Masukkan nilai UTS        : ");
            mhs[b].setNilaiUTS(daffa.nextInt());
            System.out.print("Masukkan nilai QUIZ       : ");
            mhs[b].setNilaiUAS(daffa.nextInt());
        }

        for (int c = 0; c < a; c++) {
            System.out.println("Nilai total " + mhs[c].getnamaMhs() + " sebesar: " + mhs[c].getNilaiTotal());
        }

        double total = 0;

        for (int d = 0; d < mhs.length; d++) {
            total += mhs[d].getNilaiTotal();
        }

        total /= mhs.length;

        System.out.println("Rata-rata: " + total);
        System.out.println("===============SYSTEM OFF===============");
    }
}
