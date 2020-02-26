package Tugas;

import java.util.Scanner;

public class PemilihanSuaraMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner (System.in);
        System.out.print("Masukkan jumlah kandidat: ");
        int jml = dhimas.nextInt();
        System.out.print("Masukkan jumlah pemilih: ");
        int jmlPemilih = dhimas.nextInt();
//        PemilihanSuara[] ps = new PemilihanSuara[jml];
        PemilihanSuara ps = new PemilihanSuara(jml,jmlPemilih);
//        for (int i = 0; i < jml; i++) {
//            ps[i] = new PemilihanSuara();
//            System.out.print("Masukkan nama kandidat-" + (i + 1));
//            ps[i].nama = arbi.nextLine();
//            System.out.print("Masukkan jumlah suara kandidat " + (i + 1));
//            ps[i].suara = dhimas.nextInt();
//        }
//        for (int i = 0; i < jml; i++) {
//            System.out.println(ps[i].nama + " "+ ps[i].suara);
//            System.out.println("Perhitungan total suara kandidat " + ps[i].nama + " : " + ps[i].hitungPemilihan(ps[i].suara, 0, jml - 1));
//        }
        for (int i = 0; i < jml; i++) {
            //ps[i] = new PemilihanSuara();
            System.out.print("Masukkan nama kandidat-" + (i + 1)+": ");
            ps.nama[i] = arbi.nextLine();
            ps.noUrut[i] = (i+1);
            System.out.println(ps.noUrut[i]);
        }
        for(int i=0;i<jmlPemilih;i++){
            System.out.print("Masukkan pilihan (1-"+jml+"): ");
            ps.suara[i] = dhimas.nextInt();
        }
        for (int i = 0; i < jml; i++) {
            System.out.println(ps.suara[i]);
            System.out.println("Perhitungan total suara kandidat " + ps.nama[i] + " : " + ps.hitungPemilihan(ps.suara, 0, ps.jmlKandidat-1, jmlPemilih));
        }
    }
}
