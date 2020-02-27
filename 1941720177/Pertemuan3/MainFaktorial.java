/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;

public class MainFaktorial {

    public static void main(String[] args) {
        Scanner rasyed = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = rasyed.nextInt();
        
        Faktorial[] fk =new Faktorial[elemen];
        for(int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = rasyed.nextInt();
        }
        System.out.println("===================================================");
            System.out.println("Hasil Faktorial dengan Brute Force");
            for(int i = 0; i < elemen; i++){
                System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));      
            }
            System.out.println("==============================================");
            System.out.println("Hasil Faktorial dengan Divide and Conquer");
            for(int i = 0; i < elemen; i++){
                System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
            }
            System.out.println("==============================================");
    }
}
