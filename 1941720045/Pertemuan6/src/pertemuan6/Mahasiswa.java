/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class Mahasiswa {
String nama;
int thnmasuk,umur;
double ipk;
    Mahasiswa() {
    
    }
    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        thnmasuk = t;
        umur = u;
        ipk = i;
    }
  

    
     void tampil(){
         System.out.println("\nNama = "+nama);
         System.out.println("Tahun Masuk = "+thnmasuk);
         System.out.println("Umur = "+umur);
         System.out.println("IPK = "+ipk);
     } 
}