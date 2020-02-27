package minggu4;
import java.util.Scanner;
import static minggu4.minMax.max_min;

public class minMaxMain {

    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];
        
        int nilaiArray[] =  new int[5];
        Scanner dhimas = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.println("Nilai array indeks ke-" + i);
            System.out.print("Masukkan nilai: ");
            nilaiArray[i] = dhimas.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            ppArray[i].minmaxBF(nilaiArray);
        }
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal: " + ppArray[0].minimum);
        System.out.println("Nilai Maksimal: " + ppArray[0].maximum);
        
        Maxmin hasil = new Maxmin();
        max_min(nilaiArray, 0, 4, hasil);

        System.out.println("Divide Conquer");
        System.out.print("Nilai Minimal: " + hasil.minimum + "\nNilai Maksimal: " + hasil.maximum);
        System.out.println("\n");
    }
}








//        int min = ppArray[0].nilaiArray;
//        int max = ppArray[0].nilaiArray;
//        for (int i = 0; i < 5; i++) {
//            if (ppArray[i].nilaiArray < min) {
//                min = ppArray[i].nilaiArray;
//            } else if (ppArray[i].nilaiArray > max) {
//                max = ppArray[i].nilaiArray;
//            }
//        }