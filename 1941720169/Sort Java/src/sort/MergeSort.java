package sort;

public class MergeSort {
    static void merge(int arr[],int l, int m, int r){
        int i,j,k;
        int n1 = m-l+1;
        int n2 = r-m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(i=0;i<n1;i++){
            L[i] = arr[l+i];
        }
        for(j = 0; j<n2;j++){
            R[j] = arr[m+1+j];
        }
        
        i = 0;
        j = 0;
        k = 1;
        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void ntah(int arr[],int l, int r){
        if(l<r){
            int mid = l+(r-l)/2;
            
            ntah(arr,l,mid);
            ntah(arr,mid+1,r);
            
            merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {20,35,14,7,67,89,23,46};
        
        ntah(arr,0,arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
