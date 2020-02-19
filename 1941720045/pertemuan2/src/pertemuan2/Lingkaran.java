/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;

/**
 *
 * @author HOSNOL ARIFIN
 */
public class Lingkaran {
    public double phi,r;
public double hitungLuas(){
        return phi*r*r;
}
public double hitungKeliling(){
    return 2*phi*r;
}
    public static void main(String[] args) {
       Scanner arif=new Scanner (System.in);
         Lingkaran lkn=new Lingkaran();
         System.out.print("Masukkan phi\t: ");
         lkn.phi=arif.nextDouble();
         System.out.print("Masukkan jari-jari : ");
         lkn.r=arif.nextDouble();
         System.out.println("Luas Lingkaran\t: "+lkn.hitungLuas());
         System.out.println("Keliling Lingkaran : "+lkn.hitungKeliling());
    }
}