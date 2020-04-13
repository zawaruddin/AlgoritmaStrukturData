/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;
import java.util.Scanner;
            
public class pencarianArray2D {
    
    public static void main(String[] args) {
    Scanner arif = new Scanner(System.in);
    
      System.out.print("Masukan baris : ");
      int baris = arif.nextInt();
      System.out.print("Masukan kolom : ");
      int kolom = arif.nextInt();
      int[][] matriks = new int[baris][kolom];

        System.out.println("");
        for(int x=0; x<baris;x++){
        for(int y=0; y<kolom;y++){
        System.out.print("matriks["+(x+1)+"]["+(y+1)+"] : ");
        matriks[x][y]=arif.nextInt();
        }
    }
        System.out.println();
        System.out.println("Bentuk matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Masukan nilai yang dicari : ");
        int cari = arif.nextInt();

        SequentialSearch ss=new SequentialSearch(matriks,baris,kolom);
        System.out.println("<<<Pencarian menggunakan Sequential Sort");
        ss.FindSeqSearch(cari);
   }
   
}