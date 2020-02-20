import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner retno = new Scanner(System.in);
        long mulai,berakhir;
        
        System.out.println("======================================");
        System.out.print("Maskkan jumlah elemen yang ingin dhitung : ");
        int elemen = retno.nextInt();
        
        Faktorial [] fk = new Faktorial [elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial ();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = retno.nextInt();
        }
        
        mulai = System.nanoTime();
        System.out.println("=====================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));           
        }
        berakhir = System.nanoTime();
        System.out.println("Durasi yang dibutuhkan selama pemrosesan : "+ ((berakhir-mulai)/1000000.0)+ " millsecond");
       
        
        mulai = System.nanoTime();
        System.out.println("=====================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
        }
        berakhir = System.nanoTime();
          System.out.println("Durasi yang dibutuhkan selama pemrosesan : "+ ((berakhir-mulai)/1000000.0)+ " millsecond");      
        System.out.println("=====================================");
    }  
}
