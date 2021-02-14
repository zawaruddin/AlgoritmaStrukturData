/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class perulanganPersegiPanjang {
    public int panjang;
    public int lebar;
    
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
        for(int a=0; a<3; a++){
            ppArray[a] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+a);
            System.out.print("Masukkan panjang: ");
            ppArray[a].panjang = luluk.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[a].lebar = luluk.nextInt();
        }
        for(int a=0; a<3; a++){
            System.out.println("Persegi panjang ke-"+a);
            System.out.println("Panjang: "+ppArray[a].panjang+", lebar: "+ppArray[a].lebar);
        }
        
        }
}
    
