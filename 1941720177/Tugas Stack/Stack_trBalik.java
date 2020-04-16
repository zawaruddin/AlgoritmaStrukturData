/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

import java.util.Scanner;

/**
 *
 * @author Rasyed
 */
public class Stack_trBalik {

    public static void main(String[] args) {
        System.out.print("Masukan Kalimat = ");
        Scanner src = new Scanner(System.in);
        String kalimat = src.nextLine().trim();
        String[] polinema = kalimat.split(" ");

        StringBuilder buffer = new StringBuilder();
        for (int i = polinema.length; i > 0; i--) {
            buffer.append(polinema[i - 1]).append(" ");
        }

        System.out.println("Kalimat dibalik = " + buffer.toString());
    }   
}
