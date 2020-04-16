/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor4;

/**
 *
 * @author Windows 10
 */
public class SearchingPenduduk {
    public int jumlahData;
    public Penduduk listPenduduk[];
    public int indeks;
    
    public SearchingPenduduk(int jumlah) {
        this.jumlahData = jumlah;
        listPenduduk = new Penduduk[jumlah];
    }
    
    public void tambah(Penduduk P) {
        if (indeks<listPenduduk.length) {
            listPenduduk[indeks] = P;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < jumlahData; i++) {
            if (listPenduduk[i].nik == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    
    public void Tampilposisi(int n, int pos)
    {
        if (pos != -1) {
            System.out.println("NIK : " + n + " ditemukan pada indeks " + pos);
            System.out.println("Data Penduduk ke-" + (pos + 1));
            System.out.println("NIK Penduduk\t: " + listPenduduk[pos].nik);
            System.out.println("Nama Penduduk\t: " + listPenduduk[pos].nama);
            System.out.println("Alamat Penduduk\t: " + listPenduduk[pos].alamat);
            System.out.println("Jenis Kelamin\t: " + listPenduduk[pos].jenisKelamin);
            System.out.println("===========================================================");
        }
        else {
            System.out.println("Data " + n + " tidak ditemukan");
        }
    }
}
