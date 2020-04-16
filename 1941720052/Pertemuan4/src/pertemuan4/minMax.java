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
public class minMax {

    public int nilaiArray, min, max;                                                                    //~     
    void minMax(int arr[], int n) {                                                             
        min = arr[0];                                                                                  //O(1)
        max = arr[0];                                                                                  //O(1)

        for (int a = 0; a < 5; a++) {                                                                  //O(n)=O(5)
            if (arr[a] < min) {                                                                        //~
                min = arr[a];                                                                          //O(1)
            } else if (arr[a] > max) {                                                                 //~
                max = arr[a];                                                                          //O(1)
            }
        }
    }
    int max(){                                                                                        //~
        return max;                                                                                   //O(1)
    }
    int min(){                                                                                       //~
        return min;                                                                                  //O(1)
    }

    public static void max_min(int arr[], int indeks_awal, int indeks_akhir, Maxmin hasil) {
        int indeks_tengah;                                                                           //~
        Maxmin hasil1 = new Maxmin();                                                                //~
        Maxmin hasil2 = new Maxmin();                                                                //~

        if (indeks_awal == indeks_akhir) {                                                          //O(1)
            hasil.minimum = hasil.maximum = arr[indeks_awal];                                       //O(1)
        } 
        else if (indeks_akhir - indeks_awal == 1) {                                                 
            if (arr[indeks_awal] > arr[indeks_akhir]) {
                hasil.minimum = arr[indeks_akhir];                                                  //O(1)
                hasil.maximum = arr[indeks_awal];                                                   //O(1)
            } else {
                hasil.minimum = arr[indeks_awal];                                                   //O(1)
                hasil.maximum = arr[indeks_akhir];                                                  //O(1)
            }
        } 
        else {                                                                                      //O(2^n)    
            indeks_tengah = (indeks_awal + indeks_akhir) / 2;                                       //O(1)
            max_min(arr, indeks_awal, indeks_tengah, hasil1);                                       //O(1)
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);                                  //O(1)

            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum;    //O(1)
            hasil.maximum = (hasil.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum;     //O(1)
        }

    }

}
