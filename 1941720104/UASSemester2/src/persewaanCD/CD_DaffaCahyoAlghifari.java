/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persewaanCD;

/**
 *
 * @author Daffa Cahyo
 */
public class CD_DaffaCahyoAlghifari {
    int index;
    int kode;
    String judul;
    String penerbit;
    int stok;
    int rusak;
    
    void tampil() {
        System.out.println("------------------------------");
        System.out.println("Index    : " + index);
        System.out.println("Kode     : " + kode);
        System.out.println("Judul    : " + judul);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Stok     : " + stok);
        System.out.println("rusak    : " + rusak);
    }
}
