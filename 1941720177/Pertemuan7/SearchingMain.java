/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSearching;

/**
 *
 * @author RASYED
 */
import java.util.Scanner;
public class SearchingMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Data : ");
        int dat = sc.nextInt();
        int data [] = new int[dat];
        
        for (int i = 0; i < dat; i++) {
            System.out.print("Masukkan data pad indeks ke-"+i+" : ");
            data[i]=sc.nextInt();
        }
        Searching pencarian = new Searching(data, dat);
        System.out.println("Isi Array");
        pencarian.TampilData();
        System.out.print("Masukkan data yang akan dicari: ");
        int cari = sc.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        
        pencarian.Tampilpoisisi(cari, posisi);
        System.out.println("--------------------------------");
        System.out.println("Menggunakan Binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.Tampilpoisisi(cari, posisi);

    }
}

