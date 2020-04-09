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
        int data[] = {20,37,14,7,67,89,23,46};
        int data2[] = {37, 20, 14,7,67,89,23,46};
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