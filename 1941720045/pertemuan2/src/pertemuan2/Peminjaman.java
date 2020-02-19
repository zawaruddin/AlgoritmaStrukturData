/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class Peminjaman {
    public String id,Nama_member,Nama_game;
    public int Harga_sewa,Lama_pinjam;
    
    public void Hasilpeminjaman(){
        System.out.println("Id\t\t: "+id);
        System.out.println("Nama member\t: "+Nama_member);
        System.out.println("Nama game\t: "+Nama_game);
        System.out.println("Lama meminjam\t: "+Lama_pinjam+ " Hari");
        System.out.println("Harga sewa\t: "+Harga_sewa);
    }
    public int Totalbayar(){
    return Lama_pinjam*Harga_sewa;
            }
    public static void main(String[] args) {
        Peminjaman pmn=new Peminjaman();
        pmn.id="06FEB2001";
        pmn.Nama_member="Hosnol Arifin";
        pmn.Nama_game="Good Of War";
        pmn.Lama_pinjam=10;
        pmn.Harga_sewa=50000;
        pmn.Hasilpeminjaman();
        int harga_total=pmn.Totalbayar();
        System.out.println("Total pembayaran : Rp "+harga_total);
    }
}
