/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class PrefixMain {
    public static void main(String[] args) {
        Scanner luluk = new Scanner(System.in);
        String P, Q, eksp = "";
        System.out.println("Masukkan ekspresi matematika: ");
        Q = luluk.nextLine();
        for (int i = (Q.length() - 1); i >= 0; i--) {
            eksp = eksp + Q.charAt(i);
        }
        eksp = eksp.trim();
        eksp = eksp + "(";

        int total = eksp.length();

        Prefix pref = new Prefix(total);
        P = pref.konversi(eksp);
        System.out.println("Prefix: " + new StringBuffer(P).reverse());
    }

    
}
