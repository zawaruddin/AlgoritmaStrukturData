/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Windows 10
 */
public class Node {

    int no, keluhan, waktu;
    String nama;
    Node next;

    public Node(int no, String nama, int keluhan, int waktu, Node next) {
        this.no = no;
        this.keluhan = keluhan;
        this.waktu = waktu;
        this.nama = nama;
    }

    public void cetak() {
        System.out.println("-------------------------------------");
        System.out.println("No Antrian       : " + no);
        System.out.println("Nama             : " + nama);
        System.out.println("Pilihan Keluhan  : " + keluhan);
        System.out.println("Waktu Penanganan : " + waktu + " menit");
        System.out.println("-------------------------------------");
    }
}
