import java.util.Scanner;
public class MainPangkat {
public static void main(String[] args) {
   Scanner retno = new Scanner(System.in);
   
   System.out.println("======================================");
   System.out.print("Maskkan jumlah elemen yang ingin dhitung : ");
   int elemen = retno.nextInt();
   
   Pangkat [] png = new Pangkat [elemen];
    for (int i = 0; i < elemen; i++) {
        png [i] = new Pangkat();
        System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
        png [i].nilai = retno.nextInt();
        System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
        png[i].pangkat = retno.nextInt();
    }
    System.out.println("=====================================");
    System.out.println("Hasil Pangkat dengan Brute Force");
    for (int i = 0; i <elemen; i++) {
        System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+ png[i].pangkatBF(png[i].nilai,png[i].pangkat));      
    }
    System.out.println("=====================================");
    System.out.println("Hasil Pangkat dengan Divide and Conquer");
    for (int i = 0; i <elemen; i++) {
        System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+ png[i].pangkatDC(png[i].nilai,png[i].pangkat));      
    }
    System.out.println("=====================================");
}
    
}
