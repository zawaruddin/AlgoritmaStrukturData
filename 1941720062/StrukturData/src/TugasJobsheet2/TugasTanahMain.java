package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class TugasTanahMain {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Tanah = ");
        int x = faris.nextInt();
        double panjang, lebar;
        TugasTanah[] tnhArray = new TugasTanah[x];
        for (int i = 0; i < tnhArray.length; i++) {
            System.out.println("Tanah Ke-" + (i + 1) + "");
            System.out.print("Masukkan Panjang = ");
            panjang = faris.nextDouble();
            System.out.print("Masukan Lebar = ");
            lebar = faris.nextDouble();
            tnhArray[i] = new TugasTanah(panjang, lebar);
        }
        for (int i = 0; i < tnhArray.length; i++) {
            System.out.println("Luas Tanah " + (i + 1) + ": " + tnhArray[i].HitungLuas());
        }
    }
}