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
public class PersegiPanjang {
   
    public int panjang;
    public int lebar;
    
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
    Scanner ananda = new Scanner(System.in);
for(int i = 0;i<3;i++){
    ppArray[0]=new PersegiPanjang();
    System.out.println("Persegi panjang ke-" + i);
    System.out.print("Masukkan panjang : ");
    ppArray[0].panjang=ananda.nextInt();
    System.out.println("Masukkan lebar : ");
    ppArray[0].lebar=ananda.nextInt();
}

    for(int i = 0;i<3;i++){
        System.out.println("Persegi Panjang ke-"+i);
        System.out.println("Panjang: "+ppArray[0].panjang+",lebar: " + ppArray[0].lebar);
    }
    }
}
