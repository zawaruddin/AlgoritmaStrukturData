package minggu3;

import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("Pilih metode");
        System.out.println("1. Brute Force\n2. Divide and Conquer");
        System.out.print("Pilihan: [1/2] |> ");
        int pilihan = dhimas.nextInt();
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = dhimas.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + ": ");
            png[i].nilai = dhimas.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            png[i].pangkat = dhimas.nextInt();
        }
        switch (pilihan) {
            case 1:
                System.out.println("=====================================================");
                System.out.println("Hasil pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("=====================================================");
                System.out.println("Hasil pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
        }
    }
}
