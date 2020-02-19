package TugasJobsheet2;
/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class TugasLingkaranMain {
    public static void main(String[] Args) {
        double r;
        double PHI = 3.14; 
        TugasLingkaran lgArray = new TugasLingkaran();
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan Jari2 Lingkaran : ");
        r = faris.nextDouble();
        lgArray = new TugasLingkaran(PHI, r,r );
            System.out.println("Luas Segitiga " + lgArray.HitungLuas());
            System.out.println("Keliling Segitiga " + lgArray.HitungKeliling());
    }
}