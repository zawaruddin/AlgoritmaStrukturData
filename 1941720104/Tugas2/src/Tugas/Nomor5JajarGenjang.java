/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;

public class Nomor5JajarGenjang {

    public int alas, tinggi;

    public int luas() {
        int luas = alas * tinggi;
        return luas;
    }

    public int keliling() {
        int keliling = 2 * (alas + tinggi);
        return keliling;
    }

    public static void main(String[] args) {
        Scanner daffa = new Scanner(System.in);
        Nomor5JajarGenjang[] jjArray = new Nomor5JajarGenjang[5];

        for (int i = 0; i < 5; i++) {
            jjArray[i] = new Nomor5JajarGenjang();
            System.out.println("Jajar genjang ke-" + (i+1));
            System.out.print("Masukkan alas     : ");
            jjArray[i].alas = daffa.nextInt();
            System.out.print("Masukkan tinggi   : ");
            jjArray[i].tinggi = daffa.nextInt();
            System.out.println("------------------");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Jajar genjang ke-" + (i+1));
            System.out.println("Luasnya adalah: " + jjArray[i].luas() + ", kelilingnya adalah: " + jjArray[i].keliling());
//            System.out.println("Luasnya adalah: " + jjArray[1].luas() + ", kelilingnya adalah: " + jjArray[1].keliling());
//            System.out.println("Luasnya adalah: " + jjArray[2].luas() + ", kelilingnya adalah: " + jjArray[2].keliling());
//            System.out.println("Luasnya adalah: " + jjArray[3].luas() + ", kelilingnya adalah: " + jjArray[3].keliling());
//            System.out.println("Luasnya adalah: " + jjArray[4].luas() + ", kelilingnya adalah: " + jjArray[4].keliling());
        }
    }
}
