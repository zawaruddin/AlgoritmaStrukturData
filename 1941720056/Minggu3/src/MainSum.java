import java.util.Locale;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
    Scanner retno = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("======================================");
    System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9 : ");
    System.out.print("Masukkan jumlah bulan : ");
    int elm = retno.nextInt();
    
    Sum sm = new Sum (elm);
        System.out.println("==================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke-"+(i+1)+" = ");
            sm.keuntungan[i]= retno.nextDouble();
        }
        System.out.println("==================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntugan perubahan selama"+ sm.elemen +" bulan "+sm.totalBF(sm.keuntungan));
        System.out.println("==================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntugan perubahan selama"+ sm.elemen +" bulan "+sm.totalDC(sm.keuntungan,0,sm.elemen-1));
    }
}
