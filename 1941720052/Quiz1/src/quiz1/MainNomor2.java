/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Windows 10
 */
public class MainNomor2 {
    public static void main(String[] args) {
        char nama[] = {'l', 'u', 'l', 'u', 'k', ' ', 'm', 'u', 'f', 'i', 'd', 'a'};     //O(1)
        Nomor2 nmr = new Nomor2();                                                      //O(1)
        nmr.cekAbjadBF(nama);                                                           //O(1)
        System.out.println("Brute Force ");                                             //O(1)
        System.out.println("Terkecil : "+ nmr.min);                                     //O(1)
        System.out.println("Terbesar : "+ nmr.maks);                                    //O(1)
        System.out.println();                                                           //O(1)
        nmr.cekAbjadDC(nama, 0, nama.length-1);                                         //O(1)
        System.out.println("Divide Conquer ");                                          //O(1)            
        System.out.println("Terkecil : "+nmr.minim());                                  //O(1)
        System.out.println("Terbesar : "+nmr.maxim());                                  //O(1)
    }
}
//Intruksi              = 1+1+1+1+1+1+1+1+1+1+1
//                      = 11
//Notasi Big O          = O(1)
