/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Daffa Cahyo
 */
public class NodeMahasiswa {

    Mahasiswa mhs = new Mahasiswa();
    NodeMahasiswa prev;
    NodeMahasiswa next;

    NodeMahasiswa(NodeMahasiswa prev, String nama, int nilai, NodeMahasiswa next) {
        this.prev = prev;
        mhs.nama = nama;
        mhs.nilai = nilai;
        this.next = next;
    }
}