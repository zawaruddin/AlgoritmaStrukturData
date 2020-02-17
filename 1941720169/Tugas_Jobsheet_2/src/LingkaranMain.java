import java.util.Scanner;
public class LingkaranMain {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Lingkaran lk = new Lingkaran();
        
        System.out.print("Masukkan panjang jari-jari: ");
        lk.r = dhimas.nextInt();
        lk.PHI = 3.14;
        System.out.println("Luas lingkaran dengan r: "+lk.r+" adalah "+lk.hitungLuas());
        System.out.println("Keliling lingkaran dengan r: "+lk.r+" adalah "+lk.hitungKeliling());
    }
}
