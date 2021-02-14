/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
public class Tugas2 {
    String id, namaMember,namaGame;
        int lamaPinjam, hargaSewa;
  Tugas2(String idm, String NM,String NG, int LP, int HS){
            id = idm;
            namaMember = NM;
            namaGame = NG;
            lamaPinjam = LP;
            hargaSewa = HS;
        }
Tugas2() {
    }void tampilkan(){
        System.out.println("Nama Member = "+namaMember);
        System.out.println("ID Member = "+id);
        System.out.println("Nama Game = "+namaGame);
        System.out.println("Lama Meminjam = "+lamaPinjam);
        System.out.println("Harga Sewa Per Hari = "+hargaSewa);
        }        
        int hitungHargaTotal(int jumlah){
        return jumlah*hargaSewa*lamaPinjam;
    }
}

