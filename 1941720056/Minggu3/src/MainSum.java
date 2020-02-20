import java.util.Locale;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
    Scanner retno = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("=================================================================");
    System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9 ): ");
    
        System.out.print ("Masukkan jumlah perusahaan : ");
        int jumlah = retno.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.println("-------------------");
            System.out.println("Perusahan ke-"+(i+1));
            System.out.println("-------------------");
            System.out.print("Masukkan jumlah bulan : ");
            int elm = retno.nextInt();
            
    Sum sm = new Sum (elm);
        
        for (int j = 0; j < sm.elemen; j++) {
            System.out.print("Masukkan untung bulan ke-"+(j+1)+" = ");
            sm.keuntungan[j]= retno.nextDouble();
        }
        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.printf("Total keuntugan perusahan selama "+ sm.elemen +" bulan adalah = %.2f juta\n",sm.totalBF(sm.keuntungan));
        System.out.println("============================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.printf("Total keuntugan perusahan selama "+ sm.elemen +" bulan adalah = %.2f juta\n",sm.totalDC(sm.keuntungan,0,sm.elemen-1));
        System.out.println("============================================================");
    }
}
}
