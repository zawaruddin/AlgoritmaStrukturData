/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;


public class cariPenduduk {
    public int jmlData;
    public penduduk listPenduduk[];
    public int indeks;
    
    public cariPenduduk(int jumlah) {
        this.jmlData = jumlah;
        listPenduduk = new penduduk[jumlah];
    }
    
    public void tambah(penduduk P) {
        if (indeks<listPenduduk.length) {
            listPenduduk[indeks] = P;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < jmlData; i++) {
            if (listPenduduk[i].nik == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    
    public void Tampilposisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("Data Ditemukan");
            System.out.println("NIK Penduduk\t\t: " + listPenduduk[pos].nik);
            System.out.println("Nama Penduduk\t\t: " + listPenduduk[pos].nama);
            System.out.println("Alamat Penduduk\t: " + listPenduduk[pos].alamat);
            System.out.println("Jenis Kelamin\t\t: " + listPenduduk[pos].jenisK);
            System.out.println("============================================");
        }
        else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
