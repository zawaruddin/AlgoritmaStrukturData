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
public class empat {
    public static void main(String[] args) {
    double a,b,f,j;
    int i;
        Scanner aqil = new Scanner(System.in);
        System.out.println("Masukann Saldo :");
         a = aqil.nextDouble();
         f=a;
         b= a*2/100;
        System.out.println("Saldo awal :" +f);
         for ( i=1; i<13; i++){
             j=a+=i;
             System.out.println("saldo bulan ke" +i +" "+ "sebesar :" + j);
             a+=b;
             }
         System.out.println("Total Saldo anda setelah 12 bulan :" + a);
         }
}
