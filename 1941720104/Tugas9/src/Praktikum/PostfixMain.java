/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class PostfixMain {
    
    static Scanner daffa = new Scanner(System.in);
    
    public static void main(String[] args) {
        String P, Q;
        System.out.println("Masukkan ekspresi matematika: ");
        Q = daffa.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}