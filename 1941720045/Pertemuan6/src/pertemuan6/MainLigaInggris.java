/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class MainLigaInggris {
    public static void main(String[] args) {
        String[] nama = { "Manchester United\t\t","Manchester City\t\t","Arsenal\t\t\t\t","Liverpool\t\t\t","Aston Villa\t\t\t", "Bournemouth\t\t\t",
                            "Crystal Palace\t\t\t", "Everton\t\t\t\t", "Leicester City\t\t\t","Newcastle United\t\t", "Norwich City\t\t\t",
                            "Sheffield United\t\t", "Southampton\t\t\t", "Tottenham Hotspur\t\t", "Watford\t\t\t\t", "West Ham United\t\t",
                            "Wolverhampton Wanderers\t" };
        int[] main = { 28, 27, 29, 29, 29, 29, 29, 28, 29, 27, 28, 29, 29, 28, 29, 29, 29, 29, 29, 29 };
        int[] selisihGoal = { 4, -18, -18, -8, -6, 9, -6, -6, 26, 45, 39, 12, -16, -27, 5, -17, 7, -17, -15, 7 };
        int[] point = { 40, 25, 27, 29, 39, 48, 39, 37, 50, 82, 57, 42, 35, 21, 43, 34, 41, 27, 27, 43 };
        
        Ligainggris[] li = new Ligainggris[nama.length];
        for (int i = 0; i < li.length; i++) {
           li[i] = new Ligainggris(nama[i], main[i], selisihGoal[i], point[i]);
        }
        
        System.out.println("<<<Sebelum Data disorting>>>");
        for (int i = 0; i < li.length; i++) {
            li[i].tampil();
        }
        
        System.out.println("====================================");
        System.out.println("Setelah Sorting Metode Insertion Sort Ascending: ");
        Ligainggris.insertionSort(li, true);
        for (int i = 0; i < li.length; i++) {
            li[i].tampil();
        }
        System.out.println("=====================================");
        System.out.println("Setelah Sorting Metode Insertion Sort Descending: ");
        Ligainggris.insertionSort(li, false);
        for (int i = 0; i < li.length; i++) {
            li[i].tampil();
        }

        
    }
}
