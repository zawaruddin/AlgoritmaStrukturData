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
public class SearchingMain {
    public static void main(String[] args) {
        int data[] = {100,90,80,70,60,50,40,30};
        
        Searching pencarian = new Searching(data, 8);
        System.out.println("isi Array : ");
        pencarian.TampilData();
        
        int cari = 30;
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
