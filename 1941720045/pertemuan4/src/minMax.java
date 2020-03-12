/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class minMax {
    public int nilaiArray;
    
    public static void max_min(int [] arr,int indeksAwal,int indeksAkhir,maxMin hasil){
      int indeks_tengah;
      maxMin hasil1= new maxMin();
      maxMin hasil2 = new maxMin();
      
      if (indeksAwal==indeksAkhir){
          hasil.minimum=hasil.maximum=arr[indeksAwal];
      }else if(indeksAkhir-indeksAwal==1){
          if(arr[indeksAwal]>arr[indeksAkhir]){
              hasil.minimum=arr[indeksAkhir];
              hasil.maximum=arr[indeksAwal];
          }else{
              hasil.minimum=arr[indeksAwal];
              hasil.maximum=arr[indeksAkhir];
          }
      }else{
          indeks_tengah=(indeksAwal+indeksAkhir)/2;
          max_min(arr, indeksAwal, indeks_tengah,hasil1);
          max_min(arr, indeks_tengah+1, indeksAkhir, hasil2);
          hasil.minimum=(hasil1.minimum<hasil2.minimum)? hasil1.minimum:hasil2.minimum;
          hasil.maximum=(hasil1.maximum>hasil2.maximum)? hasil1.maximum:hasil2.maximum;
        }
    }
    public static void perhitungan(int []a){
        int min=a[0];
        int max=a[0];
        for(int i=0;i<5;i++){
            if(a[i]<min){
                min=a[i];
            }else if(a[i]>max){
                max=a[i];
            }
        }
    }
    public static void main(String[] args) {
        minMax[] ppArray =new minMax[5];
        ppArray[0] = new minMax();
       
        Scanner arif=new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
           ppArray[i]=new minMax();
           System.out.println("Nilai array indeks ke-"+i);
            System.out.print("Masukkan nilai: ");
            ppArray[i].nilaiArray=arif.nextInt();
        }
        int min=ppArray[0].nilaiArray;
        int max=ppArray[0].nilaiArray;
        for (int i = 0; i < 5; i++) {
           if (ppArray[i].nilaiArray<min)
               min=ppArray[i].nilaiArray;
           else if(ppArray[i].nilaiArray>max)
               max=ppArray[i].nilaiArray;
        }
        System.out.println("Brute force");
        System.out.println("Nilai Minimal : "+ min);
        System.out.println("Nilai Maximal : "+max);
        
        int ar[]=new int[5];
        for (int i = 0; i < 5; i++) {
            ar[i]=ppArray[i].nilaiArray;
        }
        maxMin hasil=new maxMin();
        max_min(ar,0,4,hasil);
        
        System.out.println("Devide Conquer");
        System.out.println("Nilai Minimal"+hasil.minimum+"\nNilai Maksimal"+hasil.maximum);
        System.out.println("\n");
    }
}
