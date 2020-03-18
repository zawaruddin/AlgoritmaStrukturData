package sort;

public class SequentialSearch {
    
   static void seqSearch(int Arr[], int x){
       int i, dataCari = x;
       i = 0;
       while (Arr[i]!=dataCari && i<Arr.length){
           i=i+1;
       }
       if(Arr[i]==dataCari){
           System.out.println(dataCari+" ditemukan pada indeks ke-"+i);
       }else{
           System.out.println(dataCari+" tidak ditemukan");
       }
   } 
    public static void main(String[] args) {
        int arr[] = {20,35,14,7,67,89,23,46};
        seqSearch(arr,35);
    }
}
