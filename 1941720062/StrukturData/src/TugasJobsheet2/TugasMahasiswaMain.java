package TugasJobsheet2;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasMahasiswaMain {
      public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa = ");
        int x = faris.nextInt();
        double panjang, lebar;
        TugasMahasiswa [] mhsArray = new TugasMahasiswa[x];
        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("Mahasiswa Ke-" + (i + 1) + "");
            System.out.print("Masukkan Nilai 1 = ");
            panjang = faris.nextDouble();
            System.out.print("Masukan Nilai 2 = ");
            lebar = faris.nextDouble();
            mhsArray[i] = new TugasMahasiswa(panjang, lebar);
        }
        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("Nilai Terbaik Mahasiswa Ke- " + (i + 1) + " : " + mhsArray[i].perbandingan());
        }
    }
}