/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class UTS {
    public static String[]data={"h","o","s","n","o","l","a","r","i","f","i","n"};
    
    public void tampilkanData(){
        for (String allData : data) {
            System.out.print(allData + " ");
        }
        System.out.println();
    }
    
    public void searching(String karakter){
        int x = 0;
        boolean ketemu = false;
        for (int i = x; i < data.length; i++) {
            if(karakter.equals(data[i])){
                ketemu = true;
                x = i;
            }
        }
        if(ketemu){
            System.out.println(">>Huruf "+karakter+ " berada pada index ke-"+(x+1));
        } else {
            System.out.println(">>Huruf "+karakter+ " tidak ditemukan");
        }
    }
    
    public  void mergeSort(String[] a, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
      
        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    }

    public  void merge(String[] a, int from, int mid, int to) {
        int n = to - from + 1;       
        String[] b = new String[n];   
        int i1 = from;               
        int i2 = mid + 1;            
        int j = 0;                   

       
        while (i1 <= mid && i2 <= to) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        
        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

       
        while (i2 <= to) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
    }
        
        public void BinarySearch(String[] string,String cari) {
        int batasAtas = string.length - 1;
        int batasBawah = 0;
 
        boolean notFound = true;
        while (notFound) {
            int posisiSekarang = (batasAtas + batasAtas) / 2;
            if (string[posisiSekarang].equals(cari)) {
                notFound = false;
                System.out.println(">>Huruf "+ cari +" berada pada index ke-"+posisiSekarang);
            } else if (batasBawah > batasAtas) {
                System.out.println(">>Huruf " +cari+" tidak ditemukan");
                break;
            } else {
                if (string[posisiSekarang].compareTo(cari) < 0)
                    batasBawah = posisiSekarang + 1;
                else
                    batasAtas = posisiSekarang - 1;
            }
        }
    }
    
    public static void main(String[] args) {
    Scanner arif=new Scanner(System.in);
        UTS cari=new UTS();
        System.out.println("*** UTS - PRAKTIKUM ASD ***");
        System.out.println("~~~ Program Pencarian Data ~~~");
        System.out.println("\nNAMA\t: Hosnol Arifin");
        System.out.println("NIM\t: 1941720045");
        System.out.println("");
        System.out.println("~~~ Data ~~~");
        cari.tampilkanData();
     
        System.out.println("\nPilih Metode Pencarian:");
        System.out.println("1. Sequential Search\n2. Binary Search");
        
        System.out.print("\nPilih Metode Nomor: ");
        int pilih=arif.nextInt();
        System.out.print("Data Yang Dicari: ");
        String Data=arif.next();
        
        switch(pilih){
            case 1:
                System.out.println("\nHasil pencarian dengan Sequential Search:");
               cari.searching(Data);
               break;
            case 2:
                System.out.println("\nHasil pengurutan dengan Merge Sort:");
                cari.mergeSort(data, 0, data.length-1);
                System.out.println("Data: " + Arrays.toString(data));
                cari.BinarySearch(data, Data);
                break;
           default:
               System.out.println("Maaf input yang anda masukkan salah");
        }
        System.out.println("\n----- PROGRAM SELESAI -----");
    }
}