/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Mencari2DimensiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        
        int[][] data = {{45,78,7,200,80}, {90,1,17,100,50}, {21,2,40,18,65}};
        Mencari2Dimensi pencarian = new Mencari2Dimensi(data, 3, 5);
        
        System.out.println("pencarian Data Array 2D Menggunakan Sequential Search");
        System.out.println("=======================================================");
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("=======================================================");
        
        System.out.print("Masukkan data yang dicari : ");
        int cari = luluk.nextInt();
        
        int[] posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
    }
    
}
