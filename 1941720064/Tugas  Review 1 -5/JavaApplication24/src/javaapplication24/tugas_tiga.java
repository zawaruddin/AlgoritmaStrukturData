/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author Abdulloh Aqil
 */
public class tugas_tiga {
    public static void main(String[] args) {
     char aqil[];
     aqil = new char[10];
     aqil[0]='M';
     aqil[1]='I';
     aqil[2]='S';
     aqil[3]='S';
     aqil[4]='I';
     aqil[5]='S';
     aqil[6]='S';
     aqil[7]='I';
     aqil[8]='P';
     aqil[9]='I';
     int M=0,I=0,S=0,P=0;
     
     for (int i = 0; i < aqil.length; i++) {     
     if ('M' == aqil[i]) { 
         M++;
     } 
      if ('I' == aqil[i]) { 
         I++;
     } 
       if ('S' == aqil[i]) { 
         S++;
     } 
        if ('P' == aqil[i]) { 
         P++;
     } 
    }
      System.out.println("Huruf M Ada: "+ M);
      System.out.println("Huruf I Ada: "+ I);
      System.out.println("Huruf S Ada: "+ S);
      System.out.println("Huruf P Ada: "+ P);

       
    }
    
}
