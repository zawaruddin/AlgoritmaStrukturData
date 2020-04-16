/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class tugas3Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String P, Q, eksp = "";
        System.out.print("Masukkan ekspresi matematika: ");
        Q = src.nextLine();
        for (int i = (Q.length() - 1); i >= 0; i--) {
            eksp = eksp + Q.charAt(i);
        }
        eksp = eksp.trim();
        eksp = eksp + "(";

        int total = eksp.length();

        tugas3 pref = new tugas3(total);
        P = pref.konversi(eksp);
        System.out.println("Hasil konversi Infix ke Prefix: " + new StringBuffer(P).reverse());
    }

}
