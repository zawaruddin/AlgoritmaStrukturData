package TugasJobsheet2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
import java.util.Arrays;

public class TugasTanahMain2 {

    static int x,y=0;
    static double urut,terluas=0;
    static String tampilan;

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Tanah = ");
        x = faris.nextInt();
        TugasTanah[] tnhArray = new TugasTanah[x];
        double panjang, lebar;
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
        for (int x = 0; x < tnhArray.length; x++) {
            if(tnhArray[x].HitungLuas()> terluas){
                terluas = tnhArray[x].HitungLuas();
                y=x ;
            }
        }
        System.out.println("Tanah Paling Luas Tanah Ke-"+(y+1));
    
}
}