/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp2;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class LingkarangMain {

    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        Lingkaran lngkrn = new Lingkaran();
        System.out.print("Masukkan jari-jari lingkaran: ");
        lngkrn.r = luluk.nextDouble();
        
        System.out.println("Luas lingkaran: " + lngkrn.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lngkrn.hitungKeliling());
    }

}
