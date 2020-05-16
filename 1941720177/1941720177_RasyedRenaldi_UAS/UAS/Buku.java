/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author WINDOWS 10
 */
public class Buku {

    int kdBuku;
    String title;
    int stok;
    String condition;

    public Buku(int kdBuku, String title, int stok, String condition) {
        this.kdBuku = kdBuku;
        this.title = title;
        this.stok = stok;
        this.condition = condition;
    }

    public int getKdBuku() {
        return kdBuku;
    }

    public void setKdBuku(int kdBuku) {
        this.kdBuku = kdBuku;
    }

    public String getJudul() {
        return title;
    }

    public void setJudul(String judul) {
        this.title = judul;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKeadaan() {
        return condition;
    }

    public void setKeadaan(String keadaan) {
        this.condition = condition;
    }

}
