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

public class Nomor1lingkaran {

    static Scanner daffa = new Scanner(System.in);

    public double PHI = 22/7;
    public static double r;

    public double hitungLuas() {
        return PHI * r * r;
    }

    public double hitungKeliling() {
        return PHI * 2 * r;
    }
    
    public static void main(String[] args) {
        Nomor1lingkaran Lingkaran = new Nomor1lingkaran();
        System.out.print("Masukkan jari-jari: ");
        r = daffa.nextDouble();
        System.out.println("Luas lingkaran sebesar: " +Lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran sebesar: " +Lingkaran.hitungKeliling());
    }
}