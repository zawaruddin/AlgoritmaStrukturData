package Praktikum;
import static Praktikum.minMax.max_min;
import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class MainminMax {
    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];
        ppArray[0] = new minMax();
        Scanner aula = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.println("Nilai array indeks ke-" + i);
            System.out.print("Masukkan nilai : ");
            ppArray[i].nilaiArray = aula.nextInt();
        }
        for (int i=0;i<5;i++){
            System.out.println("Nilai yang dimasukkan pada indeks ["+i+"] adalah : "+ppArray[i].nilaiArray);
        }
        int arr[]=new int[5];
        for (int i=0;i<5;i++){
        arr[i] = ppArray[i].nilaiArray;
        }
        minMax a = new minMax();
        a.minMax(arr, 5);
//        int min = ppArray[0].nilaiArray;
//        int max = ppArray[0].nilaiArray;
//        for (int i = 0; i < 5; i++) {
//            if (ppArray[i].nilaiArray < min) 
//                min = ppArray[i].nilaiArray;
//             else if (ppArray[i].nilaiArray > max) 
//                max = ppArray[i].nilaiArray;
//            
//        }
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal : " + a.min );
        System.out.println("Nilai Maksimal : " + a.max);
    
   
        Maxmin hasil = new Maxmin ();
        
        max_min (arr, 0, 4, hasil);
        
        System.out.println("Divide Conquer");
        System.out.print("Nilai Minimal : "+ hasil.minimum + "\nNilai Maksimal : "+hasil.maximum);
        System.out.print("\n");
    }
}
