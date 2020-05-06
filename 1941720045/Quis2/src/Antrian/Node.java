/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antrian;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class Node {
  int no; 
        int keluhan;
        int waktu;
        String nama;
        String nama_keluhan;
        Node next;
    
        public Node(int no, String nama, int keluhan){
            this.no = no;
            this.nama = nama;
            this.keluhan = keluhan;
            this.waktu = waktu;
        }
    
        public void tampil(){
            if(this.keluhan == 1){
                this.nama_keluhan = "Demam";
                this.waktu = 7;
            }else if(this.keluhan == 2){
                this.nama_keluhan = "Flu";
                this.waktu = 5;
            }else if(this.keluhan == 3){
                this.nama_keluhan = "Sakit Kepala";
                this.waktu = 8;
            }else if(this.keluhan == 4){
                this.nama_keluhan = "Asma";
                this.waktu = 4;
            }else if(this.keluhan == 5){
                this.nama_keluhan = "Diare";
                this.waktu = 3;
            }else if(this.keluhan == 6){
                this.nama_keluhan = "Sakit Gigi";
                this.waktu = 11;
            }else if(this.keluhan == 7){
                this.nama_keluhan = "Sakit Mata";
                this.waktu = 13;
            }else if(this.keluhan == 8){
                this.nama_keluhan = "Keseleo";
                this.waktu = 6;
            }else if(this.keluhan == 9){
                this.nama_keluhan = "Susah Tidur";
                this.waktu = 5;
            }else{
                this.nama_keluhan = "Penyakit tidak diketahui";
                this.waktu = 0;
            }
            System.out.print(this.no + ". " + this.nama  + " (Keluhan: " + this.nama_keluhan  + ", Penanganan " + this.waktu + " menit)\n");
        }
    }
