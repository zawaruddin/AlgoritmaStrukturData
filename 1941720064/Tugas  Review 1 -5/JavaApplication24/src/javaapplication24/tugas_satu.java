/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Abdulloh Aqil
 */
public class tugas_satu {
     public static void main(String[] args) {
        Scanner aqil=new Scanner(System.in);
        
        double CA=12000,CB=20000,CC=15000,OA=10000,OB=12000,OC=15000,pesan
               ,total,mele,banyak;
        String pilih;
        char menu;
        
         System.out.println("Paket 1");
         System.out.println("PAKET Chicken");
         System.out.println("(1)Chicken A "+ "Rp"+"."+ CA);
         System.out.println("(2)Chicken B " + "Rp"+"."+ CB);
         System.out.println("(3)Chicken C " + "Rp"+"."+ CC);
         
         System.out.println("=========================");
         System.out.println("Paket 2");
         System.out.println("PAKET Oke");
         System.out.println("(1)Oke A " + "Rp"+"." + OA);
         System.out.println("(2)Oke B " + "Rp"+"."+ OB);
         System.out.println("(3)Oke C " + "Rp"+"."+ OC);
         
         System.out.println("Mau pesan paket berapa ? ");
         menu = aqil.next() . charAt(0); 
         if (menu == '1'){
         pilih = "PAKET Chicken";
         }else{
         pilih = "PAKET oke";
         }
         System.out.println("Oke Paket " + ": "+ pilih);
         
         System.out.println("Pesan paket" +": " + pilih+" "+"yang mana?"+" "+"masukkan nomor urut 1 atau 2 atau 3");
         mele = aqil.nextDouble();
         
         System.out.println("Pesan berapa :?");
         banyak = aqil.nextDouble();
         
switch(menu){
case '1':
    if(mele == 1){
    total = banyak * CA;
    }else if(mele == 2){
    total = banyak * CB;
    }else{
    total = banyak * CC;
    }
    System.out.println("Total yang harus dibayarkan untuk pesanan anda "+" " + pilih);
    System.out.println("Adalah sebesar"+"Rp."+total);
break;
case '2':
    if(mele == 1){
    total = banyak * OA;
    }else if(mele == 2){
    total = banyak * OB;
    }else{
    total = banyak * OC;
    }
    System.out.println("Total yang harus dibayarkan untuk pesanan anda "+" " + pilih);
    System.out.println("Adalah sebesar"+"Rp."+total);
break;

default:
System.out.print("Menu Yang Anda masukkan Salah !");   

         }
     }
}
