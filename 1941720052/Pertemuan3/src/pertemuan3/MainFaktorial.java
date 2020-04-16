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
        long start,end;                                                                                                 //~     
        Scanner luluk = new Scanner(System.in);                                                                         //O(1)
        System.out.println("========================================================");                                 //O(1)
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");                                              //O(1)
        int elemen = luluk.nextInt();                                                                                   //O(1)
        
        Faktorial fk[] = new Faktorial[elemen];                                                                         //O(1)
        for(int a=0; a< elemen; a++){                                                                                   //O(n)
            fk[a] = new Faktorial();                                                                                    //O(1)
            System.out.print("Masukkan nilai data ke-"+(a+1)+" : ");                                                    //O(1)
            fk[a].nilai = luluk.nextInt();                                                                              //O(1)
        }
        start = System.nanoTime();                                                                                      //O(1)
        System.out.println("========================================================");                                 //O(1)
        System.out.println("Hasil Faktorial dengan brute force");                                                       //O(1)
        for(int a=0; a<elemen; a++){                                                                                    //O(n)
            System.out.println("Faktoril dari nilai "+fk[a].nilai+" adalah "+fk[a].faktorialIBF(fk[a].nilai));          //O(1)
        }
        end = System.nanoTime();                                                                                        //O(1)
        System.out.println("\nwaktu yang diperlukan selama proses : " + ((end - start) / 1000000.0) + " milisecond");   //O(1)  
                
        start = System.nanoTime();                                                                                      //O(1)
        System.out.println("========================================================");                                 //O(1)
        System.out.println("Hasil faktorial dengan Divide and Conquer");                                                //O(1)
        for(int a=0; a<elemen; a++){                                                                                    //O(n)
            System.out.println("Faktorial dari nilai "+fk[a].nilai+" adalah "+fk[a].faktorialDC(fk[a].nilai));          //O(1)
        }
        
        end = System.nanoTime();                                                                                        //O(1)
        System.out.println("\nwaktu yang diperlukan selama proses : " + ((end - start) / 1000000.0) + " milisecond");   //O(1)
        
        
        System.out.println("========================================================");                                 //O(1)
    }
    
}
