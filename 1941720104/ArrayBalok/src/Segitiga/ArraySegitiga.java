/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segitiga;

/**
 *
 * @author Daffa Cahyo
 */
public class ArraySegitiga {
    public static void main(String[] args) {
        segitiga[] sgArray = new segitiga[4];
        
        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);  
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10); 
        
        for(int i = 0; i < 4; i++){
            System.out.println("Luas balok ke- " + (i+1) + ": " + sgArray[i].hitungLuas());
            System.out.println("Keliling balok ke- " + (i+1) + ": " + sgArray[i].hitungKeliling());            
        }   
    }        
}