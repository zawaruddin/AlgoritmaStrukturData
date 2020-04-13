/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas10;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class Nomor1Main {
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
        Scanner daffa = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = daffa.nextInt();
        Nomor1 Q = new Nomor1(n);
        int pilih;
        do {
            menu();
            pilih = daffa.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = daffa.nextInt();
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
                    System.out.print("Masukkan Posisi Data Yang Anda Cari: ");
                    int cari = daffa.nextInt();
                    Q.peekPosition(cari);
                    break;
            
            case 7:
                    System.out.print("Data pada Antrian: ");
                    int antri = daffa.nextInt();
                    Q.peekAt(antri);
                    break;
            }
            
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih ==7);
    }
}
