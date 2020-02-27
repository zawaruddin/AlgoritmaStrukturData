/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
import static pertemuan4.minMax.max_min;
public class MainMinMax {
    public static void main(String[] args) {
        minMax ppArray[] = new minMax[5];
        ppArray[0] = new minMax();
        Scanner luluk = new Scanner(System.in);
        
        for(int a=0; a<5; a++){
            ppArray[a] = new minMax();
            System.out.println("Nilai array indeks ke-"+a);
            System.out.print("Masukkan nilai: ");
            ppArray[a].nilaiArray = luluk.nextInt();
        }
        for(int a=0; a<5; a++){
            System.out.println("Nilai pada indeks ke-["+a+"] adalah "+ppArray[a].nilaiArray);
        }
//        int min = ppArray[0].nilaiArray;
//        int max = ppArray[0].nilaiArray;
//        for (int a = 0; a < 5; a++) {
//            if (ppArray[a].nilaiArray < ppArray[a].min) {
//                ppArray[a].min = ppArray[a].nilaiArray;
//            } else if (ppArray[a].nilaiArray > ppArray[a].max) {
//                ppArray[a].max = ppArray[a].nilaiArray;
//            }
//        }
        int arr[] = new int[5];
        for(int a=0; a<5; a++){
            arr[a] = ppArray[a].nilaiArray;
        }
        
        minMax x = new minMax();
        x.minMax(arr, 5);
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal : "+x.min);
        System.out.println("Nilai Maksimal : "+x.max);
        
        
        Maxmin hasil = new Maxmin();
        
        max_min(arr,0,4,hasil);
        
        System.out.println("Divide Conquer");
        System.out.print("Nilai Minimal: "+hasil.minimum+"\nNilai Maksimal: "+hasil.maximum);
        System.out.print("\n");
    }
}

