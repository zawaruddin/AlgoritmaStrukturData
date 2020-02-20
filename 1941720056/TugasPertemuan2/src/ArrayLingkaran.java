import java.util.Scanner;
public class ArrayLingkaran {
    static Scanner retno = new Scanner (System.in);
    
    public static void main(String[] args) {
        Lingkaran[]arrLkr = new Lingkaran[5];
        
        for (int i = 0; i < 5; i++) {
            arrLkr[i] = new Lingkaran();
            System.out.print("Masukkan jari-jari lingkaran ke-"+i+" : ");
            arrLkr[i].jari_jari = retno.nextDouble();
            arrLkr[i].PHI = 3.14;
        }
        System.out.println();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Lingkaran ke-"+i);
            System.out.println("Luas lingkaran : "+arrLkr[i].hitungLuas(arrLkr[i].jari_jari,arrLkr[i].PHI));
            System.out.println("Keliling lingkaran : "+ arrLkr[i].hitungKeliling(arrLkr[i].PHI, arrLkr[i].jari_jari));
            System.out.println("---------------------------------------------------------------------");
            
        }   
    }
}
