package ArrayObjects;

/**
 *
 * @author Aulafz
 */
import java.util.Scanner;
public class ArrayObjects {
    public int panjang;
    public int lebar;

public static void main (String[]args){
    PersegiPanjang[]ppArray = new PersegiPanjang[3];
    Scanner aula = new Scanner (System.in);
    for(int i=0; i<3;i++){
        ppArray[i] = new PersegiPanjang();
        System.out.println("Persegi panjang ke-"+i);
        System.out.print("Masukkan panjang: ");
        ppArray[i].panjang = aula.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[i].lebar = aula.nextInt();
    }
    for(int i=0; i<3; i++){
        System.out.println("Persegi Panjang ke-"+i);
        System.out.println("Panjang: "+ppArray[i].panjang+ ", lebar: "+ppArray[i].lebar);
    }
}
}