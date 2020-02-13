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
public class tugas_empat {
    public static void main(String[] args) {
        
        int a=1000000,b,f,j;
        int i;
        Scanner aqil = new Scanner(System.in);
         f=a;
         b= a*2/100;
        System.out.println("Saldo awal :" +f);
         for ( i=0; i<25; i++){
             j=a+=i;
             System.out.println("saldo bulan ke" +(i+1) +" "+ "sebesar :" + j);
             a+=b;
             }
            System.out.println("Total Saldo "+" "+a  +" "+"Ada di bulan :"+" " + a);

         }
    }

