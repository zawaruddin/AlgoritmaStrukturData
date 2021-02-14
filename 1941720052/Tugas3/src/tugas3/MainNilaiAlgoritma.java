/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class MainNilaiAlgoritma {

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int mhs = luluk.nextInt();
        NilaiAlgoritma NA[] = new NilaiAlgoritma[mhs];

        for (int a = 0; a < mhs; a++) {
            NA[a] = new NilaiAlgoritma();
            System.out.print("Masukkan nama Mahasiswa ke-" + (a + 1) + " : ");
            NA[a].namaMhs = mufida.nextLine();
            System.out.print("Masukkan nilai tugas : ");
            NA[a].nilaiTugas = luluk.nextInt();
            System.out.print("Masukkan nilai Kuis : ");
            NA[a].nilaiKuis = luluk.nextInt();
            System.out.print("Masukkan nilai UTS : ");
            NA[a].nilaiUTS = luluk.nextInt();
            System.out.print("Masukkan nilai UAS : ");
            NA[a].nilaiUAS = luluk.nextInt();
        }

        for (int a = 0; a < mhs; a++) {
            System.out.println("Nilai Mahasiswa bernama : " + NA[a].namaMhs);
            System.out.println("Nilai tugas : " + NA[a].nilaiTugas);
            System.out.println("Nilai Kuis : " + NA[a].nilaiKuis);
            System.out.println("Nilai UTS : " + NA[a].nilaiUTS);
            System.out.println("Nilai UAS : " + NA[a].nilaiUAS);
            System.out.println("Total Nilainya adalah : " + NA[a].hitungTotalNilai(NA[a].nilaiTugas, NA[a].nilaiKuis, NA[a].nilaiUTS, NA[a].nilaiUAS));
        }
        double rata =0;
        for(int a=0; a<mhs; a++){
            System.out.println("Total nilai dari "+NA[a].namaMhs+" : "+NA[a].hitungTotalNilai(NA[a].nilaiTugas, NA[a].nilaiKuis, NA[a].nilaiUTS, NA[a].nilaiUAS));
            rata += NA[a].hitungTotalNilai(NA[a].nilaiTugas, NA[a].nilaiKuis, NA[a].nilaiUTS, NA[a].nilaiUAS);
        }
        System.out.println("Nilai rata-rata seluruh Mahasiswa adalah : "+rata/(double)mhs);
    }

}
