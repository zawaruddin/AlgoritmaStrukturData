/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsearching;

/**
 *
 * @author Windows 10
 */
//modifikasi class main
import java.util.Scanner;
public class SearchingMain {
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = luluk.nextInt();
        int data[] = new int[elemen] ;
        
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan data pada indeks ke-"+i+" : ");
            data[i] = luluk.nextInt();
        }
        
        Searching pencarian = new Searching(data, elemen);
        System.out.println("isi Array : ");
        pencarian.TampilData();
        System.out.println("Masukkan data yang akan dicari: ");
        int cari = luluk.nextInt(); 
        System.out.println("Menggunakan sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        
//        if(posisi != -1){
//            System.out.println("data : "+cari+" ditemukan pada indeks "+posisi);
//        }else{
//            System.out.println("data : "+cari+"tidak ditemukan");
//        }
        pencarian.TampilPosisi(cari, posisi);
        System.out.println("====================================");
        System.out.println("Menggunakan Binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.TampilPosisi(cari, posisi);
    }
    
}
