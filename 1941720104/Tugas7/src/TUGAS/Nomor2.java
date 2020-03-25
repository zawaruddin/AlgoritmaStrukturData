/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class Nomor2 {

    static Scanner daffa = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] Data = {{45, 78, 7, 200, 80}, 
                        {90, 1, 17, 100, 50}, 
                        {21, 2, 40, 18, 65}};
        int a = 0;
        boolean temukan = false;
        
        System.out.println("Isi Data: ");
        for (int i = 0; i < Data.length; i++) {
            for (int j = 0; j < Data[i].length; j++) {
                System.out.print(Data[i][j]+ "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.print("Masukkan data yang ingin dicari: ");
        int n = daffa.nextInt();
        int letak[] = {-1,-1};
                
        for (int i = 0; i < Data.length; i++) {
            for (int j = 0; j < Data[i].length; j++) {
                if (n == Data[i][j]) {
                    letak[0] = i;
                    letak[1] = j;
                    temukan = true;
                    break;
                }
//                else{
//                    System.out.println("Data tidak ditemukan");
//                }
            }
        }

        if (temukan) {
            System.out.println("Data : " + n);
            System.out.println("Ada");
             if (letak[0] != -1 && letak[1] != -1) {
            System.out.println("data: " + n + " ditemukan pada baris ke-" + (letak[0]+1)+" dan kolom ke-"+(letak[1]+1));
        }
        } else {
            System.out.println("Tidak Ada");
        }
    }
}