/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import java.util.Scanner;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class Sum {
    public int elemen;
    public double keuntungan[],total;

    public Sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double [elemen];
        this.total =0;
    }
  double totalBF(double arr[]){
      for (int i=0;i<elemen;i++){
          total=total+arr[i];
      }
      return total;
  } 
  double totalDC(double arr[],int l,int r){
      if(l==r)
          return arr[l];
      else if(l<r){
          int mid=(l+r)/2;
          double lsum=totalDC(arr, l, mid-1);
          double rsum=totalDC(arr,mid+1,r);
          return lsum+rsum+arr[mid];
      }
      return 0;
   }
    public static void main(String[] args) {
    Scanner arif=new Scanner (System.in);
    System.out.println("==================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9");
        System.out.print("Jumlah perusahaan : ");
        int perusahaan=arif.nextInt();
        for(int i=0;i<perusahaan;i++){
        System.out.println("Perusaan ke-"+(i+1));
        System.out.print("Masukkan jumlah bulan : ");
        int elm=arif.nextInt();
        Sum sm=new Sum(elm);
    System.out.println("==================================================================");
        for (int a=0;a<sm.elemen;a++){
            System.out.print("Masukkan untung bulan ke-" +(a+1)+" = ");
            sm.keuntungan[a]=arif.nextDouble();
        }
        System.out.println("=========================================");  
        System.out.println("Algoritma Bruce Force");
        System.out.println("Total keuntungaan perusahaan selama "+sm.elemen+" bulan adalah = "
                + String.format("%.2f",sm.totalBF(sm.keuntungan)));
        System.out.println("=========================================");  
        System.out.println("Algoritma Devide and Conquer");
        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "
                + String.format("%.2f",sm.totalDC(sm.keuntungan, 0,sm.elemen-1)));
        System.out.println("=========================================");
        }
    }
}