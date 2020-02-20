package minggu3;
import java.util.Scanner;

public class MainFaktorial {
    
    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = dhimas.nextInt();
        
        Faktorial[] fk = new Faktorial[elemen];
        for (int i=0;i<elemen;i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+": ");
            fk[i].nilai = dhimas.nextInt();
        }
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan nilai brute force");
        
        long start = System.nanoTime();
        for(int i =0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah "+fk[i].faktorialBF(fk[i].nilai));
        }
        long end = System.nanoTime();
        System.out.println("Waktu " + (end - start)+" nanoseconds");
        
        System.out.println("=====================================================");
        System.out.println("Hasil Faktorial dengan nilai Divine and Conquer");
        long start1 = System.nanoTime();
        for(int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah "+fk[i].faktorialBF(fk[i].nilai));
        }
        long end1 = System.nanoTime();
        System.out.println("Waktu " + (end1 - start1)+ " nanoseconds");
        System.out.println("=====================================================");
    }
}
