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
    public static void main(String[] args) {                                                        //~
        minMax ppArray[] = new minMax[5];                                                           //O(1) 
        ppArray[0] = new minMax();                                                                  //O(1)
        Scanner luluk = new Scanner(System.in);                                                     //O(1)
        
        for(int a=0; a<5; a++){                                                                     //O(n)=O(5)
            ppArray[a] = new minMax();                                                              //~
            System.out.println("Nilai array indeks ke-"+a);                                         //O(1)
            System.out.print("Masukkan nilai: ");                                                   //O(1)
            ppArray[a].nilaiArray = luluk.nextInt();                                                //O(1)
        }
        for(int a=0; a<5; a++){                                                                     //O(n)=O(5)
            System.out.println("Nilai pada indeks ke-["+a+"] adalah "+ppArray[a].nilaiArray);       //O(1)
        }

        int arr[] = new int[5];                                                                     //O(1)
        for(int a=0; a<5; a++){                                                                     //O(n)=O(5)
            arr[a] = ppArray[a].nilaiArray;                                                         //O(1)
        }
        
        minMax x = new minMax();                                                                    //O(1)
        x.minMax(arr, 5);                                                                           //O(1)
        System.out.println("Brute Force");                                                          //O(1)
        System.out.println("Nilai Minimal : "+x.min);                                               //O(1)
        System.out.println("Nilai Maksimal : "+x.max);                                              //O(1)
        
        
        Maxmin hasil = new Maxmin();                                                               //O(1)
        
        max_min(arr,0,4,hasil);                                                                    //O(1)
        
        System.out.println("Divide Conquer");                                                     //O(1)
        System.out.print("Nilai Minimal: "+hasil.minimum+"\nNilai Maksimal: "+hasil.maximum);     //O(1)
        System.out.print("\n");                                                                   //O(1)
    }
}

