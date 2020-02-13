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
public class lima {
    public static void main(String[] args) {
       int arrayaqil[] = {0,20,90,1,2,3,7,99,21,9,10,88,12,13,14} ;
        for(int i=0; i<arrayaqil.length; i++){
            if(arrayaqil[i]%2==0){
                System.out.println("Array ke- "+i+": Bilangan Genap");
            }else if(arrayaqil[i]%2!=0){
                System.out.println("Array ke- "+i+": Bilangan Ganjil");
            }
        
    }
}
}
