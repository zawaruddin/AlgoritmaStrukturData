/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;

/**
 *
 * @author Windows 10
 */
public class Mencari2Dimensi {
    public int[][] data;
    public int jumlahBaris, jumlahKolom;

    public Mencari2Dimensi(int[][] Data, int baris, int kolom) {
        this.jumlahBaris = baris;
        this.jumlahKolom = kolom;
        data = new int[baris][kolom];
        for (int a = 0; a < jumlahBaris; a++) {
            for (int b = 0; b < jumlahKolom; b++) {
                data[a][b] = Data[a][b];
            }
        }
    }

    public int[] FindSeqSearch(int cari) {
        int[] posisi = new int[2];
        posisi[0] = -1;
        posisi[1] = -1;
        for (int a = 0; a < jumlahBaris; a++) {
            for (int b = 0; b < jumlahKolom; b++) {
                if (data[a][b] == cari) {
                    posisi[0] = a;
                    posisi[1] = b;
                    break;
                }
            }
        }
        return posisi;
    }
    
    public void TampilData() {
        for (int a = 0; a < jumlahBaris; a++) {
            for (int b = 0; b < jumlahKolom; b++) {
                System.out.print(data[a][b] + "\t");
            }
            System.out.println();
        }
    }
    
    public void Tampilposisi(int x, int[] pos)
    {
        if (pos[0] != -1 && pos[1] != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks (" + pos[0] + "," + pos[1] + ")");
        }
        else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    
}
