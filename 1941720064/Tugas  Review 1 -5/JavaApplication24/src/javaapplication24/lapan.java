/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;
import static javaapplication24.tujuh.fb;

/**
 *
 * @author Abdulloh Aqil
 */
public class lapan {
    public static void main(String[] args) {
         Scanner Aqil = new Scanner(System.in);
         int a,b=0,c;
         System.out.print("Masukkan deret fibonanci :");
         a = Aqil.nextInt();
         
         for (int i=0 ; i<a; i++) {
             System.out.print(fb(b)+ " ");
             b++;
         }
         
         System.out.println();
    }
    
    static int fb(int a){
        if (a == 0 || a == 1){
        return a;
        }else{
        return (fb(a-1) + fb(a-2));
        }
    }
}
