/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas10;

/**
 *
 * @author Daffa Cahyo
 */
public class Nomor2 {

    String noRekening, nama;

    public Nomor2(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
    }

    public void nasabah() {

    }

    void print() {
        System.out.println("Nama = " + nama);
        System.out.println("Nomor Rekening = " + noRekening);

    }
}