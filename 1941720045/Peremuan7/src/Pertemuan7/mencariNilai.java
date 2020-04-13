/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class mencariNilai {
    
    void bumbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j]<array[j-1]){
                    int tmp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                }
            }
        }
        System.out.println("\nData disorting menggunakan Bubble Sort ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        
        mencariNilai mn=new mencariNilai();
        int [] array={12,17,2,1,70,50,90,17,2,90};
        System.out.println("Data Awal");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        mn.bumbleSort(array);
        
        nilai n=new nilai(array,10);
        System.out.println("<<<Pencarian niali terbesar menggunakan Binary Search>>> ");
        System.out.println("Nilai Terbesar : " + n.maks(array));
        int cari = n.maks(array);
        System.out.println("Jumlah nilai terbesar : " + n.jumlahTerbesar(cari, array));
        int posisi[] = new int[n.terbesar];
        for (int i = 0; i < n.terbesar; i++) {
            posisi[i] = n.FindBinarySearch(cari, array, 0, array.length - 1);
            if (i > 0) {
                n.Tampilposisi(cari, posisi[i] + 1);
            } else {
               n.Tampilposisi(cari, posisi[i]);
            }
        }
    }
}