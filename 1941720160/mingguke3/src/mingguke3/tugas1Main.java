package mingguke3;



import java.util.Scanner;
/**
 *
 * @author khoirul
 */
public class tugas1Main {
    public static void main(String[] args) {
        Scanner irl = new Scanner(System.in);
        Scanner why = new Scanner(System.in);

        tugas1 na = new tugas1();

        System.out.print("Masukkan Nama Mahasiswa : ");
        na.namaMhs = irl.nextLine();
        System.out.print("Masukkan Nilai Tugas Mahasiswa \t: ");
        na.nilaiTugas = why.nextInt();
        System.out.print("Masukkan Nilai Kuis Mahasiswa \t: ");
        na.nilaiKuis = why.nextInt();
        System.out.print("Masukkan Nilai UTS Mahasiswa \t: ");
        na.nilaiUTS = why.nextInt();
        System.out.print("Masukkan Nilai UAS Mahasiswa \t: ");
        na.nilaiUAS= why.nextInt();

        System.out.println("==============================================================");
        System.out.println("Mahasiswa dengan Nama \t: "+na.namaMhs);
        System.out.println("Memiliki Nilai Total  \t: "+na.hitungTotal());

    }
}

