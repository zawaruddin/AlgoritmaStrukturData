/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasQueue;

/**
 *
 * @author Rasyedrenaldi
 */
import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. PeekRear");
        System.out.println("6. PeekPosition");
        System.out.println("7. PeekAt");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian: ");
        var n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    var dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;

                case 2:
                    var dataKeluar = Q.Dequeue();
                    if (dataKeluar == 0) {
                    } else {
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
                    System.out.print("Masukkan Posisi Data Yang Anda Cari: ");
                    int cari = sc.nextInt();
                    Q.peekPosition(cari);
                    break;

                case 7:
                    System.out.print("Data pada Antrian: ");
                    int antri = sc.nextInt();
                    Q.peekAt(antri);
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
