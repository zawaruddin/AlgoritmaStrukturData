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
public class tugas2 {
     public static void main(String[] args) {
    int a;
        Scanner aqil = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Y : ");
        a = aqil.nextInt();
        
        if (a%2==0 && a%6==0 && a%15!=0){
            System.out.println("Bilangan kelipatan 2");
        }else if(a%6==0 && a%15!=0){
            System.out.println("Bilangan kelipatan 6");
        }else if(a%15==0){
            System.out.println("bilangan kelipatan 15");
        }else{
            System.out.println("Bilangan Bukan kelipatan 2,6,ataupun 15");
        }
    
}
}
