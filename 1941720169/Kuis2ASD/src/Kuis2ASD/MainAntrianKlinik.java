package Kuis2ASD;

import java.util.Scanner;

/**
 *
 * @author dhimas
 */
public class MainAntrianKlinik {

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
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner(System.in);
        int wpk[] = {7, 5, 8, 4, 3, 11, 13, 6, 5};
        String daftarKeluhan[] = {"Demam", "Flu", "Sakit Kepala", "Asma", "Diare", "Sakit Gigi", "Sakit Mata", "Keseleo", "Susah Tidur"};
        int pilih, no;

        AntrianKlinik antrian = new AntrianKlinik();
        System.out.println("==========================================");
        System.out.println("Dhimas Arbi Sukma Himawan\t1941720169");
        System.out.println("==========================================\n\n");

        do {
            menu();
            System.out.print("Pilihan |>");
            pilih = dhimas.nextInt();

            AntrianKlinik data = new AntrianKlinik();
            switch (pilih) {
                case 1:
                    System.out.println("\n----------------\nPendataan Pasien");
                    System.out.print("Masukkan nama pasien: ");
                    data.nama = arbi.nextLine();
                    System.out.println("\nDaftar keluhan\n-----------------");
                    for (int i = 0; i < 9; i++) {
                        System.out.println((i + 1) + ". " + daftarKeluhan[i]);
                    }
                    System.out.print("Pilih Keluhan: ");
                    int keluhan = dhimas.nextInt();
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
                    System.out.println("\nCek Antrian Pasien");
                    System.out.print("Masukkan nomor pasien: ");
                    no = dhimas.nextInt();
                    antrian.cekAntrianByNo(no);
                    break;
                case 5:
                    Node tmp = antrian.Head;
                    System.out.println("Cek Data Pasien");
                    System.out.print("Daftar Antrian: ");
                    while(tmp!=null){
                        System.out.print(tmp.data.no+" ");
                        tmp = tmp.next;
                    }
                    System.out.println("");
                    System.out.print("Masukkan nomor pasien: ");
                    no = dhimas.nextInt();
                    antrian.cekPasienByNo(no);
                    break;
                case 6:
                    System.out.println("Statistik Keluhan");
                    antrian.statistikKeluhan();
                    break;
                default:
                    System.out.println("Inputan salah!! Aplikasi keluar");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
