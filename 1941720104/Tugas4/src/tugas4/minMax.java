/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Daffa Cahyo
 */
import java.util.Scanner;
public class minMax {

    public int nilaiArray, min, max;
    
    static Scanner daffa = new Scanner(System.in);
    
    void minMax(int arr[], int n){
        min = arr[0];
        max = arr[0];
        
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            else if(arr[i] < min){
                min = arr[i];
            }
        }
    }
    
    int max(){
        return max;
    }
    
    int min(){
        return min;
    }
        public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, maxMin hasil) {
        int indeks_tengah;
        maxMin hasil1 = new maxMin();
        maxMin hasil2 = new maxMin();

        if (indeks_awal == indeks_akhir) {
            hasil.minimum = hasil.maximum = arr[indeks_awal];
        } else if (indeks_akhir - indeks_awal == 1) {
            if (arr[indeks_awal] > arr[indeks_akhir]) {
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            } else {
                hasil.minimum = arr[indeks_awal];
                hasil.maximum = arr[indeks_akhir];
            }
        } else {
            indeks_tengah = (indeks_awal + indeks_akhir) / 2;
            max_min(arr, indeks_awal, indeks_tengah, hasil1);
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);

            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum;
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum;
        }
    }
}
//Jumlah Operasi: 1 + 1 + (n * 1 * 1) + 1 + 1 + 1 + (1 * 1) + (1 * 1) + (1 * (2 ^ n)) + 1 + 1
//              : 2 + n + 3 + 1 + 1 + 2 ^ n +2
//              : 9 + 2 ^ n + n Operasi
//Notasi BigO   : O(2 ^ n)