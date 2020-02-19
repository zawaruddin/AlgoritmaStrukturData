package TugasJobsheet2;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasJajarGenjangMain {

    public static void main(String[] Args) {
        TugasJajarGenjang[] jgArray = new TugasJajarGenjang[5];
        Scanner faris = new Scanner(System.in);
        for (int j = 0; j < 5; j++) {
            System.out.print("Masukkan Panjang Trapesium Ke-" + (j + 1) + " = ");
            double PT = faris.nextDouble();
            System.out.print("Masukkan Tinggi Trapesium Ke-" + (j + 1) + " = ");
            double T = faris.nextDouble();
            System.out.print("Masukkan Sisi Miring Trapesium Ke-" + (j + 1) + " = ");
            double SM = faris.nextDouble();
            jgArray[j] = new TugasJajarGenjang(PT, T, SM);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("=================================================================");
            System.out.println("Luas Jajar Genjang ke " + (i + 1) + ": " + jgArray[i].HitungLuas());
            System.out.println("Keliling Jajar Genjang ke " + (i + 1) + ": " + jgArray[i].HitungKeliling());
        }
    }
}
