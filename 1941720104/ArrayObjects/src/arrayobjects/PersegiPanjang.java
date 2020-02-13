/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjects;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class PersegiPanjang {

    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
    
    for(int i = 0; i < 3; i++){
        ppArray[0] = new PersegiPanjang();
        System.out.println("Persegi panjang ke-" + i);
        System.out.print("Masukkan panjang: ");
        ppArray[0].panjang = daffa.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[0].lebar = daffa.nextInt();
    }
    
    for(int i = 0; i < 3; i++){
        System.out.println("Persegi panjang ke-" +i);
        System.out.println("Panjang: " +ppArray[0].panjang+ ", lebar: " +ppArray[0].lebar);
    }
//        ppArray[1] = new PersegiPanjang();
//        ppArray[1].panjang = 110;
//        ppArray[1].lebar = 30; 
//
//        ppArray[1] = new PersegiPanjang();
//        ppArray[1].panjang = 80;
//        ppArray[1].lebar = 40;
//                
//        ppArray[2] = new PersegiPanjang();
//        ppArray[2].panjang = 100;
//        ppArray[2].lebar = 20;
//        
//        System.out.println("Persegi Panjang ke-0, panjang: " +ppArray[0].panjang+ ", lebar: " +ppArray[0].lebar);
//        System.out.println("Persegi Panjang ke-1, panjang: " +ppArray[1].panjang+ ", lebar: " +ppArray[1].lebar);
//        System.out.println("Persegi Panjang ke-2, panjang: " +ppArray[2].panjang+ ", lebar: " +ppArray[2].lebar);              
    }
}
