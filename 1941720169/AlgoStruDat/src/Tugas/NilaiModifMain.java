package Tugas;

import java.util.Scanner;

public class NilaiModifMain {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner (System.in);
        Scanner arbi = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jml = dhimas.nextInt();
        NilaiModif[] na = new NilaiModif[jml];
        
        for(int i =0;i<jml;i++){
            na[i] = new NilaiModif();
            System.out.println("=================================================");
            System.out.print("Masukkan nama mahasiswa ke-"+(i+1)+" : ");
            na[i].namaMhs = arbi.nextLine();
            System.out.print("Masukkan nilai tugas dari "+na[i].namaMhs+": ");
            na[i].nilaiTugas = dhimas.nextInt();
            System.out.print("Masukkan nilai kuis dari "+na[i].namaMhs+": ");
            na[i].nilaiKuis = dhimas.nextInt();
            System.out.print("Masukkan nilai UTS dari "+na[i].namaMhs+": ");
            na[i].nilaiUTS = dhimas.nextInt();
            System.out.print("Masukkan nilai UAS dari "+na[i].namaMhs+": ");
            na[i].nilaiUAS = dhimas.nextInt();
            System.out.println("=================================================");
        }
        for(int i=0;i<jml;i++){
            System.out.printf("Nilai mahasiswa "+na[i].namaMhs+" adalah %.2f\n",na[i].HitungTotalNilaiDC(jml));
        }
    }
}
