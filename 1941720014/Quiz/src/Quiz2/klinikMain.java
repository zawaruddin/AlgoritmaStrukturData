/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class klinikMain {
    public static void menu() {
        System.out.println("Pilihan menu :");
        System.out.println("1. Tambah Data Pasien");
        System.out.println("2. Hapus Data Pasien ");
        System.out.println("3. Cek Antrian");
        System.out.println("4. Cek Pasien");
        System.out.println("5. Rata-rata Waktu");
        System.out.println("6. Statistik Keluhan");
        System.out.println("7. Cetak Daftar Antrian");
        System.out.println("8. Keluar");
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        System.out.println("Nama    : Aula Faridatuz Zahro'");
        System.out.println("NIM     : 1941720014");
        System.out.println("===================================");
        klinik data = new klinik ();
        int pilih, submenu, waktu = 0, antrian = 0,keluhan;
        String nama;
        Scanner aula = new Scanner (System.in);
        Scanner farida = new Scanner (System.in);
        try {
            do {
            menu();
            System.out.print("Masukkan pilihan anda (1/2/3/4/5/6/7/8) : ");
            pilih = aula.nextInt();
            
            switch (pilih) {
                case 1 :
                    antrian++;
                    System.out.print("Masukkan Nama Pasien : ");
                    nama = farida.nextLine();
                    System.out.println("Nomor Pilihan\t\tKeluhan\t\tWaktu Penanganan (menit): ");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("\t1.\t\tDemam\t\t\t7");
                    System.out.println("\t2.\t\tFlu\t\t\t5");
                    System.out.println("\t3.\t\tSakit Kepala\t\t8");
                    System.out.println("\t4.\t\tAsma\t\t\t4");
                    System.out.println("\t5.\t\tDiare\t\t\t3");
                    System.out.println("\t6.\t\tSakit Gigi\t\t11");
                    System.out.println("\t7.\t\tSakit Mata\t\t13");
                    System.out.println("\t8.\t\tKeseleo\t\t\t6");
                    System.out.println("\t9.\t\tSusah Tidur\t\t5");
                    System.out.print("Masukkan Keluhan (1-9 pilih satu): ");
                    keluhan = aula.nextInt();
                    System.out.println("--------------------------------------------------------");
                    switch (keluhan) {
                        case 1 :
                            waktu = 7;
                            break;
                        case 2 :
                            waktu = 5;
                            break;
                        case 3 : 
                            waktu = 8;
                            break;
                        case 4 :
                            waktu = 4;
                            break;
                        case 5 :
                            waktu = 3;
                            break;
                        case 6 :
                            waktu = 11;
                            break;
                        case 7 :
                            waktu = 13;
                            break;
                        case 8 :
                            waktu = 6;
                            break;
                        case 9 :
                            waktu = 5;
                            break;
                        default :
                            System.out.println("Keluhan tidak ada pada daftar");
                            break;
                    }
                    data.enqueue(antrian, nama, keluhan, waktu);
                    data.print();
                    break;
                case 2 :
                    data.dequeue();
                    data.print();
                    break;
                case 3 :
                    System.out.println("Submenu : ");
                    System.out.println("1. Lihat total antrian dan total waktu tunggu ");
                    System.out.println("2. Jumlah antrian dan waktu tunggu dari nomor urut tertentu ");
                    System.out.print("Masukkan pilihan submenu (1/2) : ");
                    submenu = aula.nextInt();
                    switch(submenu) {
                        case 1 :
                            data.cekAntrian();
                            break;
                        case 2 :
                            System.out.print("Masukkan nomor antrian : ");
                            antrian = aula.nextInt();
                            data.cekAntrianByNo(antrian);
                            break;
                    }
                    break;
                case 4 :
                    System.out.print("Masukkan nomor antrian : ");
                    antrian = aula.nextInt();
                    System.out.println("**************************");
                    data.cariPasienByNo(antrian);
                    break;
                case 5 :
                    data.rataWaktu();
                    break;
                case 6 :
                    data.statistikKeluhan();
                    break;
                case 7 :
                    data.print();
                    break;
                case 8 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan yang anda masukkan tidak tersedia");
               
            }
            } while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

