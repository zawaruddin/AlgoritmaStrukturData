/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan11;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class LinkedListMahasiswaMain {

    public static void menu() {
        String dataMenu[] = {
            "Add First Mahasiswa", "Add Data Mahasiswa","Add Last Data Mahasiswa",
            "Remove Data Mahasiswa","Print Data Mahasiswa", "Hapus Semua Data Mahasiswa"
        };
        System.out.println("-------------- Pilihan Menu --------------");
        for (int i = 0; i < dataMenu.length; i++) {
            System.out.println((i + 1) + " " + dataMenu[i]);
        }
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        LinkedListMahasiswa mahasiswa = new LinkedListMahasiswa();
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        int pilih, index;
        String nim, nama, alamat;
        do {
            menu();
            System.out.print("Pilih : ");
            pilih = luluk.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("--------------------------------");
                    System.out.println("        Add First Mahasiswa     ");
                    System.out.println("Masukan Biodata Mahasiswa : ");
                    System.out.print("Masukkan NIM : ");
                    nim = luluk.next();
                    System.out.print("Masukkan Nama : ");
                    nama = mufida.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    alamat = mufida.nextLine();
                    System.out.println();
                    try {
                        mahasiswa.addFirst(nim, nama, alamat);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    System.out.println("            Add Mahasiswa          ");
                    System.out.println("-----------------------------------");
                    System.out.print("Masukkan NIM : ");
                    nim = luluk.next();
                    System.out.print("Masukkan Nama : ");
                    nama = mufida.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    alamat = mufida.nextLine();
                    System.out.print("Tambahkan pada index ke-: ");
                    index = luluk.nextInt();
                    System.out.println();
                    try {
                        mahasiswa.add(nim, nama, alamat, index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("-----------------------------------");
                    System.out.println("            Add Last Mahasiswa          ");
                    System.out.println("-----------------------------------");
                    System.out.print("Masukkan NIM : ");
                    nim = luluk.next();
                    System.out.print("Masukkan Nama : ");
                    nama = mufida.nextLine();
                    System.out.print("Masukkan Alamat : ");
                    alamat = mufida.nextLine();
                    System.out.println();
                    try {
                        mahasiswa.addLast(nim, nama, alamat);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("------------------------------------");
                    System.out.println("                Remove              ");
                    System.out.println("------------------------------------");
                    System.out.println("Hapus data ke-: ");
                    index = luluk.nextInt();
                    try {
                        mahasiswa.remove(index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    mahasiswa.print();
                    break;
                case 6:
                    mahasiswa.clear();
                    break;

            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
