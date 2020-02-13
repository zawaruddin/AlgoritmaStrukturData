package Praktikum2;
import java.util.Scanner;
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public static void main(String args[]) {
        Scanner up = new Scanner(System.in);
        
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        
        for (int i=0; i<3; i++) {
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukan Panjang: ");
            ppArray[0].panjang = up.nextInt();
            System.out.print("Masukan Lebar: ");
            ppArray[0].lebar = up.nextInt();
        }
        
        for (int i=0; i<3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        }
        
        /*ppArray [0] = new PersegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;
        
        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
        
        ppArray[2] = new PersegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;
        
        System.out.println("Persegi panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);*/
    }
}
