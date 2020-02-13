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
public class tujuh {
    public static void main(String[] args) {
         Scanner Aqil = new Scanner(System.in);
         int a,b=0,c;
         System.out.print("Masukkan deret fibonanci :");
         a = Aqil.nextInt();
         System.out.println("Fibnanci value");
         fb(a);      
    }
    
    static void fb(int a){
    int x=0,y=1;
    for (int i=0 ; i<a ; i++){
        System.out.print(x+ " ");
        x = x+y;
        y = x-y;
    }
        System.out.println();
    }
}
