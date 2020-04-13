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
public class mainMergeBinary {
     public static void main(String[] args) {
        Scanner arif=new Scanner(System.in);
        int[] a = new int[8];
        for (int i = 0; i < a.length; i++){
            System.out.print("Data ke-"+(i+1)+" = ");
            int input=arif.nextInt();
            a[i] = input;
        }
        Merge_sort sms=new Merge_sort();
        System.out.println("<<<Sorting dengan Merge Sort>>>");
        System.out.println("-------------Data Awal----------------");
        sms.printArray(a);
        sms.mergeSort(a);
        System.out.println("--------Data Setelah Diurutkan--------");
        sms.printArray(a);
        
        System.out.print("Masukkan data yang ingin di cari\t: ");
        int nilai=arif.nextInt();
        
        binary b=new binary(a,8);
        System.out.println("<<<<<<<<Binary Search>>>>>>>>");
        int posisi=b.FindBinarySearch(nilai,0,a.length-1);
        b.TampilPosisi(nilai, posisi);
    }
}
