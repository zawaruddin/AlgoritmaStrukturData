/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspengurutan;

/**
 *
 * @author Windows 10
 */
public class KlasemenMain {
    public static void main(String[] args) {
        String[] namaGrup = { "Arsenal", "Aston Villa", "Bournemouth", "Crystal Palace", "Everton", "Leicester City",
                "Liverpool", "Manchester City", "Manchester United", "Newcastle United", "Norwich City",
                "Sheffield United", "Southampton", "Tottenham Hotspur", "Watford", "West Ham United",
                "Wolverhampton Wanderers" };
        int[] main = { 28, 27, 29, 29, 29, 29, 29, 28, 29, 27, 28, 29, 29, 28, 29, 29, 29, 29, 29, 29 };
        int[] selisihGoal = { 4, -18, -18, -8, -6, 9, -6, -6, 26, 45, 39, 12, -16, -27, 5, -17, 7, -17, -15, 7 };
        int[] jmlPoin = { 40, 25, 27, 29, 39, 48, 39, 37, 50, 82, 57, 42, 35, 21, 43, 34, 41, 27, 27, 43 };

        Klasemen[] klsmn = new Klasemen[namaGrup.length];
        for (int a = 0; a < klsmn.length; a++) {
            klsmn[a] = new Klasemen(namaGrup[a], main[a], selisihGoal[a], jmlPoin[a]);

        }
        System.out.println("Sebelum Sorting : ");
        for (int a = 0; a < klsmn.length; a++) {
            klsmn[a].tampil();
        }
        System.out.println("====================================");
        System.out.println("Setelah Sorting Metode Insertion Sort Ascending: ");
        Klasemen.insertionSort(klsmn, true);
        for (int a = 0; a < klsmn.length; a++) {
            klsmn[a].tampil();
        }
        System.out.println("=====================================");
        System.out.println("Setelah Sorting Metode Insertion Sort Descending: ");
        Klasemen.insertionSort(klsmn, false);
        for (int a = 0; a < klsmn.length; a++) {
            klsmn[a].tampil();
        }

    }
    
}
