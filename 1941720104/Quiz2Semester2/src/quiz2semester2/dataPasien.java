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
public class dataPasien {
    int no;
    String nama;
    int keluhan;
    int waktu;

    public dataPasien() {
    }

    public dataPasien(int no, String nama, int keluhan, int waktu) {
        this.no = no;
        this.nama = nama;
        this.keluhan = keluhan;
        this.waktu = waktu;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(int keluhan) {
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
        return no+"\t"+nama+"\t"+keluhan+"\t"+waktu;
    }    
}
