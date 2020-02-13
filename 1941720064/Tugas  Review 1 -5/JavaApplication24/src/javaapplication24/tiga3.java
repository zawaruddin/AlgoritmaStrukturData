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
public class tiga3 {
    public static void main(String[] args) {
    int a,b=0,i;
        Scanner aqil = new Scanner(System.in);
        System.out.println("Masukann Variable A :");
         a = aqil.nextInt(); 
         for ( i=0; i<5; i++){
             a-=3;
             }
         if(a%2==0){
             System.out.println(a+ ":Bilangan Genap");
         }else{
         System.out.println(a+ ":Bilangan ganjil");
         }
         }
    }

