/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSearching;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class SearchingMain {
    
    static Scanner daffa = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Masukkan banyaknya angka: ");
        int data[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int data2[] = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int cari;
        
        Searching cariData = new Searching(data, 10);
        Searching cariData2 = new Searching(data2, 10);
        
        System.out.println("Isi Array Sequential: ");
        cariData.TampilData();
        System.out.println("Isi Array Binary: ");
        cariData2.TampilData();
        System.out.print("Masukkan angka yang ingin dicari: ");
        cari = daffa.nextInt();
        int posisi = cariData.FindSeqSearch(cari);
        System.out.println("Sequential search");
        
        if(posisi != -1){
            System.out.println("Data " +cari+ " ditemukan pada indeks ke-" +posisi);
        }
        
        else{
            System.out.println("Data " +cari+ "tidak ditemukan");
        }
        
        int posisi2 = cariData2.FindSeqSearch(cari);
        System.out.println("==============================");
        System.out.println("Menggunakan binary Search");
        cariData2.TampilPosisi(cari, posisi2);
    }
}