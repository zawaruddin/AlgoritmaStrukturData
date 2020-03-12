/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;
import java.util.Scanner;
/**
 *
 * @author HOSNOL ARIFIN
 */
public class Faktorial {
public int nilai;

public int faktorialBF(int n){
    int fakto = 1;
   for(int i=1;i<=n;i++){
   fakto=fakto*i;
   }
    return fakto;
  
}
    public int faktorialDC(int n){
        if(n==1){
            return 1;
        }
        else{
            int fakto = n*faktorialDC(n-1);
            return fakto;
        }
    }
    public static void main(String[] args) {
    Scanner arif=new Scanner (System.in);
    System.out.println("============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen=arif.nextInt();
        Faktorial[] fk=new Faktorial[elemen];
        for(int i=0;i<elemen;i++){
           fk[i] = new Faktorial();
           System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
           fk[i].nilai=arif.nextInt();
        }
        System.out.println("============================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        long start = System.nanoTime();
        for(int i = 0;i < elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        long end =System.nanoTime();
        System.out.println("\nWaktu yang diperlukan selama proses adalah " + ((end - start) / 1000000000.0) + " detik");
        System.out.println("============================================");
        System.out.println("Hasil faktorial dengan Devite and Conquer");
        long mulai = System.nanoTime();
        for(int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        long akhiri =System.nanoTime();
        System.out.println("\nWaktu yang diperlukan selama proses adalah " + ((akhiri-mulai) / 1000000000.0) + " detik");
    }
}