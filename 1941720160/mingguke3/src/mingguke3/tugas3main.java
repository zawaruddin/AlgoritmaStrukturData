package mingguke3;
import java.util.Scanner;
/**
 *
 * @author khoirul
 */
public class tugas3main {
    public static void main(String[] args) {
        Scanner irul = new Scanner(System.in);
        Scanner why = new Scanner(System.in);
        int elemen;
        double total = 0;
        double ratarata;

        System.out.print("Masukkan jumlah elemen yang akan diinput : ");
        elemen = why.nextInt();
        tugas3 na = new tugas3();
        tugas3 [] main = new tugas3[elemen];

        for (int i = 0; i < elemen; i++) {
            main[i] = new tugas3();
            System.out.print("Masukkan Nama Mahasiswa ke-" + (i + 1) + " : ");
            main[i].namaMhs = irul.nextLine();
            System.out.print("Masukkan Nilai Tugas Mahasiswa \t: ");
            main[i].nilaiTugas = why.nextInt();
            System.out.print("Masukkan Nilai Kuis Mahasiswa \t: ");
            main[i].nilaiKuis = why.nextInt();
            System.out.print("Masukkan Nilai UTS Mahasiswa \t: ");
            main[i].nilaiUTS = why.nextInt();
            System.out.print("Masukkan Nilai UAS Mahasiswa \t: ");
            main[i].nilaiUAS = why.nextInt();
        }

        for (int i = 0; i < elemen; i++) {
            System.out.println("==============================================================");
            System.out.println("Mahasiswa dengan Nama \t: " + main[i].namaMhs);
            System.out.println("Memiliki Nilai Total  \t: " + main[i].hitungTotal());
            total = total + main[i].hitungTotal();
        }

        ratarata = total/elemen;
        System.out.println("==============================================================");
        System.out.println("==============================================================");
        System.out.println("Rata - rata seluruh Mahasiswa : " + ratarata);

    }
}
