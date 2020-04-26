/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2semester2;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class quiz2Semester2 {
public static final ArrayList<dataKeluhan> list = new ArrayList<dataKeluhan>();
    static Scanner daffa = new Scanner(System.in);

    public static void main(String[] args) {
        daffa.useDelimiter("\n");
        linkedQueue lq = new linkedQueue();

        int pilihan;

        do {
            System.out.println("List Keluhan");
            System.out.println("============================================");
            add();
            System.out.println("============================================");
            System.out.println("\n");

            System.out.println("--------------------------------");
            System.out.println("Menu");
            System.out.println("--------------------------------");
            menu();
            System.out.println("--------------------------------");
            System.out.print("Masukkan Pilihan: ");
            pilihan = daffa.nextInt();
            System.out.println("--------------------------------");

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama\t\t: ");
                    String nama = daffa.next();
                    System.out.print("Masukkan Keluhan [1-9]\t: ");
                    int keluhan = daffa.nextInt();

                    if (keluhan < 1 || keluhan > 9) {
                        System.out.println("Masukkan input yang benar");
                    } else {
                        lq.insert(new dataPasien(lq.getLastNo() + 1, nama, keluhan, list.get((keluhan - 1)).getWaktu()));

                        System.out.println("----------------------------------");
                        lq.print();
                        System.out.println("----------------------------------");

                        System.out.println("\n");
                    }
                    list.clear();
                    break;
                case 2:
                    try {
                        System.out.println("Pasien tertangani: ");
                        lq.remove();
                        System.out.println("--------------------------------");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    list.clear();
                    break;
                case 3:
                    lq.print();
                    System.out.println("Total antrian: " + lq.getSize());
                    System.out.println("Total perkiraan waktu: " + lq.getTotalWaktu());
                    System.out.println("--------------------------------");
                    list.clear();
                    break;
                case 4:
                    System.out.print("Masukkan no antrian: ");
                    int no = daffa.nextInt();
                    System.out.println("--------------------------------");
                    System.out.println("Total antrian: " + lq.getAntri(no));
                    System.out.println("Total perkiraan waktu: " + lq.getWaktuByNum(no));
                    list.clear();
                    break;
                case 5:
                    System.out.print("Masukkan no antrian: ");
                    no = daffa.nextInt();
                    System.out.println("--------------------------------");

                    System.out.println("Hasil Pencarian: \n--------------------------------");
                    System.out.println(lq.getInfo(no) + "");
                    System.out.println("--------------------------------");

                    list.clear();
                    break;
                case 6:
                    System.out.println("Rata-rata waktu penanganan" + lq.getRata());
                    list.clear();
                    break;
                case 7:
                    lq.infoKeluhan();
                    System.out.println("--------------------------------");
                    list.clear();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf inputan tidak sesuai");
            }

        } while (pilihan >= 0 || pilihan <= 7);
    }

    public static void add() {

        dataKeluhan a = new dataKeluhan(1, "Demam", 7);
        dataKeluhan b = new dataKeluhan(2, "Flu", 5);
        dataKeluhan c = new dataKeluhan(3, "Sakit Kepala", 8);
        dataKeluhan d = new dataKeluhan(4, "Asma", 4);
        dataKeluhan e = new dataKeluhan(5, "Diare", 3);
        dataKeluhan f = new dataKeluhan(6, "Sakit Gigi", 11);
        dataKeluhan g = new dataKeluhan(7, "Sakit Mata", 13);
        dataKeluhan h = new dataKeluhan(8, "Kesleo", 16);
        dataKeluhan i = new dataKeluhan(9, "Susah Tidur", 5);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        list.add(h);
        list.add(i);

        String format = "%1$-10s|%2$-20s|%3$-10s\n";
        System.out.format(format, "No Pilihan", "Keluhan", "Waktu(Menit)");

        list.forEach((l) -> {
            System.out.format(String.format(format, l.getNo_pilihan(), l.getKeluhan(), l.getWaktu()));
        });
    }

    public static void menu() {
        System.out.println("1 = Enqueue");
        System.out.println("2 = Dequeue");
        System.out.println("3 = Cek Antrian");
        System.out.println("4 = Cek Antrian (no)");
        System.out.println("5 = Cek Pasien (no)");
        System.out.println("6 = Rata-rata Waktu");
        System.out.println("7 = Statistik Keluhan");
        System.out.println("0 = Keluar");
    }
}