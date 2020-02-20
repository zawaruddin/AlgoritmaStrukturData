/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ananda
 */
import java.util.Scanner;
public class LingkaranMain {
    public static void main(String[] args) {
        Scanner ananda = new Scanner(System.in);
        Lingkaran A = new Lingkaran();        
        System.out.println("Masukkan jari-jari : ");
        A.r=ananda.nextInt();
        A.PHI = 3.14;
        System.out.println("Luas Lingkaran jika r: "+A.r+" Adalah "+A.hitungLuas());
        System.out.println("Luas Lingkaran jika r: "+A.r+"Adalah"+A.hitungKeliling());        
    }
}
