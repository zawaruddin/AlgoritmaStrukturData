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
public class NodeCD {

    CD_DaffaCahyoAlghifari cd = new CD_DaffaCahyoAlghifari();
    NodeCD prev;
    NodeCD next;

    NodeCD(NodeCD prev, int index, int kode, String judul, String penerbit, int stok, int rusak, NodeCD next) {
        this.prev = prev;
        cd.index = index;
        cd.kode = kode;
        cd.judul = judul;
        cd.penerbit = penerbit;
        cd.stok = stok;
        cd.rusak = rusak;
        this.next = next;
    }    
}
