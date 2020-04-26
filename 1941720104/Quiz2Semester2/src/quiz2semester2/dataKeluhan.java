/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2semester2;

/**
 *
 * @author Daffa Cahyo
 */
public class dataKeluhan {
    int no_pilihan;
    String keluhan;
    int waktu;

    public dataKeluhan(int no_pilihan, String keluhan, int waktu) {
        this.no_pilihan = no_pilihan;
        this.keluhan = keluhan;
        this.waktu = waktu;
    }

    public int getNo_pilihan() {
        return no_pilihan;
    }

    public void setNo_pilihan(int no_pilihan) {
        this.no_pilihan = no_pilihan;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }
    
    @Override
    public String toString() {
        return no_pilihan+"\t"+keluhan+"\t"+waktu;
    }    
}