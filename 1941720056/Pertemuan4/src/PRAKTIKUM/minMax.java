package PRAKTIKUM;
public class minMax {
    public  int nilaiArray,min,max;
    
    void miniMax (int [] arr , int n){
        min = arr[0];
        max = arr[0];
        
        for (int i = 0; i < n; i++) {
            if (arr[i]<min){
                min = arr[i];
            }else if (arr[i]>max){
                max = arr[i];
            }
        }
    }
     
    int hasilmin(){
        return min;
    }
    int hasilmax(){
        return max;
    }
    
    public static void max_min(int [] arr,int indeks_awal,int indeks_akhir,maxMin hasil) {
        int indeks_tengah;
        maxMin hasil1 = new maxMin();
        maxMin hasil2 = new maxMin();
        
        if(indeks_awal == indeks_akhir){
            hasil.minimum = hasil.maximum = arr[indeks_awal];
        }else if(indeks_akhir - indeks_awal == 1){
            if (arr[indeks_awal]>arr[indeks_akhir]){
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            }else {
                hasil.minimum = arr[indeks_awal];
                hasil.maximum = arr[indeks_akhir];
            }
        }else {
            indeks_tengah =  (indeks_awal + indeks_akhir)/2;
            max_min(arr,indeks_awal,indeks_tengah,hasil1);
            max_min(arr,indeks_tengah + 1, indeks_akhir ,hasil2);
            
            hasil.minimum = (hasil1.minimum < hasil2.minimum ) ? hasil1.minimum : hasil2.minimum;
            hasil.maximum = (hasil1.maximum > hasil2.maximum ) ? hasil1.maximum : hasil2.maximum;
        }
    }
    
    
 
    
   
}
