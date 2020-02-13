/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata;

/**
 *
 * @author Abdulloh Aqil
 */
public class Barang {
    String nama_barang,jenis_barang;
    int stok,hargasatuan;
    Barang(){
    
    }
    Barang(String nm, String jn, int st, int hs){
    nama_barang =nm;
    jenis_barang=jn;
    stok = st;
    hargasatuan = hs;
    }
    
    
    void tampil_barang(){
        System.out.println("Nama :" + nama_barang);
        System.out.println("Jenis :" + jenis_barang);
        System.out.println("Stock :" + stok);
        System.out.println("Harga Satuan :" + hargasatuan);
}
    void tambah_stok(int n){
    stok = stok+n;
    }
    void kurangi_stok(int n){
    if(stok >0){
    stok = stok-n;
    }
    }
    int hitung_harga_stok(int jumlah){
    return jumlah*hargasatuan;
    }
    public static void main(String[] args) {
       
    }
}
