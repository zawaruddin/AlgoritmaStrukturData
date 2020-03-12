/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        Scanner cahyo = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama      : ");
            String nama = cahyo.nextLine();
            System.out.print("Thn masuk : ");
            int thn = daffa.nextInt();
            System.out.print("Umur      : ");
            int umur = daffa.nextInt();
            System.out.print("IPK       : ");
            double ipk = daffa.nextDouble();
            System.out.println("===================");
            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting                      : ");
        data.tampil();
        
        System.out.println("Data mahasiswa setelah sorting desc berdasar ipk    : ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data mahasiswa setelah sorti sc berdasar ipk        : ");
        data.selectionSort();
        data.tampil();
        
        System.out.println("Data setelah di Insertion Sort                      : ");
        data.insertionSort(true);
        data.tampil();
    }
}
