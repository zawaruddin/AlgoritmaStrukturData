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
public class tugas_lima {
    static int p,t,l,hasil,a;
    static double phi=3.14,jumlah;
    static char menu;
    public static void main(String[] args) {
         menu();      
     }
     
     static void luas_segitiga(){
     Scanner aqil = new Scanner(System.in);
     System.out.println("Masukann alas (cm):");
     a = aqil.nextInt();
     System.out.println("Masukann tinggi (cm):");
     t = aqil.nextInt();
     jumlah=0.5*a*t;
     System.out.println("Luas Segitiga adalah :"+" "+jumlah+" "+"(cm)");
    }
     
     static void luas_segiempat(){
     Scanner aqil = new Scanner(System.in);
     System.out.println("Masukann panjang (cm) :");
     p = aqil.nextInt();
     System.out.println("Masukann lebar (cm):");
     l = aqil.nextInt();
     System.out.println("Masukann Tinggi (cm) :");
     l = aqil.nextInt();
     hasil=p*l*t;
     System.out.println("Luas Segiempat adalah :"+" "+hasil+" "+"(cm)");
    }
     
     static void luas_lingkaran(){
     Scanner aqil = new Scanner(System.in);
     System.out.println("Masukann jari-jari (cm) :");
     p = aqil.nextInt();
     jumlah=phi*p*p;
     System.out.println("Luas Lingkarn adalah :"+" "+jumlah+" "+"(cm)");
    }
    
     static void menu(){
     Scanner aqil = new Scanner(System.in);
         System.out.println("Menu Program");
         System.out.println("(1) Luas Segitiga");
         System.out.println("(2) Luas Segi empat");
         System.out.println("(3) Luas Lingkaran");
         
         System.out.println("Masukann Pilihan anda :");
         menu = aqil.next() . charAt(0);
         
switch(menu){
case '1':
    luas_segitiga();
break;
case '2':
    luas_segiempat();
break;
case '3':
    luas_lingkaran();
break;

default:
System.out.print("Menu Yang Anda masukkan Salah !");   

         }
         
    }
    
}

