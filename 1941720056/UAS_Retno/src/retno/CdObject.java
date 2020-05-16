/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retno;

/**
 *
 * @author USER
 */
public class CdObject {
    int kdCD;
    String judul;
    int stok;
    String keadaan;

    public CdObject(int kdCD, String judul, int stok, String keadaan) {
        this.kdCD = kdCD;
        this.judul = judul;
        this.stok = stok;
        this.keadaan = keadaan;
    }

    public int getKdCD() {
        return kdCD;
    }

    public void setKdCD(int kdCD) {
        this.kdCD = kdCD;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKeadaan() {
        return keadaan;
    }

    public void setKeadaan(String keadaan) {
        this.keadaan = keadaan;
    }

}
