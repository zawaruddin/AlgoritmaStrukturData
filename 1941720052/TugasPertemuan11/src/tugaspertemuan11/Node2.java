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
public class Node2 {
    int noAntrian;
    String namaPasien;
    Node2 next;
    
    public Node2(int no, String nama, Node2 next){
        this.noAntrian = no;
        this.namaPasien = nama;
    }
    public void print(){
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Nomor Antrian   : "+ noAntrian);
        System.out.println("Nama Pasien     : "+ namaPasien);
        System.out.println("-------------------------------------");
    }
    
}
