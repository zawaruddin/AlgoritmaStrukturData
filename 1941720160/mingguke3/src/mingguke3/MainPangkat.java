package mingguke3;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class MainPangkat {
    public static void main(String[] args){
        Scanner whyd = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("Masukkan Jumlah Elemen Yang Di hitung : ");
        int elemen = whyd.nextInt();
        
        Pangkat[] png = new Pangkat[elemen];
        
        for (int i=0; i<elemen; i++){
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = whyd.nextInt();
            System.out.println("Masukkan Nilai Pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat = whyd.nextInt();
        }
        System.out.println("============================================");
        System.out.println("Hasil Pangkat Dengan Brure Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+"adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("========================================");
        System.out.println("Hasil Pangkat dengan Devide and Conquer");
        for (int i=0; i<elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+"adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        System.out.println("==================================================");
    }
}
