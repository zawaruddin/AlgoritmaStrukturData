/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class NasabahMain {

    public static void menu() {
        System.out.println("Menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. PeekRear");
        System.out.println("6. PeekPosition");
        System.out.println("7. PrintNasabah");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        System.out.print("Masukkan banyak Nasabah: ");
        int jumlah = luluk.nextInt();
        QueueNasabah Q = new QueueNasabah(jumlah);
        int pilih;
        do {
            menu();
            pilih = luluk.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nomor Rekening baru: ");
                    int dataMasuk = luluk.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.peekRear();
                    break;

                case 6:
                    System.out.print("Masukkan Nama Nasabah Yang Anda Cari: ");
                    String cari = luluk.nextLine();
                    Q.peekPosition(cari);
                    break;

                case 7:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int antri = luluk.nextInt();
                    Q.printNasabah(antri);
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }

}
