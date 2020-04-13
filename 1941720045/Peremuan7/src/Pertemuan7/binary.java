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
public class binary {
     public int []D;
     public int jml;

    public binary(int[] d, int j) {
        D = new int[j];
        this.jml = j;
         for (int i = 0; i < j; i++) {
            D[i]=d[i];
        }
    }
      
    //pencarian menggunakan binaysearch
    public int FindBinarySearch(int cari,int left, int right){
        int mid;
        if(right>=left){
            mid=(left+right)/2;
            if (cari==D[mid]){
                return (mid);
            }else if (D[mid]>cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari,mid+1,right);
            }
        }
        return -1;
    }
    
    public void TampilPosisi(int x,int pos){
        if (pos!=-1){
            System.out.println("data "+x+" ditemukan pada indeks "+ pos);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
   
}
