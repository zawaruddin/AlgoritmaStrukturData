/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan13;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class NodeMhs {
    String nama;
    int nilai;
    NodeMhs next,prev;

    public NodeMhs(NodeMhs prev,String nama, int nilai, NodeMhs next) {
        this.nama = nama;
        this.nilai = nilai;
        this.next = next;
        this.prev = prev;
    }
    
    public void tampil(){
        System.out.println("" +this.nama+", nilai "+this.nilai);
    }
}