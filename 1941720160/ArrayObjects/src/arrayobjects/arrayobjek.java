package arrayobjects;
import java.util.Scanner;
/**
 *
 * @author khoirul
 */
public class arrayobjek {
    public static void main(String[] args){
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner irl = new Scanner(System.in);
        
        for(int i=0; i<3; i++)
        {
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" +i);
            System.out.println("Masukkan Panjang : ");
            ppArray[0].panjang = irl.nextInt();
            System.out.println("Masukkan Lebar : ");
            ppArray[0].lebar = irl.nextInt();
        }
        for(int i=0; i<3; i++)
        {
            System.out.println("Persegi Panjang Ke-" +i);
            System.out.println("Panjang: " +ppArray[0].panjang +", lebar: " + ppArray[0].lebar);
        }
    }
}
