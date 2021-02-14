package TestSearching;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class SearchingMain {

    public static void main(String[] args) {
//        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        Scanner aula = new Scanner(System.in);
        System.out.print("Masukkan banyaknya angka : ");
        int banyak = aula.nextInt();
        int data[] = new int[banyak];
        for (int i = 0; i < banyak; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            data[i] = aula.nextInt();
        }
        Searching pencarian = new Searching(data, banyak);

        System.out.print("Masukkan angka yang dicari : ");
        int cari = aula.nextInt();

        System.out.println("Isi Array :");
        pencarian.TampilData();

//        int cari = 30;
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);

        pencarian.TampilPosisi(cari, posisi);
        System.out.println("====================================");
        System.out.println("Menggunakan Binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);
        pencarian.TampilPosisi(cari, posisi);
    }

}
