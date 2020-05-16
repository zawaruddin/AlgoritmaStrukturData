/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan13;

/**
 *
 * @author Windows 10
 */
public class NodeMhs {
    Mahasiswa mhs = new Mahasiswa();
    NodeMhs prev;
    NodeMhs next;

    NodeMhs(NodeMhs prev, String nama, int nilai, NodeMhs next) {
        this.prev = prev;
        mhs.nama = nama;
        mhs.nilai = nilai;
        this.next = next;
    }
    
}
