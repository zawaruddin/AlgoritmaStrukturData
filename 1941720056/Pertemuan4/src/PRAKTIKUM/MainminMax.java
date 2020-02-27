package PRAKTIKUM;
import static PRAKTIKUM.minMax.max_min;
import java.util.Scanner;
public class MainminMax {
    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];
        ppArray[0] = new minMax();
        
        Scanner retno = new Scanner (System.in);
        
        for (int i = 0; i < 5; i++) {
            ppArray[i] = new minMax();
            System.out.print("Nilai array indeks ke-"+i+" : ");
            ppArray[i].nilaiArray = retno.nextInt();
        }
//       int min = ppArray[0].nilaiArray;
//        int max = ppArray[0].nilaiArray;
//        for (int i = 0; i < 5; i++) {
//            if(ppArray[i].nilaiArray<min)
//                min = ppArray[i].nilaiArray;
//            else if (ppArray[i].nilaiArray>max)
//                 max = ppArray[i].nilaiArray;
//    }
        int arr[] = new int [5];
        for (int i = 0; i < 5; i++) {
            arr[i] = ppArray[i].nilaiArray;
        }
        System.out.println();
        minMax arrMN = new minMax();
        arrMN.miniMax (arr,5);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nilai indeks ["+i+ "] "+ppArray[i].nilaiArray);
        }
        System.out.println();
        System.out.println("Brute Force");
        System.out.println("Nilai minimal : "+ arrMN.hasilmin());
        System.out.println("Nilai maximal : "+ arrMN.hasilmax());
        
    
        maxMin hasil = new maxMin ();
        
        max_min(arr,0,4,hasil);
        
        System.out.println();
        System.out.println("Divide Conquer");
        System.out.println("Nilai Minimal : "+hasil.minimum+" \nNilai Maksimal : "+hasil.maximum);
        System.out.println("\n");
    }
    
}
