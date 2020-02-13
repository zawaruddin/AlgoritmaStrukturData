/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobject;

/**
 *
 * @author Abdulloh Aqil
 */
import java.util.Scanner;
public class ArrayObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persegi_panjang[] ppArray=new persegi_panjang[3];
        Scanner aqil = new Scanner(System.in);
        for (int i=0 ; i<3; i++){
        ppArray[0]= new persegi_panjang();
        System.out.println("Prsegi panjang ke -"+i);
        System.out.print("Masukkan panjag");
        ppArray[0].panjang = aqil.nextInt();
        System.out.print("Masukkan lebar");
        ppArray[0].lebar = aqil.nextInt();
        }
        
        for (int i=0 ; i<3; i++){
        System.out.println("Prsegi panjang ke -"+i);
        System.out.println("panjang :"+ ppArray[0].panjang + ", lebar:" + ppArray[0].lebar);
        }

    }
    
}
