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
public class TiketPesawatMain {
    public static void main(String[] args) {
        String[] TempatTuju = { "Semarang-bangil", "Yogyakarta-Makasar", "Malang-Semarang", "Jakarta-Yogyakarta",
                "Jakarta-Bangil" };
        float[] bagasi = { 3.5f, 2.5f, 5.5f, 1.0f, 3.0f };
        int[] waktu = { 20, 55, 95, 45, 70 };
        int[] harga = { 550000, 650000, 400000, 850000, 700000 };

        TiketPesawat[] tkt = new TiketPesawat[5];
        for (int i = 0; i < tkt.length; i++) {
            tkt[i] = new TiketPesawat(TempatTuju[i], bagasi[i], waktu[i], harga[i]);
        }

        System.out.println("Sebelum Sorting : ");
        for (int i = 0; i < tkt.length; i++) {
            tkt[i].tampil();
        }
        System.out.println("===============================");
        System.out.println("Setelah Sorting Metode Bubble Sort : ");
        TiketPesawat.bubbleSort(tkt);
        for (int i = 0; i < tkt.length; i++) {
            tkt[i].tampil();
        }
        System.out.println("===============================");
        System.out.println("Setelah Sorting Metode Selection Sort : ");
        TiketPesawat.selectionSort(tkt);
        for (int a = 0; a < tkt.length; a++) {
            tkt[a].tampil();
        }

    } 
    
}
