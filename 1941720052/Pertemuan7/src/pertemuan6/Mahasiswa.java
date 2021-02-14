/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Windows 10
 */
public class Mahasiswa {

    String nama;
    int thnMasuk,umur;
    double ipk;
    
    Mahasiswa(String n, int t, int u, double i){
        nama= n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    Mahasiswa() {
    }
    void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Tahun Masuk = "+thnMasuk);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }
    
}
