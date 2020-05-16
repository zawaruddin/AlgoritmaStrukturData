/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan11;

/**
 *
 * @author Windows 10
 */
public class Node {

    String NIM;
    String nama;
    String Alamat;
    Node next;

    public Node(String NIM, String nama, String Alamat, Node next) {
        this.NIM = NIM;
        this.nama = nama;
        this.Alamat = Alamat;
        this.next = next;
    }
}
