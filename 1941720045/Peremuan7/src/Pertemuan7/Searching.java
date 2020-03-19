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
public class Searching {
    public int[] data;
    public int jumData;

    public Searching(int[] Data, int jmlData) {
        data = new int[jmlData];
        this.jumData = jmlData;
        for (int i = 0; i < jumData; i++) {
            data[i]=Data[i];
        }
    }
    
    public int FindSeqSearch(int cari){
        int posisi=-1;
        for (int i = 0; i < jumData; i++) {
            if(data[i]==cari){
                posisi=i;
                break;
            }
        }
        return posisi;
    }
    
    public int FindBinarySearch(int cari,int left, int right){
        int mid;
        if(right>=left){
            mid=(left+right)/2;
            if (cari==data[mid]){
                return (mid);
            }else if (data[mid]>cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari,mid+1,right);
            }
        }
        return -1;
    }
    
    public void TampilPosisi(int x,int pos){
        if (pos!=-1){
            System.out.println("data : "+x+" ditemukan pada indeks "+ pos);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
    
    public void TampilData(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" "); 
        }
        System.out.println("");
    }
}