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
public class NilaiAlgoritma3 {
      public String namaMhs;
    public int nilaiTugas,nilaiKuis,nilaiUTS,nilaiUAS;

    public double hitungTotalNilai(int a,int b,int c,int d){
        double total=(a*0.3)+(b*0.2)+(c*0.2)+(d*0.3);
        return total;  
    }
    public double RatanilaiBF(int a,int b,int c,int d,int e){
        double rata = 0;
        for(int i=0;i<e;i++){
           rata=hitungTotalNilai(a,b,c,d)/e;
        }
        return rata;
    }
    public static double RatanilaiDC(double a,int b){
       return a/b;
    }
    public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        double rataRata = 0,rataRata2=0;
        System.out.print("Masukkan jumlah mahasiswa = ");
        int jumlah=arif.nextInt();
        NilaiAlgoritma3[] Na=new NilaiAlgoritma3[jumlah];
        for(int i=0;i<jumlah;i++){
        Na[i]=new NilaiAlgoritma3();
        System.out.println("================NILAI AKHIR================");
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
          System.out.println("\nMenghitung rata-rata dengan Brute Force");
        for(int i=0;i<jumlah;i++){
            System.out.println("-------------------------------------------------");
            System.out.println("Nama mahasiswa\t"+Na[i].namaMhs+"\tNilai total "+String.format("%.2f",Na[i].hitungTotalNilai
            (Na[i].nilaiTugas, Na[i].nilaiKuis, Na[i].nilaiUTS, Na[i].nilaiUAS)));
            rataRata=rataRata+Na[i].RatanilaiBF(Na[i].nilaiTugas,
                    Na[i].nilaiKuis, Na[i].nilaiUTS, Na[i].nilaiUAS,jumlah);
            System.out.println("-------------------------------------------------");
        }
        System.out.println("Rata-rata nilai "+String.format("%.2f",rataRata));
        
        System.out.println("\nMenghitung rata-rata dengan Devide and Conquer");
        for(int i=0;i<jumlah;i++){
            System.out.println("-------------------------------------------------");
            System.out.println("Nama mahasiswa\t"+Na[i].namaMhs+"\tNilai total "+String.format("%.2f",Na[i].hitungTotalNilai
            (Na[i].nilaiTugas, Na[i].nilaiKuis, Na[i].nilaiUTS, Na[i].nilaiUAS)));
            rataRata2=rataRata2+Na[i].hitungTotalNilai(Na[i].nilaiTugas,
                    Na[i].nilaiKuis, Na[i].nilaiUTS, Na[i].nilaiUAS);
            System.out.println("-------------------------------------------------");
        }
        System.out.println("Rata-rata nilai "+String.format("%.2f", RatanilaiDC(rataRata2,Na.length)));
    }
}