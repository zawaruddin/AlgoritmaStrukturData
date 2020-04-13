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
public class SequentialSearch {
    public int Array[][];
    public int baris, kolom;

    public SequentialSearch(int[][] a, int b, int k) {
        Array = new int[b][k];
        this.baris = b;
        this.kolom = k;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                Array[i][j]=a[i][j];
            }
        }
    }
    
     public void FindSeqSearch(int cari){
       int ketemu=0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {  
            if(Array[i][j]==cari){
               System.out.println("Nilai ditemukan !!");
               System.out.println("Nilai matriks "+cari+" berada pada baris ke-"+(i+1)+
                                   " dan kolom ke-"+(j+1));
                ketemu=1;
                break;
                }
            }
        }
        if(ketemu==0){
        System.out.println("nilai matriks "+cari+" tidak ditemukan");
        }
    }
}