package TugasJobsheet7;

import java.util.Locale;
import java.util.Scanner;

public class Tugas4Main {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Scanner arbi = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Jumlah data : ");
        int jml = arbi.nextInt();
        Tugas4 data = new Tugas4(jml);
        System.out.println(data.listPenduduk.length);
        for (int i = 0; i < jml; i++) {
            System.out.println("Penduduk ke-"+(i+1));
            System.out.print("NIK : ");
            int nik = arbi.nextInt();
            System.out.print("Nama : ");
            String nama = dhimas.nextLine();
            System.out.print("Alamat : ");
            String almt = dhimas.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jKel = dhimas.nextLine();
            System.out.println("");
            data.listPenduduk[i] = new Tugas4(nik, nama, almt, jKel);
        }
        System.out.println("");
        data.insertionSort();
        System.out.print("Masukan nik data penduduk: ");
        int cari = arbi.nextInt();
        int posisi = data.FindBinarySearch(cari, 0, jml-1);
        data.tampil(cari, posisi);
    }
}
