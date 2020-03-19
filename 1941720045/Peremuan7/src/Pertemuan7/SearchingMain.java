/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class SearchingMain {
    public static void main(String[] args) {
        //int data[]={10,40,30,50,70,20,100,90};
        Scanner arif=new Scanner(System.in);
        int[] data = new int[8];
        for (int i = 0; i < data.length; i++){
            System.out.print("Data ke-"+(i+1)+" = ");
            int input=arif.nextInt();
            data[i] = input;
        }  
        Searching pencarian=new Searching(data,8);
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        int cari=30;
        System.out.println("Menggunkan Sequential Search");
        int posisi=pencarian.FindSeqSearch(cari);
        pencarian.TampilPosisi(cari, posisi);
        
        System.out.println("=========================");
        System.out.println("Menggunakan Binary Search");
        int posisi1=pencarian.FindBinarySearch(cari,0,data.length-1);
        pencarian.TampilPosisi(cari, posisi);
        
//        if (posisi!=-1){
//            System.out.println("data: " +cari+ " ditemukan pada Indeks "+posisi);
//        }else{
//            System.out.println("data "+cari+ "tidak ditemukan");
//        }
    } 
}