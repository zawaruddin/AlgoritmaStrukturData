/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class Tugas3 {
    String nama ;
    int hargaSatuan,jumlah ,hargaTotal,diskonHarga ;
    Tugas3(String nm,int jml, int hs,int ht,int dh){
            jumlah = jml;
            nama = nm;
            hargaSatuan = hs;
            hargaTotal = ht;
            diskonHarga = dh;
        }
    Tugas3() {
    }
    void tampilkan(){
        System.out.println("Nama Pembeli = "+nama);
        System.out.println("Harga Satuan = "+hargaSatuan);
        System.out.println("Jumlah Yang Dibayar = "+jumlah);
        }int hitungHargaTotal(int a) {
    return hargaSatuan*jumlah;
    }  
    int hitungDiskon1(int a){
    return hargaTotal*10/100;
    } 
    int hitungDiskon2(int a){
        return hargaTotal*5/100;
    }
    int hitungDiskon3(int a){
        return hargaTotal;
    }
    int hitungHargaBayar1(int a){
        return hargaTotal - diskonHarga; 
    }
}


