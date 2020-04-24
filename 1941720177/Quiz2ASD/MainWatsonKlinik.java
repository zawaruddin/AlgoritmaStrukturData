/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2ASD;
import java.util.Scanner;
/**
 *
 * @author Rasyed
 */
public class MainWatsonKlinik {
     public static void menu() {
        System.out.println("Antrian Pembayaran Obat");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Hapus Pasien");
        System.out.println("3. Total Antrian");
        System.out.println("4. Cek waktu Antrian Pasien");
        System.out.println("5. Cek data pasien");
        System.out.println("6. Statistik Keluhan");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner rasyed = new Scanner(System.in);
        Scanner renaldi = new Scanner(System.in);
        int wpk[] = {7, 5, 8, 4, 3, 11, 13, 6, 5};
        String daftarKeluhan[] = {"Demam", "Flu", "Sakit Kepala", "Asma", "Diare", "Sakit Gigi", "Sakit Mata", "Keseleo", "Susah Tidur"};
        int pilih, no;

        AntrianKlinik antrian = new AntrianKlinik();
        System.out.println("==========================================");
        System.out.println("Nama : Rasyed Renaldi");
        System.out.println("NIM  : 1941720177");
        System.out.println("==========================================\n\n");

        do {
            menu();
            System.out.print("Pilihan >= ");
            pilih = rasyed.nextInt();

            AntrianKlinik data = new AntrianKlinik();
            switch (pilih) {
                case 1:
                    System.out.println("\n----------------\nPendataan Pasien");
                    System.out.print("Masukkan nama pasien: ");
                    data.nama = renaldi.nextLine();
                    System.out.println("\nDaftar keluhan\n-----------------");
                    for (int i = 0; i < 9; i++) {
                        System.out.println((i + 1) + ". " + daftarKeluhan[i]);
                    }
                    System.out.print("Pilih Keluhan: ");
                    int keluhan = rasyed.nextInt();
                    for (int i = 0; i < wpk.length; i++) {
                        if (i == (keluhan - 1)) {
                            data.keluhan = daftarKeluhan[i];
                            data.waktu = wpk[i];
                            data.no = antrian.no += 1;
                            break;
                        }
                    }
                    antrian.Enqueue(data);
                    break;
                case 2:
                    antrian.Dequeue();
                    break;
                case 3:
                    antrian.cekAntrian();
                    break;
                case 4:
                    System.out.println("\nCek antrian pasien");
                    System.out.print("Masukkan nomor pasien: ");
                    no = rasyed.nextInt();
                    antrian.cekAntrianByNo(no);
                    break;
                case 5:
                    Node tmp = antrian.Head;
                    System.out.println("Cek data pasien");
                    System.out.print("Daftar antrian: ");
                    while(tmp!=null){
                        System.out.print(tmp.data.no+" ");
                        tmp = tmp.next;
                    }
                    System.out.println("");
                    System.out.print("Masukkan nomor pasien: ");
                    no = rasyed.nextInt();
                    antrian.cekPasienByNo(no);
                    break;
                case 6:
                    System.out.println("Statistik keluhan");
                    antrian.statistikKeluhan();
                    break;
                default:
                    System.out.println("Yang anda input salah!! Aplikasi keluar");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
