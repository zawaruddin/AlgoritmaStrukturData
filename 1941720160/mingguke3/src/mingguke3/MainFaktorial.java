package mingguke3;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class MainFaktorial {
    public static void main(String[] args){
    Scanner whyd = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("Masukkan Jumlah Elemen Yang Ingin Di Hitung");
        int elemen = whyd.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for (int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.println("Masukkan Nilai Data Ke-"+(i+1)+" : ");
            fk[i].nilai = whyd.nextInt();
        }
       
        double Starttime = System.currentTimeMillis();
        System.out.println("===================================================");
        System.out.println("Hasil Faktorial Dengan Brute Force");
        
        for (int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+"adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        double endTime = System.currentTimeMillis();
        double totalTime = (endTime-Starttime)/1000;
        System.out.println("Execution Time : "+String.valueOf(totalTime)+" Second");
        System.out.println("==================================================");
        
        Starttime = System.currentTimeMillis();
        System.out.println("Hasil Faktorial dengan Devide and Conquer");
        for (int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        endTime = System.currentTimeMillis();
        totalTime = (endTime-Starttime)/1000;
        System.out.println("Execution Time : "+String.valueOf(totalTime)+" Second");
        System.out.println("==============================================");
    }
}
