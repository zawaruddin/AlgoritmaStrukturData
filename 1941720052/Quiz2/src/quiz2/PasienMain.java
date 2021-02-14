/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class PasienMain {

    public static void menu() {
        String dataMenu[] = {
            "Menambahkan data pasien", "Menghapus daftar pasien yang sudah ditangani", "Cek Antrian",
            "Cek Antrian by No ", "Cek Pasien by No", "Rata Waktu",
            "Statistik Keluhan", "Menghapus Pasien yang Cancel","Lihat Pasien urutan pertama","Lihat Pasien urutan terahir", "Print Data Pasien", "Hapus Semua Data Pasien"
        };
        System.out.println("------------- Menu Antrian Pasien --------------");
        for (int i = 0; i < dataMenu.length; i++) {
            System.out.println((i + 1) + " " + dataMenu[i]);
        }
        System.out.println("-------------------------------------------");
    }

    public static void keluhan() {
        String dataKeluhan[] = {
            "Demam", "Flu", "Sakit Kepala", "Asma", "Diare", "Sakit Gigi", "Sakit Mata", "Keseleo", "Susah Tidur"
        };
        System.out.println("------------- Menu Keluhan Pasien --------------");
        for (int i = 0; i < dataKeluhan.length; i++) {
            System.out.println((i + 1) + " " + dataKeluhan[i]);
        }
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        Pasien data = new Pasien();
        Scanner luluk = new Scanner(System.in);
        Scanner mufida = new Scanner(System.in);
        int pilih, no = 0, keluhan, waktu;
        String nama;
        try {
            do {
                menu();
                System.out.print("Masukkan menu yang Anda pilih : ");
                pilih = luluk.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("-------------------------------");
                        System.out.print("Masukkan nama Anda : ");
                        nama = mufida.nextLine();
                        keluhan();
                        System.out.print("Masukkan pilihan keluhan Anda : ");
                        keluhan = luluk.nextInt();
                        no++;
                        waktu = data.waktuPenanganan(pilih);
                        data.Enqueue(no, nama, keluhan, waktu);
                        data.print();
                        System.out.println();
                        break;
                    case 2:
                        data.Dequeue();
                        data.print();
                        break;
                    case 3:
                        data.cekAntrian();
                        break;
                    case 4:
                        System.out.print("masukkan nomor urut : ");
                        int noUrut = luluk.nextInt();
                        data.cekAntrianByNo(noUrut);
                        break;
                    case 5:
                        System.out.print("masukkan nomor antrian data pasien : ");
                        int nomor = luluk.nextInt();
                        data.cekPasienByNo(nomor);
                        break;
                    case 6:
                        data.rataWaktu();
                        break;
                    case 7:
                        data.stastikKeluhan();
                        break;
                    case 8:
                        System.out.print("Hapus Data indeks ke-: ");
                        int index = luluk.nextInt();
                        data.remove(index);
                        break;
                    case 9 :
                        data.getFirst();
                        System.out.println();
                        break;
                    case 10 :
                        data.getLast();
                        System.out.println();
                        break;
                    case 11:
                        data.print();
                        break;
                    case 12:
                        data.clear();
                        break;
                }

            } while (pilih >= 1 && pilih <= 12);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
