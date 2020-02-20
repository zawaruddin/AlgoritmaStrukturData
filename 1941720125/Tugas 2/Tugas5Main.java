/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
import java.util.Scanner;
public class Tugas5Main {
    public static void main(String[]args){
        Tugas5[] Array = new Tugas5[5];       
        Scanner ananda = new Scanner(System.in);
        for(int i=1; i<6 ; i++){
        Array[0] = new Tugas5();
            System.out.println("Jajargenjang ke-"+i);
        System.out.println("Masukkan Tinggi : ");
        Array[0].tinggi = ananda.nextInt() ;
        System.out.println("Masukkan Panjang : ");
        Array[0].panjang = ananda.nextInt() ;
        System.out.println("Masukkan Sisi Miring : ");
        Array[0].sisiMiring = ananda.nextInt() ;        
        }        
        System.out.println("=======================================");
        for(int i=1; i<6 ; i++){
            System.out.println("Jajar Genjang ke-"+i);
            System.out.println("Luasnya: "+Array[0].hitungLuas(1));
            System.out.println("Keliling : "+Array[0].hitungKeliling(1));
    }
}
}

