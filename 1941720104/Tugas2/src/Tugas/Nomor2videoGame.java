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
import java.util.Scanner;

public class Nomor2videoGame {

    public static void main(String[] args) {
        Nomor2videoGame video = new Nomor2videoGame();
        System.out.print("Data Anda adalah:\n1. "+video.ID()+"\n2. "+video.member()+"\n3. "+video.game()+"\n4. "+video.pinjam()+"\n");
    }

    static Scanner daffa = new Scanner(System.in);

    public int ID() {
        System.out.print("Masukkan ID                   : ");
        int ID = daffa.nextInt();
        return ID;
    }

    public String member() {
        System.out.print("Masukkan nama member          : ");
        String member = daffa.next();
        return member;
    }

    public String game() {
        System.out.print("Masukkan nama game            : ");
        String game = daffa.next();
        return game;
    }

    public int pinjam() {
        System.out.print("Masukkan lama pinjam (hari)   : ");
        int waktu = daffa.nextInt();
        waktu *= 5000;
        int tagihan = waktu;
        System.out.println("Anda harus membayar sebesar: " +tagihan);        
        return waktu;
    }
}