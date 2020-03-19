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
public class Tiket {
String nama;
float harga;
int available;
int sold;

    public Tiket(String a, float b, int c, int d ) {
        nama=a;
        harga=b;
        available=c;
        sold=d;
    }
    
    void tampil(){
        System.out.println("Nama Pesawat\t\t= "+nama);
        System.out.println("Harga Tiket\t\t= "+harga);
        System.out.println("Available Tiket\t= "+available);
        System.out.println("Sold Tiket\t\t= "+sold);
    }
}