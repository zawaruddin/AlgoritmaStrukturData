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
import java.util.Scanner;
public class mainLinkedList {
    
    static Scanner daffa = new Scanner(System.in);
    
    public static void main(String[] args) {
        linkedListMahasiswa ms = new linkedListMahasiswa();
        int pilih;
        do {
            ms.menu();
            System.out.print("Pilih : ");
            pilih = daffa.nextInt();
            try {
                switch (pilih) {

                    case 1:
                        System.out.println("Masukan Biodata Mahasiswa : ");
                        System.out.print("NIM    :");
                        String nim = daffa.next();
                        System.out.print("Nama   :");
                        String nama = daffa.next();
                        System.out.print("Alamat :");
                        String alamat = daffa.next();
                        ms.add(nim, nama, alamat);
                        break;
                    case 2:
                        System.out.println("Hapus Data Mahasiswa : ");
                        ms.print();
                        System.out.println("Masukan NIM Mahasiswa yang ingin di hapus : ");
                        System.out.print("NIM :");
                        String nimhapus = daffa.next();
                        ms.removeValue(nimhapus);
                        ms.print();
                        break;
                    case 3:
                        ms.print();
                        System.out.println("Cari Data Mahasiswa  : ");
                        System.out.println("Apakah anda ingin cari mahasiswa : (y/n)");
                        char pilih2 = daffa.next().charAt(0);
                        if (pilih2 == 'Y' || pilih2 == 'y') {
                            System.out.print("Masukan NIM yang ingin anda cari :");
                            String nimcari = daffa.next();
                            ms.carikey(nimcari);
                        }
                        break;

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3);
         }
}