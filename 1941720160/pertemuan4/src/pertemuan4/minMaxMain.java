package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author khoirul
 */
public class minMaxMain {
    public static void main(String[] args){
    minMax[] ppArray=new minMax[5];
    ppArray[0]=new minMax();
    
    Scanner irul=new Scanner(System.in);
    
    for (int i=0; i<5; i++){
        ppArray[i]=new minMax();
        System.out.println("Nilai array indeks ke-"+i);
        System.out.print("Masukkan Nilai: ");
        ppArray[i].nilaiArray=irul.nextInt();
    }
    
    int min=ppArray[0].nilaiArray;
    int max=ppArray[0].nilaiArray;
    
    for (int i=0; i<5; i++){
        if(ppArray[i].nilaiArray<min)
            min=ppArray[i].nilaiArray;
        else if(ppArray[i].nilaiArray>max)
            max=ppArray[i].nilaiArray;
    }
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal: "+min);
        System.out.println("Nilai Maksimal: "+max);
        
        int arr[]=new int[5];
        for(int i=0; i<5; i++){
            arr[i]=ppArray[i].nilaiArray;
        }
        Maxmin hasil=new Maxmin();
        minMax.max_min(arr, 0, 4, hasil);
        
        System.out.println("Divide Conquer");
        System.out.print("Nilai Minimal: "+hasil.minimum+"\nNilai Maksimal: "+hasil.maximum);
        System.out.print("\n");
    }
}