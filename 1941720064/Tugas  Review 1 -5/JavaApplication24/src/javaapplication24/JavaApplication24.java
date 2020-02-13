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
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x,y,z,hasil,a,b,c;
        Scanner aqil = new Scanner(System.in); 
        System.out.println("Program menghitung nilai akhir ");
        System.out.print("Masukkan Nilai Tugas : ");
        x = aqil.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        y = aqil.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        z = aqil.nextDouble();
        
        if(x > 100){
            System.out.println("Nilai Tugas Lebih dari 100");
        }else if(x < 0){
            System.out.println("Nilai Tugas kurang dari 0");
        }else if(y > 100){
             System.out.println("Nilai UTS Lebih dari 100");
        }else if(y < 0){
            System.out.println("Nilai UTS kurang dari 0");
        }else if(z > 100){
             System.out.println("Nilai UAS Lebih dari 100");
        }else if(z < 0){
            System.out.println("Nilai UAS kurang dari 0");
        }else{
        
            a=x*20/100;
            b=y*35/100;
            c=z*45/100;
            hasil=a+b+c;
            
            System.out.println("Hasilnya adalah :" + hasil);
        
        }
        
    }
    
}
