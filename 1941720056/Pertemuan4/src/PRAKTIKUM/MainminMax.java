package PRAKTIKUM;
import static PRAKTIKUM.minMax.max_min;
import java.util.Scanner;
public class MainminMax {
    public static void main(String[] args) {
        minMax[] ppArray = new minMax[5];                                           // O(1)
        ppArray[0] = new minMax();                                                  // O(1)
        
        Scanner retno = new Scanner (System.in);                                    // O(1)
        
        for (int i = 0; i < 5; i++) {                                               // n=5 ,O(5)
            ppArray[i] = new minMax();                                              // O(1)
            System.out.print("Nilai array indeks ke-"+i+" : ");                     // O(1)
            ppArray[i].nilaiArray = retno.nextInt();                                // O(1)
        }
        for (int i = 0; i < 5; i++) {                                               // n=5 ,O(5)
            System.out.println("Nilai indeks ["+i+"] "+ppArray[i].nilaiArray );     // O(1)
        }
        int arr[] = new int [5];                                                    // O(1)
        for (int i = 0; i < 5; i++) {                                               // O(5)
            arr[i] = ppArray[i].nilaiArray;                                         // O(1)
        }
        
        minMax arrMN = new minMax();                                                // O(1)                                                          
        arrMN.miniMax (arr,5);                                                      // O(1)
        

        System.out.println("Brute Force");                                                          //O(1)
        System.out.println("Nilai minimal : "+ arrMN.hasilmin());                                   //O(1)
        System.out.println("Nilai maximal : "+ arrMN.hasilmax());                                   //O(1)
        
    
        maxMin hasil = new maxMin ();                                                               //O(1)
        
        max_min(arr,0,4,hasil);                                                                     //O(1)
        
       
        System.out.println("Divide Conquer");                                                       //O(1)
        System.out.println("Nilai Minimal : "+hasil.minimum+" \nNilai Maksimal : "+hasil.maximum);  //O(1)
        System.out.println("\n");                                                                   //O(1)
    }
    // Banyaknya operasi 
    // =1+1+1+(5*1*1)+(5*1)+1+(5*1)+1+1+1+1+1+1+1+1+1+1
    // = 3+5+5+1+5+10
    // = 29 operasi
    // maka,notasi Big O 
    // = O(n)+O(n)+O(n)
    // = 3*O(n)
    // = 3*O(5)
    // = 15
}
