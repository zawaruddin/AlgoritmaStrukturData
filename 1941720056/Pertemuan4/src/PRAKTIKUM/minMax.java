package PRAKTIKUM;
public class minMax {
    public  int nilaiArray,min,max;
    
    void miniMax (int [] arr , int n){
        min = arr[0];                                                               // O(1)
        max = arr[0];                                                               // O(1)  
        
        for (int i = 0; i < n; i++) {                                               // O(n)
            if (arr[i]<min){
                min = arr[i];                                                       // O(1)
            }else if (arr[i]>max){                          
                max = arr[i];                                                       // O(1)
            }
        }
    }
     
    int hasilmin(){
        return min;                                                                 // O(1)
    }
    int hasilmax(){
        return max;                                                                 // O(1)
    }
    
    public static void max_min(int [] arr,int indeks_awal,int indeks_akhir,maxMin hasil) {
        int indeks_tengah;
        maxMin hasil1 = new maxMin();
        maxMin hasil2 = new maxMin();
        
        if(indeks_awal == indeks_akhir){
            hasil.minimum = hasil.maximum = arr[indeks_awal];                       // O(1)
        }else if(indeks_akhir - indeks_awal == 1){
            if (arr[indeks_awal]>arr[indeks_akhir]){
                hasil.minimum = arr[indeks_akhir];                                  // O(1)
                hasil.maximum = arr[indeks_awal];                                   // O(1)
            }else {
                hasil.minimum = arr[indeks_awal];                                   // O(1)
                hasil.maximum = arr[indeks_akhir];                                  // O(1)
            }
        }else {
            indeks_tengah =  (indeks_awal + indeks_akhir)/2;                        // O(1)
            max_min(arr,indeks_awal,indeks_tengah,hasil1);                          // O(2^n)
            max_min(arr,indeks_tengah + 1, indeks_akhir ,hasil2);
            
            hasil.minimum = (hasil1.minimum < hasil2.minimum ) ? hasil1.minimum : hasil2.minimum; // O(1)
            hasil.maximum = (hasil1.maximum > hasil2.maximum ) ? hasil1.maximum : hasil2.maximum;// O(1)
        }
        // maka banyaknya operasi tersebut adalah :
        // = 1+1+(n*1*1)+1+1+1+1+(1*1)+(1*1)+(1*(2^n))+1+1
        // = 2+n+3+1+1+2^n+2
        // maka Big O = O(2^n)
    }
    
    
 
    
   
}
