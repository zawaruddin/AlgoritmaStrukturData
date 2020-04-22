/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainLinkedList {

    static Scanner daffa = new Scanner(System.in);

    public static int jawaban, i;

    public static void main(String[] args) {
        LinkedList data = new LinkedList();

        System.out.println("**********MENU**********");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
        System.out.println("************************");
        System.out.print("Jawaban: ");
        jawaban = daffa.nextInt();

        switch (jawaban) {
            case 1:
                Tambah();
                break;
            case 2:
                Hapus();
                break;
            case 3:
                Cari();
                break;
            default:
        }
    }

    public static void Tambah() {
        LinkedList data = new LinkedList();
        int nilai, cari;
        System.out.println("1. Tambah (Pertama)");
        System.out.println("2. Tambah (Index)");
        System.out.println("3. Tambah (Terakhir");
        System.out.print("Jawaban: ");
        jawaban = daffa.nextInt();

        switch (jawaban) {
            case 1:
                System.out.print("Masukkan angka yang ingin ditambahkan: ");
                i = daffa.nextInt();
                data.addFirst(i);
                data.print();
                break;
            case 2:
                System.out.print("Masukkan angka yang ingin ditambahkan: ");
                i = daffa.nextInt();
                System.out.print("Masukkan nilai: ");
                nilai = daffa.nextInt();
                System.out.print("Masukkan cari: ");
                cari = daffa.nextInt();
                 {
                    try {
                        data.addByValue(i, nilai, cari);
                    } catch (Exception ex) {
                        Logger.getLogger(MainLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                data.print();
                break;
            case 3:
                System.out.print("Masukkan angka yang ingin ditambahkan: ");
                i = daffa.nextInt();
                System.out.print("Masukkan nilai: ");
                nilai = daffa.nextInt();
                 {
                    try {
                        data.add(nilai, i);
                    } catch (Exception ex) {
                        Logger.getLogger(MainLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                data.print();
                break;
        }
    }

    public static void Hapus() {
        int nilai, cari;
        LinkedList data = new LinkedList();
        System.out.println("1. Hapus (Index)");
        System.out.println("2. Hapus (Key)");
        System.out.println("3. Clear");
        System.out.print("Jawaban: ");
        jawaban = daffa.nextInt();

        switch (jawaban) {
            case 1:
                System.out.println("Masukkan angka yang ingin dihapus: ");
                i = daffa.nextInt();
                System.out.print("Masukkan nilai: ");
                nilai = daffa.nextInt();
                System.out.print("Masukkan cari: ");
                cari = daffa.nextInt();
                 {
                    try {
                        data.removeByValue(i, nilai, cari);
                    } catch (Exception ex) {
                        Logger.getLogger(MainLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                data.print();
                break;
            case 2:
                System.out.println("Masukkan angka yang ingin dihapus: ");
                i = daffa.nextInt();
                {
                     try {
                        data.remove(i);
                    } catch (Exception ex) {
                        Logger.getLogger(MainLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                data.print();
                break;
            case 3:
                data.clear();
                data.print();
                break;
            default:
        }
    }
    
    public static void Cari(){
        LinkedList data = new LinkedList();
        System.out.println("1. Cari (Index)");
        System.out.println("2. Cari (Key)");
        System.out.print("Jawaban: ");
        jawaban = daffa.nextInt();
    }
}