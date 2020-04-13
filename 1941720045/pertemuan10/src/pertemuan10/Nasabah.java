/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class Nasabah {
    String noRekening,nama;

    public Nasabah(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
    }

    public Nasabah() {
    }
    
    public void print(){
        System.out.println("||\t"+nama+"\t\t||\t"+noRekening+"\t\t||");
       
    }
}
