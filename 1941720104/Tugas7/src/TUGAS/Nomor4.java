/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Locale;
import java.util.Scanner;

public class Nomor4 {

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        Scanner cahyo = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Jumlah data : ");
        int jml = cahyo.nextInt();
        Nomor4 data = new Nomor4(jml);
        System.out.println(data.listPenduduk.length);
        for (int i = 0; i < jml; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.print("NIK : ");
            int nik = cahyo.nextInt();
            System.out.print("Nama : ");
            String nama = daffa.nextLine();
            System.out.print("Alamat : ");
            String almt = daffa.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jKel = daffa.nextLine();
            System.out.println("");
            data.listPenduduk[i] = new Nomor4(nik, nama, almt, jKel);
        }
        System.out.println("");
        data.insertionSort();
        System.out.print("Masukan nik data penduduk: ");
        int cari = cahyo.nextInt();
        int posisi = data.FindBinarySearch(cari, 0, jml - 1);
        data.tampil(cari, posisi);
    }

    String nama, alamat, jKel;
    int nik;
    Nomor4 listPenduduk[];

    Nomor4(int l) {
        listPenduduk = new Nomor4[l];
    }

    Nomor4(int nik, String n, String a, String j) {
        this.nik = nik;
        nama = n;
        alamat = a;
        jKel = j;
    }

    void insertionSort() {
        int i, j;
        for (i = 1; i < listPenduduk.length; i++) {
            Nomor4 temp[] = new Nomor4[listPenduduk.length];
            temp[i] = listPenduduk[i];
            j = i;
            while ((j > 0) && (listPenduduk[j - 1].nik > temp[i].nik)) {
                listPenduduk[j] = listPenduduk[j - 1];
                j--;
            }
            listPenduduk[j] = temp[i];
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listPenduduk[mid].nik == cari) {
                return (mid);
            } else if (listPenduduk[mid].nik > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void tampil(int x, int pos) {
        if (pos != -1) {
            System.out.println("data NIK        : " + x + " ditemukan pada indeks " + pos);
            System.out.println("NIK             : " + listPenduduk[pos].nik);
            System.out.println("Nama            : " + listPenduduk[pos].nama);
            System.out.println("Alamat          : " + listPenduduk[pos].alamat);
            System.out.println("Jenis Kelamin   : " + listPenduduk[pos].jKel);
            System.out.println("-------------------");
        } else {
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
}
