package TugasJobSheet8;

import java.util.Scanner;

public class kataTerbalikMain {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        System.out.print("Masukkan kalimat  : ");
        String kalimat = dhimas.nextLine();
        kataTerbalik kT = new kataTerbalik(kalimat);
        kT.tukar();
        kT.print();
        
    }
}
