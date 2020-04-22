/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas11;

/**
 *
 * @author Daffa Cahyo
 */
public class node {

    String NIM;
    String nama;
    String Alamat;
    node next;

    public node(String NIM, String nama, String Alamat, node next) {
        this.NIM = NIM;
        this.nama = nama;
        this.Alamat = Alamat;
        this.next = next;
    }
}