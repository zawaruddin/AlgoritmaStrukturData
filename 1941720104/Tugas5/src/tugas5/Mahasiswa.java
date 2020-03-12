/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author Daffa Cahyo
 */
public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;
    
    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = 1;
    }

    Mahasiswa() {

    }
    
    void tampil(){
        System.out.println("Nama        : " +nama);
        System.out.println("Tahun masuk : " +thnMasuk);
        System.out.println("IPK         : " +ipk);
    }
}
