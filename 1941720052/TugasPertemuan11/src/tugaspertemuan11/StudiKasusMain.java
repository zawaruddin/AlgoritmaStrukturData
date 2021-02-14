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
import java.util.Scanner;

public class StudiKasusMain {

    public static void menu() {
        String dataMenu[] = {
            "Add First Data Pasien", "Add Data Pasien", "Add Last Data Pasien",
            "GetFirst Data Pasien", "GetLast Data Pasien", "Get Data Pasien",
            "Remove Data Pasien", "Print Data Pasien", "Hapus Semua Data Pasien"
        };
        System.out.println("------------- Menu Antrian Pasien --------------");
        for (int i = 0; i < dataMenu.length; i++) {
            System.out.println((i + 1) + " " + dataMenu[i]);
        }
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        LinkedLists2 pasien = new LinkedLists2();

        int noAntrian, pilih, index;
        String nama;
        do {
            menu();
            System.out.print("Masukkan pilihan Anda : ");
            pilih = luluk.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-------------------------------");
                    System.out.print("Masukkan nomor Antrian : ");
                    noAntrian = luluk.nextInt();
                    System.out.print("Masukkan nama : ");
                    nama = mufida.nextLine();
                    try {
                        pasien.addFirst(noAntrian, nama);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    System.out.print("Masukkan nomor Antrian : ");
                    noAntrian = luluk.nextInt();
                    System.out.print("Masukkan nama : ");
                    nama = mufida.nextLine();
                    System.out.print("Tambahkan pada index ke-: ");
                    index = luluk.nextInt();
                    try {
                        pasien.add(noAntrian, nama, index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("-------------------------------");
                    System.out.print("Masukkan nomor Antrian : ");
                    noAntrian = luluk.nextInt();
                    System.out.print("Masukkan nama : ");
                    nama = mufida.nextLine();
                    try {
                        pasien.addLast(noAntrian, nama);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 4:
                    try {
                        pasien.getFirst();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 5:
                    try {
                        pasien.getLast();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Cari data ke-: ");
                    index = luluk.nextInt();
                    try {
                        pasien.get(index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Hapus Data ke-: ");
                    index = luluk.nextInt();
                    try {
                        pasien.remove(index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;
                case 8:
                    pasien.print();
                case 9:
                    pasien.clear();

            }
        } while (pilih >= 1 && pilih <= 9);
    }
}
