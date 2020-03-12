/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class NilaiAlgoritma2 {
     public String namaMhs;
    public int nilaiTugas,nilaiKuis,nilaiUTS,nilaiUAS;

    public double hitungTotalNilai(int a,int b,int c,int d){
        double total=(a*0.3)+(b*0.2)+(c*0.2)+(d*0.3);
        return total;  
    }
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa = ");
        int jumlah=arif.nextInt();
        NilaiAlgoritma2[] Na=new NilaiAlgoritma2[jumlah];
        for(int i=0;i<jumlah;i++){
        Na[i]=new NilaiAlgoritma2();
        System.out.println("==========MENGHITUNG NILAI AKHIR===========");
        System.out.println("Mahasiswa ke-"+(1+i));
        Na[i].namaMhs=arif.nextLine();
        System.out.print("Nama Mahasiswa \t= ");
        Na[i].namaMhs=arif.nextLine();
        System.out.print("Masukkan nilai Tugas \t= " );
        Na[i].nilaiTugas=arif.nextInt();
        System.out.print("Masukkan nilai Kuis \t= ");
        Na[i].nilaiKuis=arif.nextInt();
        System.out.print("Masukkan nilai UTS \t= " );
        Na[i].nilaiUTS=arif.nextInt();
        System.out.print("Masukkan nilai UAS \t= " );
        Na[i].nilaiUAS=arif.nextInt();
        System.out.println("===========================================");
        }
        for(int i=0;i<jumlah;i++){
            System.out.println("");
            System.out.println("==================================");
            System.out.println("Nama Mahasiswa ke-"+(1+i)+" "+Na[i].namaMhs);
            System.out.println("Nilai Tugas \t= "+String.format("%.1f",0.3*Na[i].nilaiTugas));
            System.out.println("Nilai Kuis \t= "+String.format("%.1f",0.2*Na[i].nilaiKuis));
            System.out.println("Nilai UTS \t= "+String.format("%.1f",0.2*Na[i].nilaiUTS));
            System.out.println("Nilai UAS \t= "+String.format("%.1f",0.3*Na[i].nilaiUAS));
            System.out.println("==================================");
        System.out.println("Nilai akhir Adalah "+String.format("%.2f",Na[i].hitungTotalNilai(Na[i].nilaiTugas, 
                Na[i].nilaiKuis, Na[i].nilaiUTS, Na[i].nilaiUAS)));
        }
    }
}