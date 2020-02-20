/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        long start,end;
        Scanner luluk = new Scanner(System.in);
        System.out.println("========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = luluk.nextInt();
        
        Faktorial fk[] = new Faktorial[elemen];
        for(int a=0; a< elemen; a++){
            fk[a] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(a+1)+" : ");
            fk[a].nilai = luluk.nextInt();
        }
        start = System.nanoTime();
        System.out.println("========================================================");
        System.out.println("Hasil Faktorial dengan brute force");
        for(int a=0; a<elemen; a++){
            System.out.println("Faktoril dari nilai "+fk[a].nilai+" adalah "+fk[a].faktorialIBF(fk[a].nilai));
        }
        end = System.nanoTime();
        System.out.println("\nwaktu yang diperlukan selama proses : " + ((end - start) / 1000000.0) + " milisecond");
        
        start = System.nanoTime();
        System.out.println("========================================================");
        System.out.println("Hasil faktorial dengan DIvide and Conquer");
        for(int a=0; a<elemen; a++){
            System.out.println("Faktorial dari nilai "+fk[a].nilai+" adalah "+fk[a].faktorialDC(fk[a].nilai));
        }
        
        end = System.nanoTime();
        System.out.println("\nwaktu yang diperlukan selama proses : " + ((end - start) / 1000000.0) + " milisecond");
        
        
        System.out.println("========================================================");
    }
    
}
