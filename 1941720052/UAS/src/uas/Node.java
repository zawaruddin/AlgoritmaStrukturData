/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Windows 10
 */
public class Node {
    CD_Luluk cd = new CD_Luluk();
    Node prev;
    Node next;
    
    public Node(Node prev, int kode, char judul, String distributor, int jml_stok, int jml_rusak, Node next){
        this.prev = prev;
        cd.kode = kode;
        cd.judul = judul;
        cd.distributor = distributor;
        cd.jumlah_stok = jml_stok;
        cd.jumlah_rusak = jml_rusak;
    }
    
}
