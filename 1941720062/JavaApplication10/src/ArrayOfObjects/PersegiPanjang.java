package ArrayOfObjects;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class PersegiPanjang {

    public int panjang;
    public int lebar;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
        for(int i = 0 ; i<3 ; i++){
        ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi Panjang Ke-"+i);
            System.out.print("Masukkan Panjang: ");
            ppArray[0].panjang = faris.nextInt();
            System.out.println("Masukkan Lebar: ");
            ppArray[0].lebar = faris.nextInt();
        }
        
        for(int i = 0 ; i<3 ; i++){
            System.out.println("Persegi Panjang Ke-"+i);
            System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        }
//        ppArray[0].panjang = 110;
//        ppArray[0].lebar = 30;
//
//        ppArray[1] = new PersegiPanjang();
//        ppArray[1].panjang = 80;
//        ppArray[1].lebar = 40;
//
//        ppArray[2] = new PersegiPanjang();
//        ppArray[2].panjang = 100;
//        ppArray[1].lebar = 20;

//        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
//        System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
//        System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);

    }
}
